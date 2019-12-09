package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	public HibernateCustomerRepositoryImpl() {
		
	}
	
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Sridhar","Pasup"));
		customers.add(new Customer("Peter","Hensen"));
		
		return customers;
		
	}

}
