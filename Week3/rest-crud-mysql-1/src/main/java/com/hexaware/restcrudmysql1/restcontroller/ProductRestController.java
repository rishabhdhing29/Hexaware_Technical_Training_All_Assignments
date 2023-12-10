package com.hexaware.restcrudmysql1.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restcrudmysql1.entities.Product;
import com.hexaware.restcrudmysql1.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

	@Autowired
	IProductService service;

	@PutMapping(value = "/insert", consumes = "application/json", produces = "application/json")
	public Product insertProduct(@RequestBody Product product) {

		return service.insertProduct(product);

	}

	@PutMapping(value = "/update", consumes = "application/json", produces = "application/json")
	public Product updateProduct(@RequestBody Product product) {

		return service.updateProduct(product);

	}

	@GetMapping(value = "/getall", produces = "application/json")
	public List<Product> getAll() {

		return service.getAllProducts();

	}

	@DeleteMapping("/delete/{productId}")
	public String deleteProductById(@PathVariable int productId) {

		service.deleteProductById(productId);

		return "Record Deleted";

	}
	
	@GetMapping("/getbyproductId/{productId}")
	public Product   getProductByproductId(@PathVariable int productId) {
		
		return service.getById(productId);
		
	}

}
