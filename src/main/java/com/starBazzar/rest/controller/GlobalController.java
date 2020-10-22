package com.starBazzar.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.starBazzar.rest.exception.CustomeErrorConfig;
import com.starBazzar.rest.model.Dto.Users;
import com.starBazzar.rest.service.UserService;

@RestController
@RequestMapping("/global")
public class GlobalController {

	@Autowired
	private UserService userService;

	public GlobalController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/user")
	@ResponseBody
	public List<Users> getUsers(@PathParam("id") int id) {
		try {
			List<Users> user = userService.findAllUser();
			
			return user;
		}
		catch (Exception e) {

		}
		return null;
	}
	
	
	@GetMapping("/except")
	@ResponseBody
	public void message() throws CustomeErrorConfig {
		throw new CustomeErrorConfig();
	}
	
	
	
	
	
	
	
	
}
