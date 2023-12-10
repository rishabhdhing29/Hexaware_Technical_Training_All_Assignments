package com.hexaware.ecommerceapi.service;

import java.util.List;

import com.hexaware.ecommerceapi.dto.PaymentInformationDTO;
import com.hexaware.ecommerceapi.entities.PaymentInformation;

public interface IPaymentInformationService {


	public PaymentInformation addPaymentInformation(PaymentInformationDTO paymentInformationDTO);
	public PaymentInformation updatePaymentInformation(PaymentInformationDTO paymentInformationDTO);
	public void deletePaymentInformation(int paymentId);
	public PaymentInformationDTO getBypaymentId(int paymentId);
	public List<PaymentInformation> getAllPayments();
}
