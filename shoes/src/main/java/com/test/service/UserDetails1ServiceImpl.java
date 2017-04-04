package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.UserDetails1Dao;
import com.test.model.UserDetails1;



@Service
public class UserDetails1ServiceImpl implements UserDetails1Service {

	
	@Autowired
	private UserDetails1Dao userdetails1dao;
	
	public UserDetails1 getUserbyId(String usrid) {
		// TODO Auto-generated method stub
		return userdetails1dao.getuserbyId(usrid);
	}
	
	public void enableusers(String usrid){
		 userdetails1dao.enableuser(usrid);
	}
	

	public void disableusers(String usrid){
		 userdetails1dao.disableuser(usrid);
	}

	public List<UserDetails1> getAllUsers() {
		// TODO Auto-generated method stub
		return userdetails1dao.getAllUsers();
	}
}
