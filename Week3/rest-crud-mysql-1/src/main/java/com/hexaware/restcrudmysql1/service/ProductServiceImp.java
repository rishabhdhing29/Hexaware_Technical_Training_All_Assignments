package com.hexaware.restcrudmysql1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restcrudmysql1.entities.Product;
import com.hexaware.restcrudmysql1.repository.ProductRepository;


@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	ProductRepository repo;
	
	
	@Override
	public Product insertProduct(Product product) {
		 return repo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return repo.findById(productId).orElse(null);
	}

	@Override
	public void deleteProductById(int productId) {
		repo.deleteById(productId);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return repo.findById(productId).orElse(null);
	}

}
