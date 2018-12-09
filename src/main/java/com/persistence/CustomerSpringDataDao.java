package com.persistence;

import java.util.List;

import com.domain.Customer;


public interface CustomerSpringDataDao {
	
	List<Customer> getAllCustomer();
	Customer getCustomerById(Long id);
	void addCustomer(Customer cust);
	void deleteCustomer(Customer cust);
	void updateCustomer(Long id, Customer updatedcust);
	
	List<Customer> findByFirstNameLike(String firstName);
	List<Customer> findByLastNameLike(String lastName);
	List<Customer> findByLastNameAndFirstName(String lastName, String firstName);
}


