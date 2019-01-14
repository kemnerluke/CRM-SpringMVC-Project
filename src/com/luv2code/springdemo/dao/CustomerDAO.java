package com.luv2code.springdemo.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

@Transactional
public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	void deleteCustomer(int theId);

}