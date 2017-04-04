package com.test.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Products;
import com.test.model.VW_XMAP_PS;
import com.test.model.Xmapproductsuppliers;

@Repository
public class XmapproductsupplierDaoImpl implements XmapproductsupplierDao {
	
	
	@Autowired
	public SessionFactory sessionFactory;
	
	@Transactional
	public void xmapprodsupp(Xmapproductsuppliers x) {
		// TODO Auto-generated method stub
		
		Session ses=sessionFactory.openSession();
		Transaction tr=ses.beginTransaction();
		x.setPsid(generatepsid());
		ses.save(x);
		tr.commit();
		ses.close();
	}
	
	@Transactional
	private String generatepsid() {
		// TODO Auto-generated method stubprivate String generateUserId(){	
	
		String newXmid="";
		
		Session s = sessionFactory.openSession();
		Query qr = s.createQuery("from Xmapproductsuppliers");
		List<Products> data = qr.list();
		s.close();
		if(data.size()==0){
			newXmid="XMP00001";
		}
		else {			
			Session ss = sessionFactory.openSession();		
			Query q = ss.createQuery("select max(psid) from Xmapproductsuppliers");
			String prevId = q.uniqueResult().toString();
			System.out.print("\nExisting : "+prevId);
			int id = Integer.parseInt(prevId.substring(3));
			System.out.print("\nExisting id : "+id);		
			id=id+1;
			if(id<=9)
				newXmid="XMP0000"+id;
			else if(id<=99)
				newXmid="XMP000"+id;
			else if(id<=999)
				newXmid="XMP00"+id;
			else if(id<=9999)
				newXmid="XMP0"+id;
			else
				newXmid="XMP"+id;		
			System.out.print("\nGenerated : "+newXmid);		
			ss.close();
		}

		
		
		
		return newXmid;
	

}	@Transactional
	public List <Xmapproductsuppliers> getxmap()
	{
		Session ses=sessionFactory.openSession();
		Query q=ses.createQuery("from Xmapproductsuppliers");
		List<Xmapproductsuppliers> getxmaplist=q.list();
		
		
		return getxmaplist;
	}/*
	public String deleteproductsupplier(String psid)
	{
		Session ses=sessionFactory.openSession();
		Transaction tr=ses.beginTransaction()
				*/
	

	@Transactional
	public String deleteproductsupplier(String psi)
	{
		Session ses=sessionFactory.openSession();
		Transaction tr=ses.beginTransaction();
		Xmapproductsuppliers temp=ses.get(Xmapproductsuppliers.class,psi);
		ses.delete(temp);
		tr.commit();
		ses.close();
		return null;
	}
	
	
	@Transactional
	public Xmapproductsuppliers getxmapbypsid(String s){
		Session ses=sessionFactory.openSession();
		Xmapproductsuppliers ps=ses.get(Xmapproductsuppliers.class,s);
		ses.flush();
		ses.close();
		return ps;
	}


}
