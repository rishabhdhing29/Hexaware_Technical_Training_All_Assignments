package com.hexaware.assignment.service;

import java.util.List;

import com.hexaware.hibernatemap.entities.Product;
import com.hexaware.springjdbc.model.prd;

public interface IProductService {

	 public boolean createProduct(Product product);
    public boolean updateProduct(Product product);
    public boolean deleteProduct(int productId);
    public boolean getProductById(int productId);
    public List<Product> getAllProducts();
	public void addProduct(Product product);
}
