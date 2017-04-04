/*package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.test.model.Products;
import com.test.model.Suppliers;

public class AdminSupplierImpl implements AdminSupplierDao {

	public void addsupplierdetailstodb(Suppliers sp)
	{
		Session ses=sessionFactory.openSession();
		Transaction tr=ses.beginTransaction();
		sp.setSupplierid(generatesupplierid());
		ses.save(sp);
		tr.commit();
		ses.close();
	}
	
	
	
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
	
	
	public List<Suppliers> getsuppliersdetails()
	{
	Session.ses=sessionFactory.openSession();
	Query qr=ses.createQuery("from Suppliers");
	List<Suppliers>getsupplierlist=qr.list();
	return getsupplierlist;
	}


	}

}
*/