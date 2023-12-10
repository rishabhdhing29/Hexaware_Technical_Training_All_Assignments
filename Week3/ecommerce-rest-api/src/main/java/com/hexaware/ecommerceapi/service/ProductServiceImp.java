package com.hexaware.ecommerceapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.ecommerceapi.dto.ProductDTO;
import com.hexaware.ecommerceapi.entities.Product;
import com.hexaware.ecommerceapi.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService {

	@Autowired
	ProductRepository productRepo;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public Product addProduct(ProductDTO productDTO) {
		Product product = new Product();
		product.setProductId(productDTO.getProductId());
		product.setProductName(productDTO.getProductName());
		product.setProductQuantity(productDTO.getProductQuantity());
		product.setProductAmount(productDTO.getProductAmount());
		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(ProductDTO productDTO) {
		Product product = productRepo.findById(productDTO.getProductId()).orElse(new Product());
		product.setProductName(productDTO.getProductName());
		product.setProductQuantity(productDTO.getProductQuantity());
		product.setProductAmount(productDTO.getProductAmount());
		return productRepo.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		Product product = productRepo.findById(productId).orElse(null);
		productRepo.delete(product);

	}

	@Override
	public ProductDTO getByproductId(int productId) {
     Product product = productRepo.findById(productId).orElse(new Product());
	 return new ProductDTO(product.getProductId(),product.getProductName(),product.getProductQuantity(),product.getProductAmount());
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll(Sort.by("productName"));
	}

}
