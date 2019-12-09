package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("mycustomerService")
public class CustomerServiceImpl implements CustomerService {

	//FIrst iteration we are hardcoding the customer Repositoty
	
	//private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
//	//we can autowire bean like this without any constructor or setter injection
//	@Autowired
//	private CustomerRepository mycustomerRepository;
	
	// we can also do setter injection
	private CustomerRepository mycustomerRepository;
	
	@Autowired
	public void setMycustomerRepository(CustomerRepository mycustomerRepository) {
		System.out.println("we are using setter injection..");
		this.mycustomerRepository = mycustomerRepository;
	}


	@Override
	public List<Customer> findAll() {
		return mycustomerRepository.findAll();
	}
}
