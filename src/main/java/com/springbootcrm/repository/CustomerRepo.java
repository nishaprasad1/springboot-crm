package com.springbootcrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springbootcrm.entity.CustomerVO;

@Repository
public interface CustomerRepo extends JpaRepository<CustomerVO, Long> {
	
	@Query("select coalesce(max(custId),0) + 1 from CustomerVO")
	public long maxCustomerId();
	
	public CustomerVO findByCustFirstName(String departmentName);
	
	public CustomerVO findByCustFirstNameIgnoreCase(String customerName);

}
