package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.VW_XMAP_PS;
import com.test.model.Xmapproductsuppliers;

@Repository
public class Vw_DaoImpl implements Vw_Dao {

	@Autowired
	public SessionFactory sessionFactory;
	@Transactional
	public List<VW_XMAP_PS> view()
	{
		Session ses=sessionFactory.openSession();
		Query qr=ses.createQuery("from VW_XMAP_PS");
		List<VW_XMAP_PS> view=qr.list();
		return view;

	
		
	}
	@Transactional
	public List<VW_XMAP_PS> getbestpriceproduct() {
		// TODO Auto-generated method stub
		Session ses=sessionFactory.openSession();
		String qry="from VW_XMAP_PS x1 where productsupplierprice=(select min(productsupplierprice)from VW_XMAP_PS x2 where x1.productid=x2.productid)";
		
		Query qr=ses.createQuery(qry);
		List<VW_XMAP_PS> info=qr.list();
		ses.close();
		return info;
		
	}
	
	
		
	}


