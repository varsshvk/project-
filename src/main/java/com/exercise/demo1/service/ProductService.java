package com.exercise.demo1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exercise.demo1.entity.Product;
import com.exercise.demo1.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepository;
	
	public Page<Product> getProductsByField(String field, int pageNo, int pageSize) {
		Sort sort = Sort.by(field);
		Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return productRepository.findAll(pageable);
	}

}