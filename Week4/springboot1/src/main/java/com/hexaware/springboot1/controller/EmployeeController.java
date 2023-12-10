package com.hexaware.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/products")
public class EmployeeController {
    
	@RequestMapping("/openform")
	public String openForm() {
		
		return "add_employee";
	}
	
	
	@RequestMapping(path="/add",method=RequestMethod.GET)
	@ResponseBody
	public String addProductData() {
		return "add() called";
	}
	
}
