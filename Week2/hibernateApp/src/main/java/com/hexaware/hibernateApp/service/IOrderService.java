package com.hexaware.hibernateApp.service;

import java.util.List;

import com.hexaware.hibernateApp.entity.Order;

public interface IOrderService {

	public  boolean  createOrder(Order order);
	public  boolean  updateOrder(Order order);
	
	public  boolean  deleteOrder(int OrderID);
	public  Order   getOrderById(int OrderID);
	
	public  List<Order>  getAllOrder();
}
