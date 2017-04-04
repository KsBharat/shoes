package com.test.service;

import com.test.model.Cart;

public interface CartService {

	public Cart getCart(String cartid);

	public int getCartsize(Cart cart);
	
	public void updatecart(Cart cart);
}
