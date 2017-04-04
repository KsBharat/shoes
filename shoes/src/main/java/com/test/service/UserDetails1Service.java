package com.test.service;

import java.util.List;

import com.test.model.UserDetails1;

public interface UserDetails1Service {


	public UserDetails1 getUserbyId(String usrid);
	
	public void enableusers(String usrid);
	public void disableusers(String usrid);

	public List<UserDetails1> getAllUsers();
	

}
