package com.hexaware.ecommerce.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import ecommerce_entities.Admin;
class AdminServiceImpTest {
	AdminServiceImp adminservice= new AdminServiceImp();
	@Test
	void testCreateAdmin() {
		Admin admin = new Admin();
		int actual = adminservice.createAdmin(admin);
		assertEquals(10, actual);
	}
	@Test
	void testUpdateAdmin() {
		Admin admin = new Admin();
		int actual = adminservice.updateAdmin(admin);
		assertEquals(20, actual);
	}
	@Test
	void testDeleteAdmin() {
		Admin admin = new Admin();
		int actual = adminservice.deleteAdmin(admin);
		assertEquals(30, actual);
	}
	@Test
	void testGetAdminById() {
		Admin expected = new Admin(101,"rish","root","Rishabh","Dhing","rish@gmail.com","7610399344");
		Admin actual = adminservice.getAdminById(10);
		assertEquals(expected, actual);
	}
     
	@Test
	void testGetAllAdmins() {
		List<Admin>actual = adminservice.getAllAdmins();
		List<Admin>expected = new ArrayList<>();
		expected.add(new Admin(101,"rish","root","Rishabh","Dhing","rish@gmail.com","7610399344"));
		expected.add(new Admin(102,"hash","root","Vishal","Anand","vish@gmail.com","7610399344"));
		assertEquals(expected,actual);
	}
}
