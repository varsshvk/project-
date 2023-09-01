package com.exercise.demo1.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exercise.demo1.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
  
}
