package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CartItemDao;
import com.test.model.CartItem;

@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired
	private CartItemDao cartitemdao;
	
	public void addcartitems(CartItem ci) {
		// TODO Auto-generated method stub
		cartitemdao.addcartitem(ci);
		
		
	}
	public CartItem getcartitembyid(CartItem cartitemid){
		return cartitemdao.getcartitembyid(cartitemid);
	}
	public void deleteCartItem(String cartitemid) {
		// TODO Auto-generated method stub
		cartitemdao.deletecartitem(cartitemid);
		
	}
	public void deleteallcartitems(String customerid) {
		// TODO Auto-generated method stub
		cartitemdao.deleteallcartitems(customerid);
	}

}
