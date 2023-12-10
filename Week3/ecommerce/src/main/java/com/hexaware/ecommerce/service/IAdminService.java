package com.hexaware.ecommerce.service;

import java.util.List;

import ecommerce_entities.Admin;

public interface IAdminService {
  
	
	public int createAdmin(Admin admin);
	public int updateAdmin(Admin admin);
	public int deleteAdmin(int aid);
	public Admin getAdminById(int aid);
	int deleteAdmin(Admin admin);
	public  List<Admin>  getAllAdmins();
	
}
