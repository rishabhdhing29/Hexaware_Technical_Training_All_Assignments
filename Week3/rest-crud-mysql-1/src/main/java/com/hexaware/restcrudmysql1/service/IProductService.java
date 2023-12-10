package com.hexaware.restcrudmysql1.service;

import java.util.List;

import com.hexaware.restcrudmysql1.entities.Product;

public interface IProductService {
	
	public Product  insertProduct(Product product);
	public Product  updateProduct(Product product);
	public  Product  getProductById(int productId);
	public void deleteProductById(int productId);
	public List<Product> getAllProducts();
//	public Product getProductByProductName(String productName);
	public Product getById(int productId);
	
	

}
