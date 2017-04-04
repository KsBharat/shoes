package com.test.dao;

import com.test.model.Cart;

public interface CartDao {

	public Cart getCart(String cartid);

	public int getcartsize(Cart cart);

	public void updatecart(Cart cart);
}
