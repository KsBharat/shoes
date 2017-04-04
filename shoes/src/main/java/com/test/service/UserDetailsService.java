package com.test.service;

import com.test.model.UserDetails;
import com.test.model.UserDetails1;

public interface UserDetailsService {
	
	
	public abstract String adduserdetails(UserDetails ud);
	public abstract UserDetails logincheck(UserDetails ud);
	public abstract UserDetails getUserById(String name);
	public abstract UserDetails logincheck1(UserDetails ud);
	public abstract void enableuser(String Userid);
	public abstract void disableuser(String Userid);

}
