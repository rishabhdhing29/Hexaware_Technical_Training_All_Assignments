package com.hexaware.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springboot3.entity.Bookings;

@SpringBootApplication
public class Springboot3Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Springboot3Application.class, args);

		
		Bookings b=context.getBean(Bookings.class);
	
	
		System.out.println(b);
	}

}
