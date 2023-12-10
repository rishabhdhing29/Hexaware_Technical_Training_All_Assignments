package com.hexaware.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import ecommerce_entities.Customers;

public class CustomerServiceImp implements ICustomerService {

	public CustomerServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int createCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return 25;
	}

	@Override
	public int updateCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public int deleteCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Customers getCustomerById(int cid) {
		// TODO Auto-generated method stub
		Customers customer = new Customers(101,"root","Rishabh","Dhing","email","1234567890","Indore");
		
		return customer;
	}

	@Override
	public List<Customers> getAllCustomers() {
		List<Customers> getCustomers = new ArrayList<>();
		getCustomers.add(new Customers(101,"admin","Rishabh","Dhing","rishabh@gmail.com","1234567890","Indore"));
		getCustomers.add(new Customers(102,"root","Vishal","Anand","vishal@gmail.com","1234567891","Bhopal"));
		return getCustomers;
	}

	@Override
	public boolean deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		return false;
	}

	public Customers getCutomersById(int i) {
		// TODO Auto-generated method stub
Customers customer = new Customers(101,"root","Rishabh","Dhing","email","1234567890","Indore");
		
		return customer;
	}

}
