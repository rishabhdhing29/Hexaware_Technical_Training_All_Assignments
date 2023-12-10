package com.hexaware.ecommerceapi.service;

import java.util.List;

import com.hexaware.ecommerceapi.dto.ShippingInformationDTO;
import com.hexaware.ecommerceapi.entities.ShippingInformation;

public interface IShippingInformation {

	public ShippingInformation addShippingInformation(ShippingInformationDTO shippingInformationDTO);

	public ShippingInformation updateShippingInformation(ShippingInformationDTO shippingInformationDTO);

	public void deleteShippingInformation(int shippingId);

	public ShippingInformationDTO getShippingInformationById(int shippingId);

	public List<ShippingInformation> getAllShippingInformations();
}
