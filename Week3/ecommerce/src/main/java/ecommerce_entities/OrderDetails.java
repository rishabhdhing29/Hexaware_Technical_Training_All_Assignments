package ecommerce_entities;

public class OrderDetails {
	
	private int OrderDetailID;
	private int OrderID;
	private int ProductID;
	private int Quantity;
	private double Price;

	public OrderDetails() {
		super();
	}

	public OrderDetails(int orderDetailID, int orderID, int productID, int quantity, double price) {
		super();
		OrderDetailID = orderDetailID;
		OrderID = orderID;
		ProductID = productID;
		Quantity = quantity;
		Price = price;
	}

	public int getOrderDetailID() {
		return OrderDetailID;
	}

	public void setOrderDetailID(int orderDetailID) {
		OrderDetailID = orderDetailID;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "OrderDetails [OrderDetailID=" + OrderDetailID + ", OrderID=" + OrderID + ", ProductID=" + ProductID
				+ ", Quantity=" + Quantity + ", Price=" + Price + "]";
	}
	
	

}
