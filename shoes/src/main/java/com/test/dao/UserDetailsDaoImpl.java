package com.test.dao; 

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.UserDetails;
import com.test.model.UserDetails1;




@Repository
public class UserDetailsDaoImpl implements UserDetailsDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional
	public String adduserdetails(UserDetails ud) {
		
		System.out.println("\n before Dao");
		Session ses=sessionFactory.openSession();
		Transaction tr= ses.beginTransaction();
		ud.setUserid(generateUserId());
		ud.setIsenabled(true);
		ud.setRole("ROLE_USER");
		saveuserdetailsfile(ud);
		ses.save(ud);
		tr.commit();
		ses.close();
		
		System.out.println("after Dao");
		return ud.getUserid();

	}

	
	@Transactional
	private void saveuserdetailsfile(UserDetails ud) {
		// TODO Auto-generated method stub
		
	}



	@Transactional
private String generateUserId(){	
	
		String newUid="";
		
		Session s = sessionFactory.openSession();
		Query qr = s.createQuery("from UserDetails");
		List<UserDetails> data = qr.list();
		s.close();
		if(data.size()==0){
			newUid="USR00001";
		}
		else {			
			Session ss = sessionFactory.openSession();		
			Query q = ss.createQuery("select max(userid) from UserDetails");
			String prevId = q.list().get(0).toString();
			System.out.print("\nExisting : "+prevId);
			int id = Integer.parseInt(prevId.substring(3));
			System.out.print("\nExisting id : "+id);		
			id=id+1;
			if(id<=9)
				newUid="USR0000"+id;
			else if(id<=99)
				newUid="USR000"+id;
			else if(id<=999)
				newUid="USR00"+id;
			else if(id<=9999)
				newUid="USR0"+id;
			else
				newUid="USR"+id;		
			System.out.print("\nGenerated : "+newUid);		
			ss.close();
		}
		return newUid;
	}	

	@Transactional
		public UserDetails logincheck(UserDetails ud)
		{
		Session ses=sessionFactory.openSession();
		
		Query q=ses.createQuery("from UserDetails where userid=? and password=? and isenabled=true ");
		
		q.setParameter(0,ud.getUserid());		
		q.setParameter(1,ud.getPassword());
		UserDetails t=(UserDetails)q.uniqueResult();

		return t;
		}


	@Transactional
		public UserDetails getUserById(String name) {
			
			Session ses= sessionFactory.openSession();
			UserDetails ud=ses.get(UserDetails.class,name);
			ses.close();
			
			return ud;
		}
	@Transactional
		public UserDetails logincheck1(UserDetails ud)
		{
		Session ses=sessionFactory.openSession();
		
		Query q=ses.createQuery("from UserDetails where userid=? and password=? and isenabled=true ");
		
		q.setParameter(0,ud.getUserid());		
		q.setParameter(1,ud.getPassword());
		UserDetails t=(UserDetails)q.uniqueResult();

		return t;
		}


	@Transactional
		public UserDetails LoginCheck1(UserDetails ud) {
			// TODO Auto-generated method stub
			return null;
		}
		 

	
	//ENABLING AND DISABLING USERS FOR ADMIN PURPOSE
		@Transactional
		public void enableuser(String Userid) {
		// TODO Auto-generated method stub
			Session ses=sessionFactory.openSession();
			UserDetails user=ses.get(UserDetails.class,Userid);
			user.setIsenabled(true);
			ses.update(user);
			ses.flush();
			ses.close();
			}


		@Transactional
		public void disableuser(String Userid){
			Session ses=sessionFactory.openSession();
			UserDetails user=ses.get(UserDetails.class, Userid);
			user.setIsenabled(false);
			ses.update(user);
			ses.flush();
			ses.close();
		}

	
}
