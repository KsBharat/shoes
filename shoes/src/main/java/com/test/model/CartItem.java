package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CartItem {

	@Id
	private String cartitemid;
	private int quantity;
	private int itemprice;
	
	@ManyToOne
	@JoinColumn(name="cartid")
	private Cart cart;
	
	
	@ManyToOne
	@JoinColumn(name="psid")
	private Xmapproductsuppliers xmapproductsuppliers;
	
	

	public String getCartitemid() {
		return cartitemid;
	}


	public void setCartitemid(String cartitemid) {
		this.cartitemid = cartitemid;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getItemprice() {
		return itemprice;
	}


	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public Xmapproductsuppliers getXmapproductsuppliers() {
		return xmapproductsuppliers;
	}


	public void setXmapproductsuppliers(Xmapproductsuppliers xmapproductsuppliers) {
		this.xmapproductsuppliers = xmapproductsuppliers;
	}
	
	
}
