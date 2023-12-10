package com.hexaware.ecommerceapi.service;

import java.util.List;

import com.hexaware.ecommerceapi.dto.SellerDTO;
import com.hexaware.ecommerceapi.entities.Seller;

public interface ISellerService {


	public Seller createSeller(SellerDTO sellerDTO);
	public Seller updateSeller(SellerDTO sellerDTO);
	public void deleteSeller(int sellerId);
	public SellerDTO getSellerById(int sellerId );
	public List<Seller> getAllSellers();
}
