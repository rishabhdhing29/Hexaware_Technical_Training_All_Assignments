package ecommerce_entities;

public class ResetPassword {
	
	private int ResetID;
	private int CustomerID;
	private String NewPassword;
	private int ResetOTP;
	
	public ResetPassword() {
		super();
	}

	public ResetPassword(int resetID, int customerID, String newPassword, int resetOTP) {
		super();
		ResetID = resetID;
		CustomerID = customerID;
		NewPassword = newPassword;
		ResetOTP = resetOTP;
	}

	public int getResetID() {
		return ResetID;
	}

	public void setResetID(int resetID) {
		ResetID = resetID;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getNewPassword() {
		return NewPassword;
	}

	public void setNewPassword(String newPassword) {
		NewPassword = newPassword;
	}

	public int getResetOTP() {
		return ResetOTP;
	}

	public void setResetOTP(int resetOTP) {
		ResetOTP = resetOTP;
	}

	@Override
	public String toString() {
		return "ResetPassword [ResetID=" + ResetID + ", CustomerID=" + CustomerID + ", NewPassword=" + NewPassword
				+ ", ResetOTP=" + ResetOTP + "]";
	}
	
	

	

}
