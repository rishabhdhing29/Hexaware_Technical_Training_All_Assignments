package com.hexaware.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import ecommerce_entities.Orders;

public class OrderServiceImp implements IOrderService {

	public OrderServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int createOrder(Orders order) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateOrder(Orders order) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteOrder(Orders order) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Orders getProductById(int oid) {
		// TODO Auto-generated method stub
		Orders order =new Orders(101,201,"2023-10-10",50000);
		return order;
	}

	@Override
	public List<Orders> getAllOrders() {
		List<Orders> getOrders = new ArrayList<>();
		getOrders.add(new Orders(101,201,"2023-10-10",50000));
		getOrders.add(new Orders(102,202,"2023-08-08",50000));
		return getOrders;
	}

	@Override
	public int deleteOrder(int oid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
