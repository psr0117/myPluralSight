package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("mycustomerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("xml_annotation","xml_annotation"));
		customers.add(new Customer("Peter","Hensen"));
		
		return customers;
		
	}

}
