package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Sridhar","Pasup"));
		customers.add(new Customer("Peter","Hensen"));
		
		return customers;
		
	}

}
