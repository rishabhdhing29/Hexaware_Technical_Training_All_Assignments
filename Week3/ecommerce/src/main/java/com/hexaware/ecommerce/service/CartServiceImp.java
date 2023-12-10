package com.hexaware.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import ecommerce_entities.cart;

public class CartServiceImp implements ICartService {

	public CartServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int createCart(cart ca) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int  updateCart(cart ca) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteCart(cart cart) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public cart getCartById(int ca) {
		// TODO Auto-generated method stub
		cart c= new cart(101,501,201,"Macbook",2,"22:10:05");
		return c;
	}

	@Override
	public int deleteCart(int ca) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<cart> getAllcarts() {
		// TODO Auto-generated method stub
		List<cart>getcart = new ArrayList<>();
		getcart.add(new cart(101,501,201,"Macbook",2,"22:10:05"));
		getcart.add(new cart(102,502,201,"Macbook",2,"22:10:05"));
		return getcart;
	}

	public int DeleteCart(cart cart) {
		// TODO Auto-generated method stub
		return 1;
	}

}
