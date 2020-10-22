package com.starBazzar.rest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.starBazzar.rest.model.Dao.CustomerLookUpRequest;
import com.starBazzar.rest.model.Dto.Customers;
import com.starBazzar.rest.service.CustomerImpl;
import com.starBazzar.rest.serviceImpl.starBazzarServiceImpl;;

@RestController
@RequestMapping("/applicationManagement")
public class starBazzarController {

	private static final Logger log = LoggerFactory.getLogger(starBazzarController.class);

	public starBazzarServiceImpl starBazzarService;

	public CustomerImpl CustomerImpl;

	@Autowired
	public starBazzarController(starBazzarServiceImpl starBazzarService, CustomerImpl customerImpl) {

		this.starBazzarService = starBazzarService;
		this.CustomerImpl = customerImpl;
	}

	@GetMapping("/hao")
	public String hello() {
		return "Hello";
	}

	@GetMapping("/movie")
	@ResponseBody
	public Map movieBody() {
		try {
			log.info("enter into MovieBody ");
			return starBazzarService.getMovieReview();

		} catch (Exception ex) {

			log.info("Error Occured" + ex.getMessage());
		}
		log.info("Exit into MovieBody ");
		return null;
	}

	@PostMapping(path = "/customer",
			produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public Customers customerLookUp(@RequestBody CustomerLookUpRequest customerLookup) {
		System.out.println(customerLookup.toString());

		log.info("enter into MovieBody " + customerLookup.toString());
		Customers custList = new Customers();
		try {
			/*
			 * if (customerLookup.getName().isBlank() && customerLookup.getName().isEmpty())
			 * { throw new UnhandledException(); }
			 */			
			System.out.println(customerLookup.toString());
			custList = CustomerImpl.customerList(customerLookup);

		} catch (Exception ex) {

			log.info("Error Occured" + ex.getMessage());
		}
		log.info("Exit into MovieBody ");
		return custList;
	}

	@RequestMapping(path = "/list",method = RequestMethod.POST)
	@ResponseBody
	public List<Customers> customer() {
		List<Customers> custList = new ArrayList<Customers>();

		try {
			log.info("enter into MovieBody ");
			custList = CustomerImpl.customerLis();

		} catch (Exception ex) {

			log.info("Error Occured" + ex.getMessage());
		}
		log.info("Exit into MovieBody ");

		return custList;
	}

}
