package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDetailsDao;
import com.test.model.Products;
import com.test.model.UserDetails;
import com.test.model.UserDetails1;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserDetailsDao userdao;


	public UserDetails logincheck(UserDetails ud)
	{
		return userdao.logincheck(ud);
	}
	
	public String adduserdetails(UserDetails ud) {
		

		
		return userdao.adduserdetails(ud);
	
		
	}

	public UserDetails getUserById(String name) {
		// TODO Auto-generated method stub
		return userdao.getUserById(name);
	}

	public UserDetails logincheck1(UserDetails ud) {
		// TODO Auto-generated method stub
		return userdao.logincheck(ud);
	}	
	

	public void enableuser(String Userid){
		 userdao.enableuser(Userid);
	}
	
	public void disableuser(String Userid){
		userdao.disableuser(Userid);
	}
	

	
	
	
	
	
	



}
	
/*	public String adduserdetailstodb(Products pd)
	{

	
	

}
*/