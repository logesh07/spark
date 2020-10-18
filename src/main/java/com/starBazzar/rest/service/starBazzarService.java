package com.starBazzar.rest.service;

import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.starBazzar.rest.exception.GlobalControllerExceptionHandler;

@Service
public class starBazzarService extends  GlobalControllerExceptionHandler {

	
	
	private RestTemplate restTemplate;

	public starBazzarService() {

		this.restTemplate = new RestTemplate();
	}

	public Map getMovieReview() {
		HttpHeaders header = new HttpHeaders();
		header.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> requestEntity = new HttpEntity<String>(header);

		ResponseEntity<Map> entity = restTemplate.exchange(AppConstants.url, HttpMethod.GET, requestEntity, Map.class);
		if (entity.getStatusCode() == HttpStatus.OK) {
			return entity.getBody();
		}
		return null ;

	}
	


}
