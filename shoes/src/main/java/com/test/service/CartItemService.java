package com.test.service;

import com.test.model.CartItem;

public interface CartItemService {
	

	public void addcartitems(CartItem cartitem);
	
	public CartItem getcartitembyid(CartItem cartitemid);
	 
	public void deleteCartItem(String cartitemid);
	public void deleteallcartitems(String customerid);
}
