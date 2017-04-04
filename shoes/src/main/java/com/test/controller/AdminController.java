package com.test.controller;

import java.util.List;
import java.util.function.Supplier;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.model.Products;
import com.test.model.Suppliers;
import com.test.model.UserDetails1;
import com.test.model.VW_XMAP_PS;
import com.test.model.Xmapproductsuppliers;
import com.test.service.AdminProductsService;
import com.test.service.UserDetails1Service;
import com.test.service.VW_XMAP_PSService;
import com.test.service.Xmapproductsupplierservice;

@Controller
public class AdminController {
	
	
	
	@Autowired
	public AdminProductsService pds;
	
	
	
	
	
	@RequestMapping("/addproducts")
	public String addproductsadmin(Model m,HttpSession hsession)
	{
		System.out.println("before adding");
		m.addAttribute("productsobj",new Products());
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "adminaddproducts";
	}
	
	
	
	@RequestMapping("/addproductstodb")
	public String addproductstoadmin(@ModelAttribute("productsobj")Products pd,Model m,HttpSession hsession )
	{
	System.out.println("jsp");	
		pds.addproductdetailstodb(pd);
		m.addAttribute("ab",pd);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		System.out.println("after adding");
		return "redirect:/displayproducts";
		
		
	}
	@RequestMapping("/displayproducts")
	public String getproductdetailsadmin(Model m,HttpSession hsession)
	{
		List<Products> ab=pds.getproductdetails();	
		m.addAttribute("pord",ab);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "displayproductsadmin";
	}
	
					  	
	@RequestMapping("/addsuppliers")
	public String addpsupplierstodb(Model m,HttpSession hsession)
	{
		m.addAttribute("suppliersobj",new Suppliers());
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "adminaddsupplier";
	}
	
	@RequestMapping("/addsupplierstodb")
	public String addsupplierstodb(@ModelAttribute("suppliersobj")Suppliers sd,Model m,HttpSession hsession)
	{
		pds.addsupplierdetailstodb(sd);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "redirect:/displaysuppliers";
	}
	@RequestMapping("/displaysuppliers")
	public String getsupplierdetails(Model m,HttpSession hsession)
	{
		List<Suppliers> sd=pds.getsupplierdetails();
		m.addAttribute("sup",sd);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "displaysuppliersadmin";
	}
	
	@RequestMapping("/reqdeleteproduct")
	public String deleteproduct(@RequestParam("pid")String pid,HttpSession hsession,Model m)
	{
	pds.deleteproduct(pid);
	m.addAttribute("username",hsession.getAttribute("loginuser"));
	m.addAttribute("loginid",hsession.getAttribute("id"));
	return "redirect:/displayproducts";
	}
	/*@RequestMapping("/displayxmap")
	public String getxmap(Model m)
	{
		List<Xmapprodu
		m.addAttribute("xs",xp);
		return "displayxmap";
	}*/
	@RequestMapping("/reqdeletesupplier")
	public String deletesupplier(@RequestParam("sid")String sid,HttpSession hsession,Model m)
	{
		pds.deletesupplier(sid);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "displaysuppliersadmin";
	}
	
	@RequestMapping("/xmap")
	public String adddatatoxmap(Model m,HttpSession hsession)
	{
	List<Products> pd=pds.getproductdetails();
	List<Suppliers> sup=pds.getsupplierdetails();
	m.addAttribute("product",pd);
	m.addAttribute("supplier",sup);
	m.addAttribute("xmapobj",new Xmapproductsuppliers());
	m.addAttribute("username",hsession.getAttribute("loginuser"));
	m.addAttribute("loginid",hsession.getAttribute("id"));
	return "xmapaddingproducts";
	}
	
	
	@Autowired
	public Xmapproductsupplierservice xm;
	@RequestMapping("/xmaptodb")
	public String xmapprodsupp(@ModelAttribute("xmapobj")Xmapproductsuppliers x,Model m ,HttpSession hsession)
	{
	System.out.println("xmap");	
		xm.xmapprodsupp(x);
		m.addAttribute("xmap",x);
		m.addAttribute("xmapobj",new Xmapproductsuppliers());
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		System.out.println("after adding");
		return "redirect:/xmap";
	
	}
	
	@RequestMapping("/displayxmap")
	public String displayxmap(HttpSession hsession,Model m)
	{
	List<Xmapproductsuppliers> x = xm.getxmap();
	m.addAttribute("username",hsession.getAttribute("loginuser"));
	m.addAttribute("loginid",hsession.getAttribute("id"));
	m.addAttribute("ps",x);
	return "displayxmap";
	
	}
	@RequestMapping("/displayprosup")
	public String displayprosup(HttpSession hsession,Model m)
	{
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "displayxmap";
		
	}
	
	
	@RequestMapping("/reqeditproductpage")
	public String displayeditpage(@RequestParam("pid")String pid,HttpSession hsession,Model m){
		Products product = pds.getProductById(pid);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		m.addAttribute("productObj", product);
		return "editproductpage";
	}
	
	@RequestMapping("/editproductstodb")
	public String editProduct(@ModelAttribute("productObj")Products prd,HttpSession hsession,Model m){
		pds.editProduct(prd);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "redirect:/displayproducts";
	}
	@RequestMapping("/reqeditsupplier")
	public String displayeditpagesupplier(@RequestParam("sid")String sid,HttpSession hsession,Model m){
	Suppliers supplier=pds.getSupplierById(sid);
	m.addAttribute("supplierObj",supplier);
	return "editsupplierpage";
	}
	@RequestMapping("/reqeditsuppliertodb")
	public String editSupplier(@ModelAttribute("supplierObj")Suppliers sid,HttpSession hsession,Model m){
		pds.editSupplier(sid);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "redirect:/displaysuppliers";
	}
	
	@RequestMapping("/reqdeleteproductsupplier")
	public String deleteproductsupplier(@RequestParam("psid")String psi,HttpSession hsession,Model m)
	{
	
		xm.deleteproductsuppliers(psi);
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "redirect:/displayxmap";
	}
	
	@Autowired
	private UserDetails1Service userdetails1service;
	
	@RequestMapping("/displayusers")
	public String displayusers(Model m){
		List<UserDetails1> ud=userdetails1service.getAllUsers();
		m.addAttribute("userdata",ud);
		/*m.addAttribute("")*/
		return"displayusers";
	}
	
	@RequestMapping("/reqenableuser")
	public String enableuser(@RequestParam("uid")String usrid){
	userdetails1service.enableusers(usrid);
	return "redirect:/displayusers";
	}
	

	@RequestMapping("/reqdisableuser")
	public String disableuser(@RequestParam("uid")String usrid){
		userdetails1service.disableusers(usrid);
		return "redirect:/displayusers";
	}
}