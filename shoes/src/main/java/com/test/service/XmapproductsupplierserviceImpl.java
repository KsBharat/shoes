package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.XmapproductsupplierDao;
import com.test.model.Xmapproductsuppliers;
@Service
public class XmapproductsupplierserviceImpl implements Xmapproductsupplierservice {
	
	@Autowired
	public XmapproductsupplierDao xmap;

	public void xmapprodsupp(Xmapproductsuppliers x) {
		// TODO Auto-generated method stub
		xmap.xmapprodsupp(x);

	}

	public List <Xmapproductsuppliers> getxmap()
	
	{
		return xmap.getxmap();
	}
	public void deleteproductsuppliers(String psi)
	{
	xmap.deleteproductsupplier(psi);
}

	public Xmapproductsuppliers getxmapbypsid(String s) {
		// TODO Auto-generated method stub
		return xmap.getxmapbypsid(s);
		
	}
}