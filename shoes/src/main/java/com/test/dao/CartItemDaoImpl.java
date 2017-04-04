package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Cart;
import com.test.model.CartItem;
import com.test.model.Customer;
@Repository
public class CartItemDaoImpl implements CartItemDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional
	private String generatecartitemId(){	
		
			String newIid="";
			
			Session s = sessionFactory.openSession();
			Query qr = s.createQuery("from CartItem");
			List<CartItem> data = qr.list();
			s.close();
			if(data.size()==0){
				newIid="ITM00001";
			}
			else {			
				Session ss = sessionFactory.openSession();		
				Query q = ss.createQuery("select max(cartitemid) from CartItem");
				String prevId = q.list().get(0).toString();
				System.out.print("\nExisting : "+prevId);
				int id = Integer.parseInt(prevId.substring(3));
				System.out.print("\nExisting id : "+id);		
				id=id+1;
				if(id<=9)
					newIid="ITM0000"+id;
				else if(id<=99)
					newIid="ITM000"+id;
				else if(id<=999)
					newIid="ITM00"+id;
				else if(id<=9999)
					newIid="ITM0"+id;
				else
					newIid="ITM"+id;		
				System.out.print("\nGenerated : "+newIid);		
				ss.close();
			}
			return newIid;
		}	
	@Transactional
	public void addcartitem(CartItem cartitem){
		Session ses=sessionFactory.openSession();
		cartitem.setCartitemid(generatecartitemId());
		ses.save(cartitem);
		ses.flush();
		ses.close();
	}
	
	public CartItem getcartitembyid(CartItem cartitemid){
		
		Session ses=sessionFactory.openSession();
		CartItem cartitem=ses.get(CartItem.class,cartitemid.getCartitemid());
		ses.flush();
		ses.close();
		return cartitem;
		
	}
	public void deletecartitem(String cartitemid) {
		
		Session ses=sessionFactory.openSession();
		CartItem cartitem=ses.get(CartItem.class,cartitemid);
		ses.delete(cartitemid);
		ses.flush();
		ses.close();
		
		
	}
	
	public void deleteallcartitems(String customerid){
		Session ses=sessionFactory.openSession();
		Customer customer=ses.get(Customer.class, customerid);
		Cart cart= customer.getCart();
		
		List<CartItem>cartitems=cart.getCartItems();
		
		for(CartItem fuck:cartitems)
			deleteallcartitems(fuck.getCartitemid());
	}
	
	

}
