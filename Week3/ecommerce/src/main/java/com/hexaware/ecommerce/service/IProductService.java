package com.hexaware.ecommerce.service;

import java.util.List;

import ecommerce_entities.Orders;
import ecommerce_entities.Products;

public interface IProductService {
	public  int  createProduct(Products product);
	public  int  updateProduct(Products product);
	
	public  int  deleteProduct(int productId);
	public  Orders   getProductById(int productId);
	
	public  List<Products>  getAllProducts();
	int deleteProduct(Products product);
}
