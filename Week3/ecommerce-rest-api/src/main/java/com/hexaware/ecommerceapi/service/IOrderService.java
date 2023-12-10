package com.hexaware.ecommerceapi.service;

import java.util.List;

import com.hexaware.ecommerceapi.dto.OrderDTO;
import com.hexaware.ecommerceapi.entities.Order;

public interface IOrderService {

	public Order createOrder(OrderDTO orderDTO);

	public Order updateOrder(OrderDTO orderDTO);

	public void deleteOrder(int orderId);

	public OrderDTO getOrderById(int orderId);

	public List<Order> getAllOrders();
}
