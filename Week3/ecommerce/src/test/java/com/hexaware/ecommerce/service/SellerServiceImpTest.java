package com.hexaware.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ecommerce_entities.Sellers;

class SellerServiceImpTest {
    
	SellerServiceImp sellerservice = new SellerServiceImp();

	@Test
	void testCreateSeller() {
		Sellers seller = new Sellers();
		int actual =sellerservice.createSeller(seller);
		assertEquals(10, actual);
	}

	@Test
	void testUpdateSeller() {
		Sellers seller = new Sellers();
		int actual =sellerservice.updateSeller(seller);
		assertEquals(1, actual);
	}

	@Test
	void testDeleteSeller() {
		Sellers seller = new Sellers();
		int actual =sellerservice.deleteSeller(seller);
		assertEquals(1, actual);
	}

	@Test
	void testGetSellerById() {
		Sellers expected = new Sellers(101,"rishabh","admin","Dell","Laptop","rishah@gmail.com","Indore");
		Sellers actual = sellerservice.getSellerById(10);
		assertEquals(expected,actual);
		
	}

	@Test
	void testGetAllSellers() {
		List<Sellers>actual = sellerservice.getAllSellers();
		List<Sellers>expected = new ArrayList<>();
		expected.add(new Sellers(101,"rishabh","admin","Dell","Laptop","rishah@gmail.com","Indore"));
		 expected.add(new Sellers(102,"vishal","root","Hp","mobile","vishal@gmail.com","Bhopal"));
			assertEquals(expected,actual);
	}

}
