package com.hexaware.assignment.service;

import java.util.List;

public interface IAdminService<Admin> {
	
	public boolean createAdmin(Admin admin);
    public boolean updateAdmin(Admin admin);
    public boolean deleteAdmin(Admin adminId);
    public boolean getAdminById(Admin adminId);
    public  List<Admin>  getAllAdmin();
}
