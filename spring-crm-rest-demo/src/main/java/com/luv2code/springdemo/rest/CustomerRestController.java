package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	// autowire the CustomerService
	@Autowired
	private CustomerService customerService;
	
	// add mapping for GET /customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		
		return customerService.getCustomers();
		
	}

	// add mapping for GET /customers
	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		
		if(id >= customerService.getCustomers().size() || id < 0) {
			throw new MyException("Student id not found : "+ id);
		}
		return customerService.getCustomer(id);
		
	}
	// add mapping for POST /customers
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		 customerService.saveCustomer(customer);
		 return customer;
	}
	
	// add mapping for PUT  /customers
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		 customerService.saveCustomer(customer);
		 return customer;
	}
	
	// delete mapping for DELETE /customers
	@DeleteMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable int id) {
		Customer customer = customerService.getCustomer(id);
		
		if(customer == null) {
			throw new MyException("Student id not found : "+ id);
		}
		 customerService.deleteCustomer(id);
		 return "Deleted Customer id "+ id;
		
	}
	
}


















