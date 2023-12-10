package ecommerce_entities;

import java.util.Objects;

public class Products {
	
	private int ProductID;
	private int SellerID;
	private String ProductName;
	private String Description;
	private double Price;
	private int StockQuantity;
	private String ImageURL;

	public Products() {
		super();
	}

	public Products(int productID, int sellerID, String productName, String description, double price,
			int stockQuantity, String imageURL) {
		super();
		ProductID = productID;
		SellerID = sellerID;
		ProductName = productName;
		Description = description;
		Price = price;
		StockQuantity = stockQuantity;
		ImageURL = imageURL;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int productID) {
		ProductID = productID;
	}

	public int getSellerID() {
		return SellerID;
	}

	public void setSellerID(int sellerID) {
		SellerID = sellerID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getStockQuantity() {
		return StockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		StockQuantity = stockQuantity;
	}

	public String getImageURL() {
		return ImageURL;
	}

	public void setImageURL(String imageURL) {
		ImageURL = imageURL;
	}

	@Override
	public String toString() {
		return "Products [ProductID=" + ProductID + ", SellerID=" + SellerID + ", ProductName=" + ProductName
				+ ", Description=" + Description + ", Price=" + Price + ", StockQuantity=" + StockQuantity
				+ ", ImageURL=" + ImageURL + "]";
	}

	public int deleteProduct(Products product) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int createProduct(Products product) {
		// TODO Auto-generated method stub
		return 1;
	}
	public int updateProduct(Products product) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int getProductById(Products product) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Description, ImageURL, Price, ProductID, ProductName, SellerID, StockQuantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(Description, other.Description) && Objects.equals(ImageURL, other.ImageURL)
				&& Double.doubleToLongBits(Price) == Double.doubleToLongBits(other.Price)
				&& ProductID == other.ProductID && Objects.equals(ProductName, other.ProductName)
				&& SellerID == other.SellerID && StockQuantity == other.StockQuantity;
	}
	
	

}
