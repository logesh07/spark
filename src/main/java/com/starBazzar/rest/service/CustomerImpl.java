package com.starBazzar.rest.service;

import java.util.List;

import com.starBazzar.rest.model.Dao.CustomerLookUpRequest;
import com.starBazzar.rest.model.Dto.Customers;

public interface CustomerImpl {

	 Customers customerList(CustomerLookUpRequest customerLookup);
	 
	 List<Customers> customerLis();
} 
 
