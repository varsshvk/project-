package com.exercise.demo1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exercise.demo1.entity.Product;

@Repository 
public interface ProductRepo extends JpaRepository<Product,Integer> {
     
	
}
