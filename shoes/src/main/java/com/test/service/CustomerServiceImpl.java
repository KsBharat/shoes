package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.CustomerDao;
import com.test.model.Customer;
import com.test.model.UserDetails1;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	public CustomerDao customerdao;
	
	public String addcustomers(Customer c){
		return customerdao.addcustomer(c);
	}
 
	public Customer getcustomerbyUserid(String userid){
		return customerdao.getcustomerbyuserid(userid);
	}
	
	

}
