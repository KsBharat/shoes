package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.AdminProductsDao;
import com.test.model.Products;
import com.test.model.Suppliers;
@Service
public class AdminProductsServiceImpl implements AdminProductsService {

	
	@Autowired
	public  AdminProductsDao productdetails;
	
	
	public void addproductdetailstodb(Products pd) {
		
		productdetails.addproductdetailstodb(pd);
	}
	public List<Products> getproductdetails()
	{
		return productdetails.getproductdetails();
	
	


	}
	public void addsupplierdetailstodb(Suppliers sp)  //add supplier to db
	{
		 productdetails.addsupplierdetailstodb(sp);
	}
	public List<Suppliers> getsupplierdetails()     // get supplier list 
	{
		return productdetails.getsupplierdetails();
	}
	public void deleteproduct(String pid){   //delete product 
		productdetails.deleteproduct(pid);
	}
	public void deletesupplier(String sid){  // delete supplier
		productdetails.deletesupplier(sid);
	}
	public Products getProductById(String pid) {   // get product product by id to make it ready for editing
		// TODO Auto-generated method stub
		return productdetails.getProductById(pid);
	}
	
	public void editProduct(Products prd) {     // method for editing product
		// TODO Auto-generated method stub
		productdetails.editProduct(prd);
		
	}
	public Suppliers getSupplierById(String sid) {
		// TODO Auto-generated method stub
		return productdetails.getSupplierById(sid);
	}
	public void editSupplier(Suppliers sid) {
		// TODO Auto-generated method stub
		productdetails.editSuppliers(sid);
	}
	
}
