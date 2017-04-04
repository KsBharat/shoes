package com.test.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.Customer;
import com.test.model.UserDetails;
import com.test.model.UserDetails1;
import com.test.model.VW_XMAP_PS;
import com.test.service.CustomerService;
import com.test.service.UserDetailsService;
import com.test.service.VW_XMAP_PSService;

@Controller
public class MyController {
	@Autowired
	private UserDetailsService userservice;
	@Autowired
	private CustomerService customerservice;
	
	
	
	@RequestMapping("/")
	public String displayhomepage(Model m)
	{
		//List<VW_XMAP_PS> v = vw.view();
		List<VW_XMAP_PS> v= vw.getbestpriceproducts();
		Customer cust=new Customer();
		m.addAttribute("customerObject",cust);
		m.addAttribute("view",v);
		/*m.addAttribute("name","shoes");*/
		
		System.out.print("\n welcome(controller 1)");
		
		return "welcome";
	}
	@RequestMapping("/welcome")
	public String displayhomepage1(Model m)
	{
		List<VW_XMAP_PS> v= vw.getbestpriceproducts();
		//List<VW_XMAP_PS> v = vw.view();
	m.addAttribute("view",v);
		//System.out.println("/n refreshed shoes.welcome");
		return "welcome";
	}
	
	
	/*@RequestMapping("/reqsignin")// to login
				public String displaysiginpage(Model m)
		{
					m.addAttribute("userdetails",new UserDetails());
					System.out.print("\n sigin");
					return "siginpage";
		}*/
	
		
	
	
	@RequestMapping("/reqsignuppage") // to register
	public String displaysignuppage(Model m)
	{
		
		m.addAttribute("userdetails",new UserDetails());
		System.out.print("\n signup");
		
		return "signuppage";
	}
	
	
	@RequestMapping("/adduserdatatodb")
	public String adduserdetailstodb(@Valid @ModelAttribute("userdetails")UserDetails ud,Model m,BindingResult result)
	{
		if(result.hasErrors()){
			return "signuppage";
		
		}
		else{
	String uid = userservice.adduserdetails(ud);
		m.addAttribute("message", "Signup successfull. Use " + uid + " for login...");
		m.addAttribute("userdetails", new UserDetails());
		return "loginpage";
		}
		
		
		
	}
	
	
	/*@RequestMapping("/logincheck")
	public String logincheck1(@ModelAttribute("userdetails")UserDetails1 ud,Model m,HttpSession hsession)
	{
		
		UserDetails1 du=userservice.logincheck(ud);
		if(du==null){
			m.addAttribute("message","authentication failed");
		return "siginpage";

		
		}
		
		
		else{
			hsession.setAttribute("loginuser",ud.getFirstname());
			hsession.setAttribute("id",ud.getUserid());
				if(du.getRole().equals("ROLE_ADMIN")){
					
					//m.addAttribute("username",hsession.getAttribute("loginuser"));
					//m.addAttribute("userimage",hsession.getAttribute("id"));
					//m.addAttribute("username",ud.getFirstname());
					return "successadmin";
				}
				else{
					
					//m.addAttribute("username",hsession.getAttribute("loginuser"));
					//m.addAttribute("userimage",hsession.getAttribute("id"));
					//m.addAttribute("username",ud.getFirstname());
					return "successuser";
				}
		}
					

				
		}		
*/		
			
		
	
	@Autowired
	public VW_XMAP_PSService vw;
	
	@RequestMapping("/view")
	public String view(Model m,HttpSession hsession)
	{
	//	List<VW_XMAP_PS> v = vw.view();
		List<VW_XMAP_PS> v= vw.getbestpriceproducts();
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		m.addAttribute("view",v);
		return "view";
	}
	
	
	
@RequestMapping("/reqspringloginpage")
public String springcheck()

{
	return "loginpage";
}


/*@RequestMapping("/loginCheck1")
public String LoginCheck(Principal principal,HttpSession hsession,Model m)
{
	//System.out.println("\nName:"+ principal.getName());
	Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
	String userrole=authentication.getAuthorities().toString().substring(1,10);
	//System.out.println("\n Role:"+userrole);
	
	
	
	UserDetails ud=userservice.getUserById(principal.getName());
	hsession.setAttribute("loginuser",ud.getUserid());
	hsession.setAttribute("id",ud.getUserid());
	m.addAttribute("role:",ud.getRole());
	
	if(userrole.equals("ROLE_USER")){
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "successuser";
	}
	else{
		m.addAttribute("username",hsession.getAttribute("loginuser"));
		m.addAttribute("loginid",hsession.getAttribute("id"));
		return "successadmin";
	}
	
}
*/


@RequestMapping("/reqLogout")
public String displayHomepage(){
	return "redirect:/welcome";
}
	
/*@RequestMapping("//j_spring_security_logout")
public String displayHomepage1(){
	return "redirect:/welcome";

	}*/
	
}
	

	