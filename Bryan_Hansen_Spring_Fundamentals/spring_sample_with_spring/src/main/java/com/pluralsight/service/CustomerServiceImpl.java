package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	// lets use setter injection to pass in customerRepositoryBean

	private CustomerRepository customerRepository;

	// constructor
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

//	//Commented this to do constructor injection
//	public void setCustomerRepository(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
