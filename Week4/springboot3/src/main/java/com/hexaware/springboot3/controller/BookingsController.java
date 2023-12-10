package com.hexaware.springboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bookings")
public class BookingsController {
	
	@RequestMapping(path = "/openform", method = RequestMethod.GET)
	public String openform()
	{
		return "add_bookings";
	}
	
	

}
