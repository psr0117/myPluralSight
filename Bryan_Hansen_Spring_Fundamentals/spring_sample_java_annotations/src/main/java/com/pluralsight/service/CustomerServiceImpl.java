package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	
	private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImpl();
	
	public CustomerServiceImpl() {
		
	}
	
	@Autowired //using constructor autowiring
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
		
	}
	

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
