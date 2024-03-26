package com.example.Customerdb;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {
	
	@Id
    @Column(name= "Customer_number")
	private  Integer CustomerNo;	
	public Integer getCustomerNo() {
		return CustomerNo;
	}
	public void setCustomerNo(Integer customerNo) {
		CustomerNo = customerNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private  String name;
	private  Integer mobileNo;
	private  String email;
	
	
	
 
   
}
