package com.hexaware.ecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.ecommerceapi.entities.ShippingInformation;

@Repository
public interface ShippingInformationRepository extends JpaRepository<ShippingInformation, Integer> {

}
