package com.test.dao;

import java.util.List;

import com.test.model.UserDetails1;

public interface UserDetails1Dao {

	public UserDetails1 getuserbyId(String usrid);
	
	public void enableuser(String Usrid);
	public void disableuser(String Usrid);

	public List<UserDetails1> getAllUsers();

}
