package com.test.dao;

import com.test.model.UserDetails;
import com.test.model.UserDetails1;

public interface UserDetailsDao {
	
	
	
	public abstract String adduserdetails(UserDetails ud);
	public abstract UserDetails logincheck(UserDetails du);
	public abstract UserDetails getUserById(String name);
	public abstract UserDetails LoginCheck1(UserDetails ud);
	public void enableuser(String Userid);
	public void disableuser(String Userid);
}
