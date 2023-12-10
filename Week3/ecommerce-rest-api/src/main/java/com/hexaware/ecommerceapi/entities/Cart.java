package com.hexaware.ecommerceapi.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;




@Entity
@Table(name="Cart_Details")
public class Cart {

	@Id
	@NotNull
	private int cartId;

	@NotNull
	private int customerId;

	@NotNull
	private int productId;
	private String productName;
	private String productQuantity;
	private LocalDate productAddedDate;



	public Cart() {
		super();
	}

	public Cart(int cartId, int customerId, int productId, String productName, String productQuantity,
			LocalDate productAddedDate) {
		super();
		this.cartId = cartId;
		this.customerId = customerId;
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productAddedDate = productAddedDate;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public LocalDate getProductAddedDate() {
		return productAddedDate;
	}

	public void setProductAddedDate(LocalDate productAddedDate) {
		this.productAddedDate = productAddedDate;
	}




}
