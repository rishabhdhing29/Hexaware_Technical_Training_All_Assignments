package com.hexaware.ecommerce.service;

import java.util.List;

import ecommerce_entities.Customers;

public interface ICustomerService {

	public  int  createCustomer(Customers customer);
	public  int  updateCustomer(Customers customer);
	
	public  boolean  deleteCustomer(int cid);
	public  Customers   getCustomerById(int cid);
	
	public  List<Customers>  getAllCustomers();
	int deleteCustomer(Customers customer);

}
