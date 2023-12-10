package com.hexaware.ecommerceapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.ecommerceapi.entities.PaymentInformation;

@Repository
public interface PaymentInformationRepository extends JpaRepository<PaymentInformation, Integer> {

}
