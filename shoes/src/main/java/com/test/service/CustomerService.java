package com.test.service;

import com.test.model.Customer;
import com.test.model.UserDetails1;

public interface CustomerService {
	
	public String addcustomers(Customer c);
	

	public Customer getcustomerbyUserid(String userid);
}
