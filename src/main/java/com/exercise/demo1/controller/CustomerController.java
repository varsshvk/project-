package com.exercise.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.demo1.entity.Customer;
import com.exercise.demo1.service.CustomerService;


@RestController
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/save")
	public Customer addProductData(@RequestBody Customer customer )
	{
		return service.addproduct(customer);
	}
	@GetMapping("/showdetails")
	public List<Customer> show(){
		return (List<Customer>)service.showdetails();
	}
	@GetMapping("/get{productId}")
	public Customer getByproductId(@PathVariable Integer customerId) {
		return service.getById (customerId);
	}

@PutMapping("update")
	public Customer modify(@RequestBody Customer customer ) {
		return service.changeinfo(customer);
	}
	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id, @RequestBody Customer customer) {
		return service.updateinfobyid(id,customer);
	}
	@DeleteMapping("deletedetail")
		public String del(@RequestBody Customer customer) {
			service.deleteinfo(customer);
			return "Deleted successfully";
		}
	
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id) {
		service.deleteid(id);
	}
	
	@DeleteMapping("delparamid")
	public void deletemyparamid (@RequestParam int id) {
		service.deletepid(id);
	}
	}