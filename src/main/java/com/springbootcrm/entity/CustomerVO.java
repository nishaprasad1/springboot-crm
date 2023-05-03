package com.springbootcrm.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


/**
 * The persistent class for the CUSTOMER database table.
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM CustomerVO c")
@Table(name = "CUSTOMER")
public class CustomerVO implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@Column(name="CUST_ID")
	private Long custId;

	@Column(name="CUST_EMAIL_ID")
	private String custEmailId;

	@Column(name="CUST_FIRST_NAME")
	private String custFirstName;

	@Column(name="CUST_LAST_NAME")
	private String custLastName;

	public CustomerVO() {
	}

	public CustomerVO(Long custId, String custEmailId, String custFirstName, String custLastName) {
		super();
		this.custId = custId;
		this.custEmailId = custEmailId;
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
	}

	public Long getCustId() {
		return this.custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustEmailId() {
		return this.custEmailId;
	}

	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}

	public String getCustFirstName() {
		return this.custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return this.custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	@Override
	public String toString() {
		return "CustomerVO [custId=" + custId + ", custEmailId=" + custEmailId + ", custFirstName=" + custFirstName
				+ ", custLastName=" + custLastName + "]";
	}

}