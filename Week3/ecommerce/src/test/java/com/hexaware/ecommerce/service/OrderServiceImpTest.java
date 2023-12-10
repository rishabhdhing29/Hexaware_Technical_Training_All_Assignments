package com.hexaware.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ecommerce_entities.Orders;

class OrderServiceImpTest {
	
	OrderServiceImp orderservice = new OrderServiceImp();
	@Test
	void testCreateOrder() {
		Orders order = new Orders();
		int actual = orderservice.createOrder(order);
		assertEquals(1, actual);
	}

	@Test
	void testUpdateOrder() {
		Orders order = new Orders();
		int actual = orderservice.updateOrder(order);
		assertEquals(1, actual);
	}

	@Test
	void testDeleteOrder() {
		Orders order = new Orders();
		int actual = orderservice.deleteOrder(order);
		assertEquals(1, actual);
	}

	@Test
	void testGetProductById() {
		Orders expected = new Orders(101,201,"2023-10-10",50000);
		Orders actual = orderservice.getProductById(50);
		assertEquals(expected, actual);
	}

	@Test
	void testGetAllOrders() {
		List<Orders> actual= orderservice.getAllOrders();
		List<Orders> expected=new ArrayList<>();
		
		expected.add(new Orders(101,201,"2023-10-10",50000));
		expected.add(new Orders(102,202,"2023-08-08",50000));
		assertEquals(expected,actual); 
		
	}

}
