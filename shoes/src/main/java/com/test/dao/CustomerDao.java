package com.test.dao;

import com.test.model.Customer;
import com.test.model.UserDetails1;

public interface CustomerDao {
	
	public String addcustomer(Customer c);

	public Customer getcustomerbyuserid(String userid);

	
}
