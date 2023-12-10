package com.hexaware.springboot1.entities;

import org.springframework.stereotype.Component;

@Component
public class Product {

	
	private int pid;
	private String pname;
	private double amount;
	
	public Product() {
		super();
	}

	public Product(int pid, String pname, double amount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.amount = amount;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", amount=" + amount + "]";
	}
	
	
	
}
