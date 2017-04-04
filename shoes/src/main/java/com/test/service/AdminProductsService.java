package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.test.model.Products;
import com.test.model.Suppliers;
import com.test.model.Xmapproductsuppliers;


public interface AdminProductsService {

	
	public void addproductdetailstodb(Products pd);
	public List<Products> getproductdetails();
	public void addsupplierdetailstodb(Suppliers sp);
	public List<Suppliers> getsupplierdetails();
	//public MultipartFile imagefile();
	public void deleteproduct(String pid);
	public void deletesupplier(String sid);
	/*public void adddatatoxmap(Xmapproductsuppliers x);*/
	public abstract Products getProductById(String pid);
	public abstract void editProduct(Products prd);
	public Suppliers getSupplierById(String sid);
	public abstract void editSupplier(Suppliers sid);	
}


