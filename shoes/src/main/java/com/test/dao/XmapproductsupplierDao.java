package com.test.dao;

import java.util.List;

import com.test.model.Xmapproductsuppliers;

public interface XmapproductsupplierDao {
	
	
	public abstract void xmapprodsupp(Xmapproductsuppliers x);
	
	public List <Xmapproductsuppliers> getxmap();
	 public String deleteproductsupplier(String psi);
	 public Xmapproductsuppliers getxmapbypsid(String s);
	
	
	

}
