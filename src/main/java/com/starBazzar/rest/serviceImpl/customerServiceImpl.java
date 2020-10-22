package com.starBazzar.rest.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starBazzar.rest.model.Dao.CustomerLookUpRequest;
import com.starBazzar.rest.model.Dto.Customers;
import com.starBazzar.rest.repository.CustomerRepository;
import com.starBazzar.rest.service.CustomerImpl;

@Service
public class customerServiceImpl implements CustomerImpl {

	private static final Logger log = LoggerFactory.getLogger(customerServiceImpl.class);

	private CustomerRepository customerRepository;

	@Autowired
	public customerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public Customers customerList(CustomerLookUpRequest customerLookup) {
		List<Customers> customer = customerRepository.findAll();
		
		Customers Customers =customerRepository.findByCardNo(customerLookup.getCardNo());
		
		log.info("Customers findByCardNo " +Customers.toString());

		return Customers;
	}

	@Override
	public List<Customers> customerLis() {
		List<Customers> customer = customerRepository.findAll();
		return customer;
	}

}
