package com.hexaware.assignment.service;

public interface ICartService<Cart> {
	
	public boolean createCart(Cart cart);
	public boolean updateCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public boolean getCartByID(Cart cart);
	

}
