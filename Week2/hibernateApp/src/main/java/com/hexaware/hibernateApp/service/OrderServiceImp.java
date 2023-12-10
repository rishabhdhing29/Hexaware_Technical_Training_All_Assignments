package com.hexaware.hibernateApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hibernateApp.dao.IOrderDao;
import com.hexaware.hibernateApp.entity.Order;

@Service
public class OrderServiceImp implements IOrderService {
	
	@Autowired
	IOrderDao dao;

	@Override
	public boolean createOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.createOrder(order);
	}

	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return dao.updateOrder(order);
	}

	@Override
	public boolean deleteOrder(int OrderID) {
		// TODO Auto-generated method stub
		return dao.deleteOrder(OrderID);
	}

	@Override
	public Order getOrderById(int OrderID) {
		// TODO Auto-generated method stub
		return dao.getOrderById(OrderID);
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return dao.getAllOrder();
	}

}
