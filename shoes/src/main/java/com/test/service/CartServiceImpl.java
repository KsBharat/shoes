package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CartDao;
import com.test.model.Cart;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartDao cartdao;
	
	public Cart getCart(String cartid){
		return cartdao.getCart(cartid);
	}

	public int getCartsize(Cart cart) {
		// TODO Auto-generated method stub
		
		return  cartdao.getcartsize(cart);
	}

	public void updatecart(Cart cart) {
		// TODO Auto-generated method stub
		cartdao.updatecart(cart);
		
	}

	
	}


