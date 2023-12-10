package ecommerce_entities;

import java.util.Objects;

public class Orders {
	
	private int OrderID;
	private int CustomerID;
	private String OrderDate;
	private double TotalAmount;

	public Orders() {
		super();
	}

	public Orders(int orderID, int customerID, String orderDate, double totalAmount) {
		super();
		OrderID = orderID;
		CustomerID = customerID;
		OrderDate = orderDate;
		TotalAmount = totalAmount;
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

	public String getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}

	public double getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Orders [OrderID=" + OrderID + ", CustomerID=" + CustomerID + ", OrderDate=" + OrderDate
				+ ", TotalAmount=" + TotalAmount + "]";
	}

	public int createOrder(Orders order) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int updateOrder(Orders order) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int deleteOrder(Orders order) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int getOrderById(Orders order) {
		// TODO Auto-generated method stub
		return 1;
	}
	public int getAllOrders(Orders order) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CustomerID, OrderDate, OrderID, TotalAmount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orders other = (Orders) obj;
		return CustomerID == other.CustomerID && Objects.equals(OrderDate, other.OrderDate) && OrderID == other.OrderID
				&& Double.doubleToLongBits(TotalAmount) == Double.doubleToLongBits(other.TotalAmount);
	}
	
	

}
