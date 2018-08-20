package com.xufan.testjdbc.dao;

import com.xufan.testjdbc.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(String custId);
}
