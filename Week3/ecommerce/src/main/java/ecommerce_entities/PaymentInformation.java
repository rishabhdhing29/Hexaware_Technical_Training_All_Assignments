package ecommerce_entities;

public class PaymentInformation {
	
	private int PaymentID;
	private int CustomerID;
	private String CardNumber;
	private String ExpiryDate;
	private String CVV;

	public PaymentInformation() {
		super();
	}

	public PaymentInformation(int paymentID, int customerID, String cardNumber, String expiryDate, String cVV) {
		super();
		PaymentID = paymentID;
		CustomerID = customerID;
		CardNumber = cardNumber;
		ExpiryDate = expiryDate;
		CVV = cVV;
	}

	public int getPaymentID() {
		return PaymentID;
	}

	public void setPaymentID(int paymentID) {
		PaymentID = paymentID;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCardNumber() {
		return CardNumber;
	}

	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}

	public String getExpiryDate() {
		return ExpiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}

	public String getCVV() {
		return CVV;
	}

	public void setCVV(String cVV) {
		CVV = cVV;
	}

	@Override
	public String toString() {
		return "PaymentInformation [PaymentID=" + PaymentID + ", CustomerID=" + CustomerID + ", CardNumber="
				+ CardNumber + ", ExpiryDate=" + ExpiryDate + ", CVV=" + CVV + "]";
	}
	
	

}
