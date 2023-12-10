package com.hexaware.hibernateApp.entity;

public class Order {
	
	private int OrderID;
	private int CustomerID;
	private double amount;
	
	public Order() {
		super();
	}

	public Order(int orderID, int customerID, double amount) {
		super();
		OrderID = orderID;
		CustomerID = customerID;
		this.amount = amount;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [OrderID=" + OrderID + ", CustomerID=" + CustomerID + ", amount=" + amount + "]";
	}
	
	
	

}
