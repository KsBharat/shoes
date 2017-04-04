package com.test.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.BillingAddress;
import com.test.model.Cart;
import com.test.model.CartItem;
import com.test.model.Customer;
import com.test.model.UserDetails;
import com.test.model.UserDetails1;
import com.test.model.VW_XMAP_PS;
import com.test.model.Xmapproductsuppliers;
import com.test.service.CartItemService;
import com.test.service.CartService;
import com.test.service.CustomerService;
import com.test.service.UserDetails1Service;
import com.test.service.VW_XMAP_PSService;
import com.test.service.Xmapproductsupplierservice;
@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerservice;
	
	@Autowired
	private UserDetails1Service userdetails1service;
	
	@Autowired
	private CartService cartservice;
	
	@Autowired
	private VW_XMAP_PSService vwxmappsservice;
	
	@Autowired
	private CartItemService cartitemservice;
	
	@Autowired
	private Xmapproductsupplierservice xmapproductsupplier;
	
	
	
	@RequestMapping("/customersignupnew")
	public String displaycustomersignup(Model m){
		m.addAttribute("customerdetails",new Customer());
		return "customersignup1";
	}
	@RequestMapping("/addcustomertodb")
	  public String addcustomertodb(@ModelAttribute("customerdetails")Customer c,Model m,BindingResult result)
	  {
	/*	if (result.hasErrors())
		{
			
			return "customersignup1";
		}
		else
		{
			
			
			String cid=customerservice.addcustomers(c);
			m.addAttribute("message", "Signup successfull. Use " + cid + " for login...");
			m.addAttribute("customer", new Customer());
		
		return "loginpage";
	  
		}*/
		BillingAddress bladd= new BillingAddress();
		bladd.setHouseno(c.getShippingAddress().getHouseno());
		bladd.setArea(c.getShippingAddress().getArea());
		bladd.setStreet(c.getShippingAddress().getStreet());
		bladd.setCity(c.getShippingAddress().getCity());
		bladd.setPincode(c.getShippingAddress().getPincode());
		bladd.setState(c.getShippingAddress().getState());
		bladd.setCountry(c.getShippingAddress().getCountry());
		c.setBillingaddress(bladd);
		c.setCart(new Cart());
		
		customerservice.addcustomers(c);
		return "redirect:/reqspringloginpage";
		
	  }
	
	@RequestMapping("/loginCheck1")
	public String LoginCheck(Principal principal,HttpSession hsession,Model m)
	{
		//System.out.println("\nName:"+ principal.getName());
		Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		String userrole=authentication.getAuthorities().toString().substring(1,10);
		System.out.println("\n Role:"+userrole);
		System.out.println("\nName : " + principal.getName());	
		
		
		
		
		UserDetails1 ud=userdetails1service.getUserbyId(principal.getName());
		Customer cust=customerservice.getcustomerbyUserid(ud.getUserid());
		hsession.setAttribute("loginuser",ud.getUserid());
		hsession.setAttribute("id",ud.getUserid());
		m.addAttribute("role:",ud.getRole());
		
		if(userrole.equals("ROLE_USER")){
			Customer c=customerservice.getcustomerbyUserid(ud.getUserid());
			m.addAttribute("cartsize",c.getCart().getCartItems().size());
			m.addAttribute("username",hsession.getAttribute("loginuser"));
			m.addAttribute("loginid",hsession.getAttribute("id"));
			return "view";
		}
		else if(userrole.equals("ROLE_ADMI")) {
			/*m.addAttribute("username",hsession.getAttribute("loginuser"));
			m.addAttribute("loginid",hsession.getAttribute("id"));*/
			return "successadmin";
		}
		else
			return null;
	
		
	}
	
	@RequestMapping("additemstocart/{psid}")
	public String additemstocart(@PathVariable("psid")String psid,@RequestParam("qty")int qty,Principal principal,HttpSession hsession,Model m){
		System.out.println("psid: "+ psid + "qty:"+qty);
		
		String Userid=principal.getName();
		System.out.println(Userid);
		Customer customer = customerservice.getcustomerbyUserid(Userid);
		Cart cart=customer.getCart();
		Xmapproductsuppliers xmap=xmapproductsupplier.getxmapbypsid(psid);
		
		
		CartItem cartitem=new CartItem();
		
		cartitem.setCart(cart);
		cartitem.setXmapproductsuppliers(xmap);
		cartitem.setQuantity(qty);
		cartitem.setItemprice(xmap.getProductsupplierprice()*qty);
		/*cartitem.setItemwisetotal(xmap.getProductsupplierprice()*qty);*/
		
		
		cartitemservice.addcartitems(cartitem);
		
		
		Customer cust=customerservice.getcustomerbyUserid(Userid);
		Cart crt=cust.getCart();
		int cartitems=cartservice.getCartsize(crt);
		List<CartItem> cartsize=crt.getCartItems();
		int sum=0;
		
		for(CartItem fuck :cartsize){
			sum+=fuck.getItemprice();
		}
		crt.setGrandtotal(sum);
		cartservice.updatecart(crt);
		
		List<VW_XMAP_PS> xmapdata=vwxmappsservice.getbestpriceproducts();
		
			
		m.addAttribute("xmapdata",xmapdata);
		m.addAttribute("loginusername",hsession.getAttribute("loginusername"));
		m.addAttribute("loginuserid",hsession.getAttribute("loginuserid"));
		m.addAttribute("cartsize",cartsize);
		m.addAttribute("cartmesage","Item added to cart successfully");
		
		hsession.setAttribute("cartsize",cart);
		System.out.println("cart size:"+ cartsize);
		
		return "view";
		
		
		
		
		
		//return psid;
	
		
	}
	
	@RequestMapping("/reqdisplaycartproducts")
	public String displaycart(HttpSession hsession,Model m)
	{
		Customer cust= customerservice.getcustomerbyUserid(hsession.getAttribute("loginuserid").toString());
		Cart cart=cust.getCart();
		int cartsize=cartservice.getCartsize(cart);
		hsession.setAttribute("CartSize",cartsize);
		
		List<CartItem>cartitem=cart.getCartItems();
		int sum=0;
		
		for(CartItem fuck :cartitem){
			sum+=fuck.getItemprice();
		}
		cart.setGrandtotal(sum);
		cartservice.updatecart(cart);
		
		m.addAttribute("customerid",cust.getCustomerid());
		m.addAttribute("loginusername",hsession.getAttribute("loginusername"));
		m.addAttribute("loginuserid",hsession.getAttribute("loginuserid"));
		m.addAttribute("cartsize",cartsize);
		m.addAttribute("cartitems",cartitem);
		m.addAttribute("grandtotal",cart.getGrandtotal());
		
		
		
/////////////////////////////////////////
		return "displaycart";
		
	}
	
	@RequestMapping("/reqdeletecartitems/{cartitemid}")
	public String deletecartitembyid(@PathVariable ("cartitemid")String cartitemid,Principal p )
	{
		cartitemservice.deleteCartItem(cartitemid);
		return "redirect:/displaycart";
	}
	
	
	
	
	
	
	
	
}
