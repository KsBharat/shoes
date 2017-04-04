package com.test.dao;

import com.test.model.CartItem;

public interface CartItemDao {
	
	
	public void addcartitem(CartItem cartitem);
	public CartItem getcartitembyid(CartItem cartitemid);
	public void deletecartitem(String cartitemid);
	public void deleteallcartitems(String customerid);

}
