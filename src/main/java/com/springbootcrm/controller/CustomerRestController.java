package com.springbootcrm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcrm.entity.CustomerVO;
import com.springbootcrm.error.CustomerNotFoundException;
import com.springbootcrm.service.CustomerService;

import jakarta.validation.Valid;

@RestController
public class CustomerRestController {

	private final Logger LOGGER = LoggerFactory.getLogger(CustomerRestController.class);
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/welcome")
	public ResponseEntity<?> welcome(){
		return ResponseEntity.ok("Welcome to CRM app");
	}

	@PostMapping(value = "/customers")
	public CustomerVO saveCustomer(@Valid @RequestBody CustomerVO customer) {
		LOGGER.info("Customer <ADD>");
		Long maxId=this.customerService.getMaxId();
		customer.setCustId(maxId);
		LOGGER.info("add successfull, id: "+maxId);
		return this.customerService.saveCustomer(customer);
	}
	
	@GetMapping("/customers")
	public List<CustomerVO> fetchCustomerList(){
		LOGGER.info("Customer <SEARCH ALL> fetchCustomerList");
		return this.customerService.fetchCustomerList();
	}
	
	@GetMapping("/customers/{id}")
	public CustomerVO fetchCustomerById(@PathVariable("id") Long custId) throws CustomerNotFoundException {
		return this.customerService.fetchCustomerById(custId);
	}
	
	@DeleteMapping("/customers/{id}")
	public String deleteCustomerById(@PathVariable("id") Long custId) {
		this.customerService.deleteCustomerById(custId);
		return "Customer deleted"; 
	}
	
	@PutMapping("/customers/{id}")
	public CustomerVO updateCustomer(@PathVariable("id") Long custId,
										@Valid @RequestBody CustomerVO customer) throws CustomerNotFoundException {
		return this.customerService.updateCustomer(custId,customer);
	}
	
	@GetMapping("customers/name/{name}")
	public CustomerVO fetchCustomerByName(@PathVariable String name) {
		return this.customerService.fetchCustomerByName(name);
	}

}
