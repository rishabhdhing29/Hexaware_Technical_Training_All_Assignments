package com.hexaware.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import ecommerce_entities.Orders;
import ecommerce_entities.Products;

public class ProductServiceImp implements IProductService {

	public ProductServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int createProduct(Products product) {
		return 10;
	}

	@Override
	public int updateProduct(Products product) {
		return 20;
	}

	@Override
	public int deleteProduct(Products product) {
		// TODO Auto-generated method stub
		return  1;
	}

	@Override
	public Orders getProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}
   
	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		List<Products> getproducts= new ArrayList<>();
		getproducts.add(new Products(101,201,"Iphone","heavy",50000,2,"www.url"));
		getproducts.add(new Products(102,202,"Android","medium",20000,5,"www.urls"));
		return getproducts;
	}

	@Override
	public int deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
