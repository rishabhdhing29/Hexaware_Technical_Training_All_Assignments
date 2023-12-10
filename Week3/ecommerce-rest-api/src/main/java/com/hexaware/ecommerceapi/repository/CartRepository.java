package com.hexaware.ecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.ecommerceapi.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
