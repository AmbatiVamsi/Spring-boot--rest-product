package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.IProductService;


@RestController //http://localhost:9191/api/product
@RequestMapping("/api")
public class ProductController {

	@Autowired
	IProductService productService;
	
	@GetMapping("/products")
    public ResponseEntity<List<Product>> products() {
//        List<Product> productList = productService.getProductsFromDatabase();
        return  productService.getProductsFromDatabase();
       
    }
	@GetMapping("/products/{id}")
	Optional<Product>FindByProductId(@PathVariable int id){

	return productService.getProductById(id);

	}
	

	@DeleteMapping("deleteProductById/{id}")
	void deleteProductById(@PathVariable int id) {
		productService.deleteProductById(id);
	}
	
	@PostMapping("/products")
    public Product createProduct(@Validated @RequestBody Product newProduct) {
        return productService.createProduct(newProduct);
    }
	

	
    @PutMapping("/products/{id}")
    public ResponseEntity<Product> updateProduct
	(@PathVariable(value ="id") Integer productId, @Validated @RequestBody Product newProduct) {

	return productService.updateProduct(productId, newProduct);

}
    //http://localhost:9191/api/products?id=1
    //@GetMapping("/products/req")
    @GetMapping(path = "/products", produces = {MediaType.APPLICATION_XML_VALUE})
	Optional<Product>FindByProductIdUsingRequest(@RequestBody String id){
    	System.out.println("run");
	return productService.getProductById(Integer.parseInt(id));

	}
}
