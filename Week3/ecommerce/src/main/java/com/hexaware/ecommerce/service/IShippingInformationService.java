package com.hexaware.ecommerce.service;

import java.util.List;
import ecommerce_entities.ShippingInformation;

public interface IShippingInformationService {
	public  int  createShippingInformation(ShippingInformation shippinginformation);
	public  int  updateShippingInformation(ShippingInformation shippinginformation);
	
	public  int  deleteShippingInformation(int shippingId);
	public  ShippingInformation  getShippingInformationById(int shippingId);
	
	public  List<ShippingInformation>  getAllShippingInformations();
	int deleteShippingInformation(ShippingInformation shipping);
}
