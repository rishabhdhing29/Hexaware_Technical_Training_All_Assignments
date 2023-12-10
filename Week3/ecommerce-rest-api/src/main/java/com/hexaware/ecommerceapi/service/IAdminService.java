package com.hexaware.ecommerceapi.service;

import java.util.List;

import com.hexaware.ecommerceapi.dto.AdminDTO;
import com.hexaware.ecommerceapi.entities.Admin;

public interface IAdminService {

	public Admin createAdmin(AdminDTO adminDTO);
	public Admin updateAdmin(AdminDTO adminDTO);
	public void deleteAdmin(int adminId);
	public AdminDTO getAdminById(int adminId );
	public List<Admin> getAllAdmins();


}
