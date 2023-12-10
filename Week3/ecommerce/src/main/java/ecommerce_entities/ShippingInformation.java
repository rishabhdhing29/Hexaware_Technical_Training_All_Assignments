package ecommerce_entities;

import java.util.Objects;

public class ShippingInformation {
    
	private int ShippingID;
	private int CustomerID;
	private String FirstName;
	private String LastName;
	private String Address;
	private String City;
	private String  State;
	private String PostalCode;
	private String Country;
	
	public ShippingInformation() {
		super();
	}

	public ShippingInformation(int shippingID, int customerID, String firstName, String lastName, String address,
			String city, String state, String postalCode, String country) {
		super();
		ShippingID = shippingID;
		CustomerID = customerID;
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		City = city;
		State = state;
		PostalCode = postalCode;
		Country = country;
	}

	public int getShippingID() {
		return ShippingID;
	}

	public void setShippingID(int shippingID) {
		ShippingID = shippingID;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "ShippingInformation [ShippingID=" + ShippingID + ", CustomerID=" + CustomerID + ", FirstName="
				+ FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City=" + City + ", State=" + State
				+ ", PostalCode=" + PostalCode + ", Country=" + Country + "]";
	}

	public int createShippingInformation(ShippingInformation shipping) {
		// TODO Auto-generated method stub
		return 1;
	}
	public int updateShippingInformation(ShippingInformation shipping) {
		// TODO Auto-generated method stub
		return 1;
	}
	public int deleteShippingInformation(ShippingInformation shipping) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, City, Country, CustomerID, FirstName, LastName, PostalCode, ShippingID, State);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShippingInformation other = (ShippingInformation) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(City, other.City)
				&& Objects.equals(Country, other.Country) && CustomerID == other.CustomerID
				&& Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName)
				&& Objects.equals(PostalCode, other.PostalCode) && ShippingID == other.ShippingID
				&& Objects.equals(State, other.State);
	}
	

}
