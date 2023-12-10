package com.hexaware.ecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.ecommerceapi.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {

}
