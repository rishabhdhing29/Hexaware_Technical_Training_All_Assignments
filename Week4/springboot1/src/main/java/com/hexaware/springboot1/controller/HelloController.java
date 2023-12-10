package com.hexaware.springboot1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springboot1.entities.Product;

@Controller
@RequestMapping("/controller")
public class HelloController {
    
	
	@RequestMapping(path="/hello",method=RequestMethod.GET)
	@ResponseBody
	public String sayHello() {
		return "<h1 style='color:blue'>Hello friends !</h1>";
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public String getProduct() {
		
		Product product = new Product(101,"Iphone",50000);
		return product.toString();
		
	}
	
	
}
