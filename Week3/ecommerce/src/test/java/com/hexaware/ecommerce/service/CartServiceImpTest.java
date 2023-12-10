package com.hexaware.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ecommerce_entities.cart;

class CartServiceImpTest {
    
	CartServiceImp cartservice = new CartServiceImp();
	@Test
	void testCreateCart() {
		cart Cart = new cart();
		int actual = cartservice.createCart(Cart);
		assertEquals(1, actual);
		
	}

	@Test
	void testUpdateCart() {
		cart Cart = new cart();
		int actual = cartservice.updateCart(Cart);
		assertEquals(1, actual);
	}

	@Test
	void testDeleteCart() {
		cart Cart = new cart();
		int actual = cartservice.DeleteCart(Cart);
		assertEquals(1, actual);
	}

	@Test
	void testGetCartById() {
		cart expected = new cart(101,501,201,"Macbook",2,"22:10:05");
		cart actual = cartservice.getCartById(10);
		assertEquals(expected,actual);
	}
	@Test
	void testGetAllCarts() {
		List<cart> actual = cartservice.getAllcarts();
		List<cart> expected = new ArrayList<>();
		expected.add(new cart(101,501,201,"Macbook",2,"22:10:05"));
		expected.add(new cart(102,502,201,"Macbook",2,"22:10:05"));
		assertEquals(expected,actual);
	}

}
