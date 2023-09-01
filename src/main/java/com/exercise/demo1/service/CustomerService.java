package com.exercise.demo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exercise.demo1.entity.Customer;

import com.exercise.demo1.repository.CustomerRepo;


@Service
public class CustomerService {
@Autowired
private CustomerRepo repository;

public Customer addproduct(Customer customer)
{
	return repository.save(customer);
}
public List<Customer> showdetails()
{
	return (List<Customer>)repository.findAll();
}
public Customer getById(Integer customerId) {
	return repository.findById(customerId).get();   
	}
public Optional<Customer> showbyid(int id){
	return repository.findById(id);
}
public Customer changeinfo(Customer customer) {
	return repository.saveAndFlush(customer);
}

public String updateinfobyid(int id,Customer customer) {
	repository.saveAndFlush(customer);
	if(repository.existsById(id)) {
		return "UPDATED";
	}
	else {
		return "Enter valid id";
	}
}
public void deleteinfo(Customer customer) {
	repository.delete(customer);
}

public void deleteid(int id) {
	repository.deleteById(id);
}

public void deletepid(int id) {
	repository.deleteById(id);
}

			}