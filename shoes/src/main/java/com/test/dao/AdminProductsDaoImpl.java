package com.test.dao;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Products;
import com.test.model.Suppliers;
import com.test.model.UserDetails;
import com.test.model.Xmapproductsuppliers;

@Repository
public class AdminProductsDaoImpl implements AdminProductsDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public void addproductdetailstodb(Products pd) {
		// TODO Auto-generated method stub
	
		System.out.println("before dao");
		
		Session ses=sessionFactory.openSession();
		
		Transaction tr=ses.beginTransaction();
		pd.setProductid(generateproductid());
		ses.save(pd);
		saveproductfile(pd);
		tr.commit();
		ses.close();
		System.out.println("after dao");
	}
	
	
	
	
	
	public Products getProductById(String pid) {
		Session ses=sessionFactory.openSession();
		Products p = ses.get(Products.class, pid);
		ses.close();
		return p;
	}




	@Transactional
	public void editProduct(Products prd) {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.openSession();
		Transaction tr=ses.beginTransaction();
		ses.update(prd);
		tr.commit();
		ses.close();	
	}





	@Transactional
	private String generateproductid() {
		// TODO Auto-generated method stubprivate String generateUserId(){	
	
		String newPid="";
		
		Session s = sessionFactory.openSession();
		Query qr = s.createQuery("from Products");
		List<Products> data = qr.list();
		s.close();
		if(data.size()==0){
			newPid="PRD00001";
		}
		else {			
			Session ss = sessionFactory.openSession();		
			Query q = ss.createQuery("select max(productid) from Products");
			String prevId = q.list().get(0).toString();
			System.out.print("\nExisting : "+prevId);
			int id = Integer.parseInt(prevId.substring(3));
			System.out.print("\nExisting id : "+id);		
			id=id+1;
			if(id<=9)
				newPid="PRD0000"+id;
			else if(id<=99)
				newPid="PRD000"+id;
			else if(id<=999)
				newPid="PRD00"+id;
			else if(id<=9999)
				newPid="PRD0"+id;
			else
				newPid="PRD"+id;		
			System.out.print("\nGenerated : "+newPid);		
			ss.close();
		}

		
		
		
		return newPid;
	}
	
	@Transactional
		public List<Products> getproductdetails()
		{
			Session ses=sessionFactory.openSession();
			Query qr=ses.createQuery("from Products");
			List<Products> getproductlist=qr.list();
			return getproductlist;
		}
	
	
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
	@Transactional
		public void addsupplierdetailstodb(Suppliers sp)
	{
		Session ses=sessionFactory.openSession();
		Transaction tr=ses.beginTransaction();
		sp.setSupplierid(generatesupplierid());
		ses.save(sp);
		savesupplierfile(sp);
		tr.commit();
		ses.close();
	}
	
	
	@Transactional
	private String generatesupplierid() {
		// TODO Auto-generated method stubprivate String generateUserId(){	
	
		String newSup="";
		
		Session s = sessionFactory.openSession();
		Query qr = s.createQuery("from Suppliers");
		List<Products> data = qr.list();
		s.close();
		if(data.size()==0){
			newSup="SUP00001";
		}
		else {			
			Session ss = sessionFactory.openSession();		
			Query q = ss.createQuery("select max(supplierid) from Suppliers");
			String prevId = q.list().get(0).toString();
			System.out.print("\nExisting : "+prevId);
			int id = Integer.parseInt(prevId.substring(3));
			System.out.print("\nExisting id : "+id);		
			id=id+1;
			if(id<=9)
				newSup="SUP0000"+id;
			else if(id<=99)
				newSup="SUP000"+id;
			else if(id<=999)
				newSup="SUP00"+id;
			else if(id<=9999)
				newSup="SUP0"+id;
			else
				newSup="SUP"+id;		
			System.out.print("\nGenerated : "+newSup);		
			ss.close();

	
		}
	return newSup;
	}
	
	@Transactional
	public List<Suppliers> getsupplierdetails()
	{
	Session ses=sessionFactory.openSession();
	Query qr=ses.createQuery("from Suppliers");
	List<Suppliers> getsupplierlist=qr.list();
	return getsupplierlist;
	}



///////////////////////////////////////////////

	@Transactional
	private void saveproductfile(Products pd)
	{
		try
		{
			if(pd.getImagefile()!= null)
			{
				Path path=Paths.get("D://workspace-dt//shoes//src//main//webapp//resources//images//products//"+pd.getProductid()+".jpg");
				pd.getImagefile().transferTo(new File(path.toString()));
				System.out.println("/n image added successfully");
			}
		}
		catch(Exception e)
		{

		System.out.println("image not saved");
		}
	}
	@Transactional
	private void savesupplierfile(Suppliers sp)
	{
		try
		{
			if(sp.getImagesupplier()!= null)
			{
				Path path=Paths.get("D://workspace-dt//shoes//src//main//webapp//resources//images//suppliers//"+sp.getSupplierid()+".jpg");
				sp.getImagesupplier().transferTo(new File(path.toString()));
				System.out.println("added successfully");
			}
		}
		catch(Exception e)
		{
			System.out.println("not saved");
		}
	
	
	
	}
	@Transactional
	public String deleteproduct(String pid)
	{
		Session ses=sessionFactory.openSession();
		Transaction tr=ses.beginTransaction();
		Products temp=ses.get(Products.class,pid);
		ses.delete(temp);
		tr.commit();
		ses.close();
		return null;
		
	}
	@Transactional
	public String deletesupplier(String sid)
	{
		Session ses=sessionFactory.openSession();
		Transaction tr=ses.beginTransaction();
		Suppliers temp=ses.get(Suppliers.class,sid);
		ses.delete(temp);
		tr.commit();
		ses.close();
		return null;
	}




	@Transactional
	public void editSuppliers(Suppliers sid) {
		// TODO Auto-generated method stub
		
			Session ses=sessionFactory.openSession();
			Transaction tr=ses.beginTransaction();
			ses.update(sid);
			tr.commit();
			ses.close();
					
	}




	@Transactional
	public Suppliers getSupplierById(String sid) {
		
			Session ses=sessionFactory.openSession();
			Suppliers s = ses.get(Suppliers.class,sid);
			ses.close();
			return s;
		
		
		
	}





	
		
	
	
	
	
	

	//public void xmapprodsupp(Xmapproductsupplier x)
//	{
		
		
//	}


	
	
}
	
	
	
	
	
	









