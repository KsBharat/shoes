package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Xmapproductsuppliers {

	@Id
	private String psid;
	
	private String productid;
	private String supplierid;
	private int productsupplierprice;
	private int productsupplierstock;
	private boolean isproductavailable;
	public String getPsid() {
		return psid;
	}
	public void setPsid(String psid) {
		this.psid = psid;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(String supplierid) {
		this.supplierid = supplierid;
	}
	public int getProductsupplierprice() {
		return productsupplierprice;
	}
	public void setProductsupplierprice(int productsupplierprice) {
		this.productsupplierprice = productsupplierprice;
	}
	public int getProductsupplierstock() {
		return productsupplierstock;
	}
	public void setProductsupplierstock(int productsupplierstock) {
		this.productsupplierstock = productsupplierstock;
	}
	public boolean isIsproductavailable() {
		return isproductavailable;
	}
	public void setIsproductavailable(boolean isproductavailable) {
		this.isproductavailable = isproductavailable;
	}

	
	
	
}
