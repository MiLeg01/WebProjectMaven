package com.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.Customer;
import com.repository.CustomerRepository;

@Service("daoBean")
public class CustomerSpringDataDaoImpl implements CustomerSpringDataDao {
	
	CustomerRepository repository;

	@Autowired
	public void setRepository(CustomerRepository repository) {
		this.repository = repository;
	}

	public CustomerSpringDataDaoImpl() {}

	public List<Customer> getAllCustomer() {
		return repository.findAll();
	}

	public Customer getCustomerById(Long id) {
		return repository.findOne(id);
	}

	public void addCustomer(Customer cust) {
		repository.save(cust);
	}

	public void deleteCustomer(Customer cust) {
		repository.delete(cust);
	}

	public void updateCustomer(Long id, Customer updatedcust) {
		Customer cust = this.getCustomerById(id);
		updatedcust.setId(cust.getId());
		if(cust != null)
			repository.save(updatedcust);
		else
			System.out.println("Customer does not exist");
	}

	public List<Customer> findByFirstNameLike(String firstName) {
		return repository.findByFirstNameLike(firstName);
	}

	public List<Customer> findByLastNameLike(String lastName) {
		return repository.findByLastNameLike(lastName);
	}

	public List<Customer> findByLastNameAndFirstName(String lastName, String firstName) {
		return repository.findByLastNameAndFirstName(lastName, firstName);
	}

}
