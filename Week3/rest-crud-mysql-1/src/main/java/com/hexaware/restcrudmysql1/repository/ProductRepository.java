package com.hexaware.restcrudmysql1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.restcrudmysql1.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
	
	
	@Query("select e from  Product e where e.productId > ?1 ")
	public Product getProductByProductId(int productId);

	

}
