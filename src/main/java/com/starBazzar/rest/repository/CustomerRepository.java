package com.starBazzar.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starBazzar.rest.model.Dto.Customers;

public interface CustomerRepository extends JpaRepository<Customers, Integer>{

	Customers findByCardNo(Integer cardNo);
}
