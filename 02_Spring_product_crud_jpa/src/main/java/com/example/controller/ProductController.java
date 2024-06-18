package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.IProductService;


@RestController //http://localhost:9191/api/product
@RequestMapping("/api")
public class ProductController {

	@Autowired
	IProductService productService;
	
	@GetMapping("/product")
    String hello() {
        return "Hello World, Spring Boot +product controller works.... Welcome to You!";
    }
	
	List<Product> products() {
		return productService.getProductsFromDatabase();
	}
}
