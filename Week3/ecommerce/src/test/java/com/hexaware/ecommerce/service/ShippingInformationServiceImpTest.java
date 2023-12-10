package com.hexaware.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ecommerce_entities.ShippingInformation;

class ShippingInformationServiceImpTest {

	ShippingInformationServiceImp shippingservice = new ShippingInformationServiceImp();

	@Test
	void testCreateShippingInformation() {
		ShippingInformation shipping = new ShippingInformation();
		int actual = shippingservice .createShippingInformation(shipping);
		assertEquals(50, actual);
	}
	@Test
	void testUpdateShippingInformation() {
		ShippingInformation shipping = new ShippingInformation();
		int actual =shippingservice .updateShippingInformation(shipping);
		assertEquals(60, actual);
	}

	@Test
	void testDeleteShippingInformation() {
		ShippingInformation shipping = new ShippingInformation();
		int actual = shippingservice .deleteShippingInformation(shipping);
		assertEquals(70, actual);
	}
	@Test
	void testGetShippingInformationById() {
		ShippingInformation expected = new ShippingInformation(101, 501, "Rishabh", "Dhing", "Indore", "Ratlam", "MP", "457001", "India");
		ShippingInformation actual = shippingservice.getShippingInformationById(10);
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllShippingInformations() {
		List<ShippingInformation> actual = shippingservice.getAllShippingInformations();
		List<ShippingInformation> expected = new ArrayList<>();
		expected.add(new ShippingInformation(101, 501, "Rishabh", "Dhing", "Indore", "Ratlam", "MP", "457001", "India"));
		expected.add(new ShippingInformation(102, 502, "Vishal", "Anand", "Bhopal", "Ratlam", "MP", "457001", "India"));
		assertEquals(expected,actual);
	}

}
