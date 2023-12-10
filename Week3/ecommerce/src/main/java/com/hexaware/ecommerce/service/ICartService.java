package com.hexaware.ecommerce.service;

import java.util.List;


import ecommerce_entities.cart;

public interface ICartService {
	
	public int createCart(cart ca);
	public int updateCart(cart ca);
	public int deleteCart(int ca);
	public cart getCartById(int ca);
	public  List<cart>  getAllcarts();
	int deleteCart(cart cart);

}
