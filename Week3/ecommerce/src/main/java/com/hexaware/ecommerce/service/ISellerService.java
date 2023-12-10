package com.hexaware.ecommerce.service;

import java.util.List;

import ecommerce_entities.Orders;
import ecommerce_entities.Sellers;

public interface ISellerService {
	public  int  createSeller(Sellers seller);
	public  int  updateSeller(Sellers seller);
	
	public  int  deleteSeller(int sellerId);
	public  Sellers   getSellerById(int sellerId);
	
	public  List<Sellers>  getAllSellers();
	int deleteSeller(Sellers seller);
}
