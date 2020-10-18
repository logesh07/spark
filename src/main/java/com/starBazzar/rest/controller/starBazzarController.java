package com.starBazzar.rest.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.starBazzar.rest.service.starBazzarService;;

@RestController
@RequestMapping("/applicationManagement")
public class starBazzarController {

	private static final Logger log = LoggerFactory.getLogger(starBazzarController.class);

	public starBazzarService starBazzarService;

	public starBazzarController(starBazzarService starBazzarService) {

		this.starBazzarService = starBazzarService;
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

}
