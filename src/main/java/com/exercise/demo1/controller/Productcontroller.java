package com.exercise.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.demo1.entity.Product;
import com.exercise.demo1.service.ProductService;

@RestController
public class Productcontroller {
	@Autowired
	private ProductService productService;
	
	@GetMapping("pagination")
    public ResponseEntity<Page<Product>> getProductsByField(
            @RequestParam String field,     
            @RequestParam int pageNo,       
            @RequestParam int pageSize) {   
        Page<Product> products = productService.getProductsByField(field, pageNo, pageSize);
        return ResponseEntity.ok(products);
    }
	
	
}