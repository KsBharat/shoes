package com.test.service;

import java.util.List;

import com.test.model.Xmapproductsuppliers;

public interface Xmapproductsupplierservice {
	
	public void xmapprodsupp(Xmapproductsuppliers x);
	public List<Xmapproductsuppliers> getxmap();
	public void deleteproductsuppliers(String psi);
	public Xmapproductsuppliers getxmapbypsid(String s);
}
