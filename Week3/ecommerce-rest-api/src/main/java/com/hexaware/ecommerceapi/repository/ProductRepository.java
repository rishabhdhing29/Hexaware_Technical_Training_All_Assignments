package com.hexaware.ecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.ecommerceapi.dto.ProductDTO;
import com.hexaware.ecommerceapi.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	 ProductDTO findByproductName(String productName);

}
