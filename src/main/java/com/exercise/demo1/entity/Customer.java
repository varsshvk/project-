package com.exercise.demo1.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int customerId;
private String customerName;
private String customerEmail;
@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="fk_id")
private List<Product> product;

public List<Product> getProduct() {
	return product;
}
public void setProduct(List<Product> product) {
	this.product = product;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}

public Customer(int customerId, String customerName, String customerEmail) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerEmail = customerEmail;

}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

}
