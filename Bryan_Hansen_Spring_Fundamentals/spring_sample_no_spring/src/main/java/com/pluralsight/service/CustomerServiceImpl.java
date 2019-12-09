package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	//FIrst iteration we are hardcoding the customer Repositoty
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
