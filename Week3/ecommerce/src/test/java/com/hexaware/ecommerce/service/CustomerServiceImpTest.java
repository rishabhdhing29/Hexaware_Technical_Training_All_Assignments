package com.hexaware.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ecommerce_entities.Customers;
import ecommerce_entities.Orders;

class CustomerServiceImpTest {
    
	CustomerServiceImp customerservice = new CustomerServiceImp();
	@Test
	void testCreateCustomer() {
		Customers customer = new Customers();
		int actual = customerservice.createCustomer(customer);
		assertEquals(25, actual);
	}

	@Test
	void testUpdateCustomer() {
		Customers customer = new Customers();
		int actual = customerservice.updateCustomer(customer);
		assertEquals(30, actual);
	}
	@Test
	void testDeleteCustomer() {
		Customers customer = new Customers();
		int actual = customerservice.deleteCustomer(customer);
		assertEquals(1, actual);
	}

	@Test
	void testGetCustomerById() {
		Customers expected = new Customers(101,"root","Rishabh","Dhing","email","1234567890","Indore");
		Customers actual = customerservice.getCutomersById(30);
		assertEquals(expected, actual);
	}

	@Test
	void testGetAllCustomers() {
		List<Customers> actual= customerservice.getAllCustomers();
		List<Customers> expected=new ArrayList<>();
		
		expected.add(new Customers(101,"admin","Rishabh","Dhing","rishabh@gmail.com","1234567890","Indore"));
		expected.add(new Customers(102,"root","Vishal","Anand","vishal@gmail.com","1234567891","Bhopal"));
		assertEquals(expected,actual);
	}

}
