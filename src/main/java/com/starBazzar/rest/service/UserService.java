package com.starBazzar.rest.service;

import java.util.List;

import com.starBazzar.rest.model.Dto.Users;

public interface UserService{

	List<Users> userList();

	Users findOne(Integer id);

	Users addUser(Users user);

	void deleteUser(Integer id);

	List<Users> findAllUser();

}
