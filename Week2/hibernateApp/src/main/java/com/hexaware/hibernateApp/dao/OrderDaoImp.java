package com.hexaware.hibernateApp.dao;

import java.util.List;
import javax.sql.DataSource;
import javax.sql.RowSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.hibernateApp.entity.Order;

@Repository
public class OrderDaoImp implements IOrderDao {
	
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public OrderDaoImp(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

		System.out.println(jdbcTemplate);

	}

	@Override
	public boolean createOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrder(int OrderID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Order getOrderById(int OrderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
