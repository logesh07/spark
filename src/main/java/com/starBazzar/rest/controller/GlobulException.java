package com.starBazzar.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobulException {

	@GetMapping("/global")
	@ResponseBody
	public void exception() throws Exception
	{
		throw new Exception();
	}
	
	@GetMapping("/hao")
	@ResponseBody
	public String hello() {
		return "login";
	}
}

