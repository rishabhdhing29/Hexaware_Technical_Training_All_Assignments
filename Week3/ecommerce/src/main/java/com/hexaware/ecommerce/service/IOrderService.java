package com.hexaware.ecommerce.service;

import java.util.List;

import ecommerce_entities.Orders;

public interface IOrderService {
 
	
	public  int  createOrder(Orders order);
	public  int  updateOrder(Orders order);
	
	public  int  deleteOrder(int oid);
	public  Orders   getProductById(int oid);
	
	public  List<Orders>  getAllOrders();
	int deleteOrder(Orders order);

}
