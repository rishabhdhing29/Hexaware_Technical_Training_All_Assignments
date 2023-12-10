package ecommerce_entities;

import java.util.Objects;

public class Sellers {
	
	private int SellerID;
	private String UserName;
	private String Password;
	private String ComapanyName;
	private String ContactNumber;
	private String Email;
	private String Address;

	public Sellers() {
		super();
	}

	public Sellers(int sellerID, String userName, String password, String comapanyName, String contactNumber,
			String email, String address) {
		super();
		SellerID = sellerID;
		UserName = userName;
		Password = password;
		ComapanyName = comapanyName;
		ContactNumber = contactNumber;
		Email = email;
		Address = address;
	}

	public int getSellerID() {
		return SellerID;
	}

	public void setSellerID(int sellerID) {
		SellerID = sellerID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getComapanyName() {
		return ComapanyName;
	}

	public void setComapanyName(String comapanyName) {
		ComapanyName = comapanyName;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Sellers [SellerID=" + SellerID + ", UserName=" + UserName + ", Password=" + Password + ", ComapanyName="
				+ ComapanyName + ", ContactNumber=" + ContactNumber + ", Email=" + Email + ", Address=" + Address + "]";
	}

	public int createSeller(Sellers seller) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, ComapanyName, ContactNumber, Email, Password, SellerID, UserName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sellers other = (Sellers) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(ComapanyName, other.ComapanyName)
				&& Objects.equals(ContactNumber, other.ContactNumber) && Objects.equals(Email, other.Email)
				&& Objects.equals(Password, other.Password) && SellerID == other.SellerID
				&& Objects.equals(UserName, other.UserName);
	}

	public int updateSeller(Sellers seller) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int deleteSeller(Sellers seller) {
		// TODO Auto-generated method stub
		return 1;
	}
	
	

}
