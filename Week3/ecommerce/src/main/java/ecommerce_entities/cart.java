package ecommerce_entities;

import java.util.Objects;

public class cart {
	
	private int CartID;
	private int CustomerID;
	private int ProductID;
	private String ProductName;
	private int Quantity;
	private String AddedToCartDate;

	public cart() {
		super();
	}

	public cart(int cartID, int customerID, int productID, String productName, int quantity, String addedToCartDate) {
		super();
		CartID = cartID;
		CustomerID = customerID;
		ProductID = productID;
		ProductName = productName;
		Quantity = quantity;
		AddedToCartDate = addedToCartDate;
	}

	public int getCartID() {
		return CartID;
	}

	public void setCartID(int cartID) {
		CartID = cartID;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getAddedToCartDate() {
		return AddedToCartDate;
	}

	public void setAddedToCartDate(String addedToCartDate) {
		AddedToCartDate = addedToCartDate;
	}

	@Override
	public String toString() {
		return "cart [CartID=" + CartID + ", CustomerID=" + CustomerID + ", ProductID=" + ProductID + ", ProductName="
				+ ProductName + ", Quantity=" + Quantity + ", AddedToCartDate=" + AddedToCartDate + "]";
	}

	public int createCart(cart cart) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int UpdateCart(cart cart) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int GetCartById(cart cart) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int DeleteCart(cart cart) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(AddedToCartDate, CartID, CustomerID, ProductID, ProductName, Quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cart other = (cart) obj;
		return Objects.equals(AddedToCartDate, other.AddedToCartDate) && CartID == other.CartID
				&& CustomerID == other.CustomerID && ProductID == other.ProductID
				&& Objects.equals(ProductName, other.ProductName) && Quantity == other.Quantity;
	}
	
	

}
