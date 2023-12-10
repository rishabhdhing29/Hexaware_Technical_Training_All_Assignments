package com.hexaware.ecommerceapi.service;

import java.util.List;

import com.hexaware.ecommerceapi.dto.CustomerDTO;
import com.hexaware.ecommerceapi.entities.Customer;

public interface ICustomerService {


	public Customer createCustomer(CustomerDTO customerDTO);
	public Customer updateCustomer(CustomerDTO customerDTO);
	public void deleteCustomer(int customerId);
	public CustomerDTO getCustomerById(int customerId );
	public List<Customer> getAllCustomers();
}
