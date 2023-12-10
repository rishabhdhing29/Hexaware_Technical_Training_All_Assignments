package com.hexaware.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ecommerce_entities.Products;

class ProductServiceImpTest {
	ProductServiceImp productservice = new ProductServiceImp();

	@Test
	void testCreateProduct() {
		 Products product = new Products();
		int actual =productservice.createProduct(product);
		assertEquals(10, actual);
	}

	@Test
	void testUpdateProduct() {
		Products product = new Products();
		int actual =productservice.updateProduct(product);
		assertEquals(20, actual);
	}

	@Test
	void testDeleteProduct() {
		Products product = new Products();
		int actual =productservice.deleteProduct(product);
		assertEquals(1, actual);
	}

	@Test
	void testGetProductById() {
		Products product = new Products();
		int actual =product.getProductById(product);
		assertEquals(1, actual);
	}

	@Test
	void testGetAllProducts() {
		List<Products>actual = productservice.getAllProducts();
		List<Products>expected = new ArrayList<>();
		expected.add(new Products(101,201,"Iphone","heavy",50000,2,"www.url"));
		expected.add(new Products(102,202,"Android","medium",20000,5,"www.urls"));
		assertEquals(expected,actual);
	}

}
