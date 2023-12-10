package com.hexaware.springboot1;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.hexaware.springboot1.entities.Employee;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Springboot1Application.class, args);

		Employee emp = context.getBean(Employee.class);
		System.out.print(emp);

	}
}