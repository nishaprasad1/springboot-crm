package com.springbootcrm.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcrm.entity.CustomerVO;
import com.springbootcrm.error.CustomerNotFoundException;
import com.springbootcrm.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public CustomerVO saveCustomer(CustomerVO customer) {
		return this.customerRepo.save(customer);
	}

	public Long getMaxId() {
		return this.customerRepo.maxCustomerId();
	}

	public List<CustomerVO> fetchCustomerList() {
		return this.customerRepo.findAll();
	}

	public CustomerVO fetchCustomerById(Long id) throws CustomerNotFoundException {
		Optional<CustomerVO> cust = this.customerRepo.findById(id);
		if(!cust.isPresent())
			throw new CustomerNotFoundException("Departent not found for id "+id);
		return cust.get();
	}

	public void deleteCustomerById(Long depId) {
		this.customerRepo.deleteById(depId);
	}

	public CustomerVO updateCustomer(Long custId, CustomerVO customer) throws CustomerNotFoundException {
		CustomerVO custDB= this.fetchCustomerById(custId);
		
		if(Objects.nonNull(customer.getCustFirstName()) 
				&& !customer.getCustFirstName().isEmpty())
			custDB.setCustFirstName(customer.getCustFirstName());

		if(Objects.nonNull(customer.getCustLastName()) 
				&& !customer.getCustLastName().isEmpty())
			custDB.setCustLastName(customer.getCustLastName());
		
		if(Objects.nonNull(customer.getCustEmailId()) 
				&& !customer.getCustEmailId().isEmpty())
			custDB.setCustEmailId(customer.getCustEmailId());
		return this.customerRepo.save(custDB);
	}

	public CustomerVO fetchCustomerByName(String name) {
		return this.customerRepo.findByCustFirstNameIgnoreCase(name);
	}

}
