package com.test.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.UserDetails;
import com.test.model.UserDetails1;
@Repository
public class UserDetails1DaoImpl implements UserDetails1Dao {
	@Autowired
	private SessionFactory sessionFactory;

	public UserDetails1 getuserbyId(String usrid){

			
			Session ses=sessionFactory.openSession();
		
			UserDetails1 ud1=(UserDetails1)ses.get(UserDetails1.class,usrid);
			ses.flush();
			ses.close();
			return ud1;
			
			
	}
	
	//ENABLING AND DISABLING USERS FOR ADMIN PURPOSE
			@Transactional
			public void enableuser(String Usrid) {
			// TODO Auto-generated method stub
				Session ses=sessionFactory.openSession();
				UserDetails1 user=ses.get(UserDetails1.class,Usrid);
				user.setEnabled(true);
				ses.update(user);
				ses.flush();
				ses.close();
				}


			@Transactional
			public void disableuser(String Usrid){
				Session ses=sessionFactory.openSession();
				UserDetails1 user=ses.get(UserDetails1.class, Usrid);
				user.setEnabled(false);
				ses.update(user);
				ses.flush();
				ses.close();
			}

			public List<UserDetails1> getAllUsers() {
				Session ses=sessionFactory.openSession();
				Query q=ses.createQuery("from UserDetails1");
				List<UserDetails1> getuserlist=q.list();
				
				return getuserlist;
			}

			
				
		
}
