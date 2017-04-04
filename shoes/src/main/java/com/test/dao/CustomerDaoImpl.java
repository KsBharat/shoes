package com.test.dao;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.BillingAddress;
import com.test.model.Cart;
import com.test.model.Customer;
import com.test.model.ShippingAddress;
import com.test.model.UserDetails;
import com.test.model.UserDetails1;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public String addcustomer(Customer c) {
		
		// TODO Auto-generated method stub
		Session ses=sessionFactory.openSession();
		c.setCustomerid(generateCustomerId());
		c.getUserDetails1().setUserid(generateuserid1());
		c.getBillingaddress().setBillingaddresssid(generatebillingaddressid());
		c.getShippingAddress().setShippingaddressid(generateshippindaddressid());
		c.getCart().setCartid(generatecartid());
		/*c.getEmailid();
		c.getFirstname();
		c.getLastname();
		c.getMobileno();*/
		c.getUserDetails1().setRole("ROLE_USER");
		c.getUserDetails1().setEnabled(true);
		ses.save(c);
		/*ses.flush();*/
		saveuserimagefile(c.getUserDetails1());
		return c.getCustomerid();
	}

	
		
		
		

	private void saveuserimagefile(UserDetails1 userDetails1) {
		// TODO Auto-generated method stub
		System.out.println("prd img : " + userDetails1.getUserimagefile());
	
		try{
			if(userDetails1.getUserimagefile()!=null){
				
				Path path=Paths.get("D:/workspace-dt/shoes/src/main/webapp/resources/images/users/"+userDetails1.getUserid()+".jpg");
						userDetails1.getUserimagefile().transferTo(new File(path.toString()));
				System.out.println("user image saved");
			}
		}
		catch(Exception ex){
			System.out.println("user image not saved");
				
			}
		}
	
	
	
		public Customer getcustomerbyuserid(String userid){
			
			Session ses=sessionFactory.openSession();
			Query q=ses.createQuery("from Customer where userid=?");
			q.setParameter(0,userid);
			Customer c=(Customer)q.uniqueResult();
			ses.flush();
			ses.close();
			return c;
			
			
		}
		





	@Transactional
	private String generateCustomerId(){	
		
			String newCid="";
			
			Session s = sessionFactory.openSession();
			Query qr = s.createQuery("from Customer");
			List<Customer> data = qr.list();
			s.close();
			if(data.size()==0){
				newCid="CUS00001";
			}
			else {			
				Session ss = sessionFactory.openSession();		
				Query q = ss.createQuery("select max(customerid) from Customer");
				String prevId = q.list().get(0).toString();
				System.out.print("\nExisting : "+prevId);
				int id = Integer.parseInt(prevId.substring(3));
				System.out.print("\nExisting id : "+id);		
				id=id+1;
				if(id<=9)
					newCid="CUS0000"+id;
				else if(id<=99)
					newCid="CUS000"+id;
				else if(id<=999)
					newCid="CUS00"+id;
				else if(id<=9999)
					newCid="CUS0"+id;
				else
					newCid="CUS"+id;		
				System.out.print("\nGenerated : "+newCid);		
				ss.close();
			}
			return newCid;
		}	
	
	
	@Transactional
	private String generateuserid1(){	
		
			String newUid="";
			
			Session s = sessionFactory.openSession();
			Query qr = s.createQuery("from UserDetails1");
			List<UserDetails1> data = qr.list();
			s.close();
			if(data.size()==0){
				newUid="00001";
			}
			else {			
				Session ss = sessionFactory.openSession();		
				Query q = ss.createQuery("select max(userid) from UserDetails1");
				String prevId = q.list().get(0).toString();
				System.out.print("\nExisting : "+prevId);
				int id = Integer.parseInt(prevId.substring(3));
				System.out.print("\nExisting id : "+id);		
				id=id+1;
				if(id<=9)
					newUid="USR0000"+id;
				else if(id<=99)
					newUid="USR000"+id;
				else if(id<=999)
					newUid="USR00"+id;
				else if(id<=9999)
					newUid="USR0"+id;
				else
					newUid="USR"+id;		
				System.out.print("\nGenerated : "+newUid);		
				ss.close();
			}
			return newUid;
	
	}
	
	@Transactional
	private String generatebillingaddressid(){	
		
			String newBid="";
			
			Session s = sessionFactory.openSession();
			Query qr = s.createQuery("from BillingAddress");
			List<BillingAddress> data = qr.list();
			s.close();
			if(data.size()==0){
				newBid="00001";
			}
			else {			
				Session ss = sessionFactory.openSession();		
				Query q = ss.createQuery("select max(billingaddresssid) from BillingAddress");
				String prevId = q.list().get(0).toString();
				System.out.print("\nExisting : "+prevId);
				int id = Integer.parseInt(prevId.substring(3));
				System.out.print("\nExisting id : "+id);		
				id=id+1;
				if(id<=9)
					newBid="BIL0000"+id;
				else if(id<=99)
					newBid="BIL000"+id;
				else if(id<=999)
					newBid="BIL00"+id;
				else if(id<=9999)
					newBid="BIL0"+id;
				else
					newBid="BIL"+id;		
				System.out.print("\nGenerated : "+newBid);		
				ss.close();
			}
			return newBid;
	
	}

	
	
	@Transactional
	private String generatecartid(){	
		
			String newCid="";
			
			Session s = sessionFactory.openSession();
			Query qr = s.createQuery("from Cart");
			List<Cart> data = qr.list();
			s.close();
			if(data.size()==0){
				newCid="00001";
			}
			else {			
				Session ss = sessionFactory.openSession();		
				Query q = ss.createQuery("select max(cartid) from Cart");
				String prevId = q.list().get(0).toString();
				System.out.print("\nExisting : "+prevId);
				int id = Integer.parseInt(prevId.substring(3));
				System.out.print("\nExisting id : "+id);		
				id=id+1;
				if(id<=9)
					newCid="CAR0000"+id;
				else if(id<=99)
					newCid="CAR000"+id;
				else if(id<=999)
					newCid="CAR00"+id;
				else if(id<=9999)
					newCid="CAR0"+id;
				else
					newCid="CAR"+id;		
				System.out.print("\nGenerated : "+newCid);		
				ss.close();
			}
			return newCid;
	
	}

	
	
	@Transactional
	private String generateshippindaddressid(){	
		
			String newSid="";
			
			Session s = sessionFactory.openSession();
			Query qr = s.createQuery("from ShippingAddress");
			List<ShippingAddress> data = qr.list();
			s.close();
			if(data.size()==0){
				newSid="SHP00001";
			}
			else {			
				Session ss = sessionFactory.openSession();		
				Query q = ss.createQuery("select max(shippingaddressid) from ShippingAddress");
				String prevId = q.list().get(0).toString();
				System.out.print("\nExisting : "+prevId);
				int id = Integer.parseInt(prevId.substring(3));
				System.out.print("\nExisting id : "+id);		
				id=id+1;
				if(id<=9)
					newSid="SHP0000"+id;
				else if(id<=99)
					newSid="SHP000"+id;
				else if(id<=999)
					newSid="SHP00"+id;
				else if(id<=9999)
					newSid="SHP0"+id;
				else
					newSid="SHP"+id;		
				System.out.print("\nGenerated : "+newSid);		
				ss.close();
			}
			return newSid;
		}






	public UserDetails1 getuserbyId(String usrid) {
		// TODO Auto-generated method stub
		return null;
	}	
	

}
