package com.hexaware.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import ecommerce_entities.Sellers;

public class SellerServiceImp implements ISellerService {

	public SellerServiceImp() {
	}

	@Override
	public int createSeller(Sellers seller) {
		return 10;
	}
	@Override
	public int updateSeller(Sellers seller) {
		return 1;
	}
	@Override
	public int deleteSeller(Sellers seller) {
		return 1;
	}
	@Override
	public Sellers getSellerById(int sellerId) {
		Sellers seller = new Sellers(101,"rishabh","admin","Dell","Laptop","rishah@gmail.com","Indore");
		return seller;
	}

	@Override
	public List<Sellers> getAllSellers() {
		 
	 List<Sellers> getSellers = new ArrayList<>();
	 getSellers.add(new Sellers(101,"rishabh","admin","Dell","Laptop","rishah@gmail.com","Indore"));
	 getSellers.add(new Sellers(102,"vishal","root","Hp","mobile","vishal@gmail.com","Bhopal"));
		return getSellers;
	}

	@Override
	public int deleteSeller(int sellerId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
