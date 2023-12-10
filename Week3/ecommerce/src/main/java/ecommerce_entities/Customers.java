package ecommerce_entities;

import java.util.Objects;

public class Customers {
	
	private int CustomerID;
	private String Password;
	private String FirstName;
	private String LastName;
	private String Email;
	private String PhoneNumber;
	private String Address;

	public Customers() {
		super();
	}

	public Customers(int customerID, String password, String firstName, String lastName, String email,
			String phoneNumber, String address) {
		super();
		CustomerID = customerID;
		Password = password;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		PhoneNumber = phoneNumber;
		Address = address;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Customers [CustomerID=" + CustomerID + ", Password=" + Password + ", FirstName=" + FirstName
				+ ", LastName=" + LastName + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber + ", Address="
				+ Address + "]";
	}

	public int createCutomers(Customers customer) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int updateCutomers(Customers customer) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int deleteCutomers(Customers customer) {
		// TODO Auto-generated method stub
		return 1;
	}

	public int getCutomersById(Customers customer) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, CustomerID, Email, FirstName, LastName, Password, PhoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(Address, other.Address) && CustomerID == other.CustomerID
				&& Objects.equals(Email, other.Email) && Objects.equals(FirstName, other.FirstName)
				&& Objects.equals(LastName, other.LastName) && Objects.equals(Password, other.Password)
				&& Objects.equals(PhoneNumber, other.PhoneNumber);
	}
	
	

}
