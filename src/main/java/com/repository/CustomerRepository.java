package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	@Query("from Customer as c where c.firstName like :fname")
	List<Customer> findByFirstNameLike(@Param("fname")String firstName);
	
	List<Customer> findByLastNameLike(String lastName);
	
	List<Customer> findByLastNameAndFirstName(String lastName, String firstName);	

}
