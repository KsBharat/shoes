package com.test.dao;

import java.util.List;

import com.test.model.Products;
import com.test.model.Suppliers;
import com.test.model.Xmapproductsuppliers;

public interface AdminProductsDao {

	
	public abstract void addproductdetailstodb(Products pd);
	
	
	public List<Products> getproductdetails();
	
public abstract void addsupplierdetailstodb(Suppliers sp);
	
	public List<Suppliers> getsupplierdetails();


	public abstract String deleteproduct(String pid);
	
	public abstract String deletesupplier(String sid);
	
	public abstract Products getProductById(String pid);
	//public abstract void xmapprodsupp(Xmapproductsupplier x);
	public abstract void editProduct(Products prd);
	
	
	public abstract void editSuppliers(Suppliers sid);


	public abstract Suppliers getSupplierById(String sid);
	
	
}
