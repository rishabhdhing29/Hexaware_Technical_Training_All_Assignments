package ecommerce_entities;

import java.util.Objects;

public class Admin {
	
	private int AdminID;
	private String Username;
	private String Password;
	private String FirstName;
	private String LastName;
	private String Email;
	private String PhoneNumber;
	
	public Admin() {
		super();
	}
	
	

	public Admin(int adminID, String username, String password, String firstName, String lastName, String email,
			String phoneNumber) {
		super();
		AdminID = adminID;
		Username = username;
		Password = password;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		PhoneNumber = phoneNumber;
	}

	public int getAdminID() {
		return AdminID;
	}

	public void setAdminID(int adminID) {
		AdminID = adminID;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
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

	@Override
	public String toString() {
		return "Admin [AdminID=" + AdminID + ", Username=" + Username + ", Password=" + Password + ", FirstName="
				+ FirstName + ", LastName=" + LastName + ", Email=" + Email + ", PhoneNumber=" + PhoneNumber + "]";
	}



	public int createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 1;
	}



	public int updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 1;
	}



	public int DeleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 1;
	}



	public int getAdminById(Admin admin) {
		// TODO Auto-generated method stub
		return 1;
	}



	@Override
	public int hashCode() {
		return Objects.hash(AdminID, Email, FirstName, LastName, Password, PhoneNumber, Username);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		return AdminID == other.AdminID && Objects.equals(Email, other.Email)
				&& Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName)
				&& Objects.equals(Password, other.Password) && Objects.equals(PhoneNumber, other.PhoneNumber)
				&& Objects.equals(Username, other.Username);
	}

	
	
	

	

}
