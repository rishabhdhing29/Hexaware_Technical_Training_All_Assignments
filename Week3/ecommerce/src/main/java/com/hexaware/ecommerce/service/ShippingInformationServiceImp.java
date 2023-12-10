package com.hexaware.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import ecommerce_entities.ShippingInformation;

public class ShippingInformationServiceImp implements IShippingInformationService {

	public ShippingInformationServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int createShippingInformation(ShippingInformation shippinginformation) {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int updateShippingInformation(ShippingInformation shippinginformation) {
		// TODO Auto-generated method stub
		return 60;
	}

	@Override
	public int deleteShippingInformation(ShippingInformation shipping) {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public ShippingInformation getShippingInformationById(int shippingId) {
		ShippingInformation si = new ShippingInformation( 101,501,"Rishabh","Dhing","Indore","Ratlam","MP","457001","India");
		
		return si;
	}

	@Override
	public List<ShippingInformation> getAllShippingInformations() {
		// TODO Auto-generated method stub
		List<ShippingInformation>getShippingInformation = new ArrayList<>();
		getShippingInformation.add(new ShippingInformation( 101,501,"Rishabh","Dhing","Indore","Ratlam","MP","457001","India"));
		getShippingInformation.add(new ShippingInformation( 102,502,"Vishal","Anand","Bhopal","Ratlam","MP","457001","India"));
		return getShippingInformation;
	}

	@Override
	public int deleteShippingInformation(int shippingId) {
		// TODO Auto-generated method stub
		return 70;
	}

}
