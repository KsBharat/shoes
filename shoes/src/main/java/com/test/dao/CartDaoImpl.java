package com.test.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.Cart;
import com.test.model.CartItem;

@Repository
public class CartDaoImpl implements CartDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Cart getCart(String cartid){
		Session ses=sessionFactory.openSession();
		Cart cart=(Cart)ses.get(Cart.class,cartid);
		ses.close();
		return cart;
	}

	public int getcartsize(Cart cart) {
		List<CartItem> cartitems=cart.getCartItems();
		
		return cartitems.size();
	}

	public void updatecart(Cart cart) {
		Session ses=sessionFactory.openSession();
		ses.update(cart);
		ses.flush();
		ses.close();
		
	}
	
	

}
