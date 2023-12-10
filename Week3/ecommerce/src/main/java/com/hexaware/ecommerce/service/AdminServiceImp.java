package com.hexaware.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import ecommerce_entities.Admin;

public class AdminServiceImp implements IAdminService {

	public AdminServiceImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int createAdmin(Admin admin) {
		return 10;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int updateAdmin(Admin admin) {
		return 20;
		
	}

	@Override
	public int deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return 30;
	}

	@Override
	public Admin getAdminById(int aid) {
		Admin admin = new Admin(101,"rish","root","Rishabh","Dhing","rish@gmail.com","7610399344");
		return admin;
	}

	@Override
	public int deleteAdmin(int aid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Admin> getAllAdmins() {
		List<Admin>getadmins = new ArrayList<>();
		getadmins.add(new Admin(101,"rish","root","Rishabh","Dhing","rish@gmail.com","7610399344"));
		getadmins.add(new Admin(102,"hash","root","Vishal","Anand","vish@gmail.com","7610399344"));
		return getadmins;
	}

}
