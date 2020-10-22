package com.starBazzar.rest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starBazzar.rest.model.Dto.Users;
import com.starBazzar.rest.repository.UserRepository;
import com.starBazzar.rest.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public List<Users> userList() {
		return userRepository.findAll();
	}

	@Override
	public Users findOne(Integer id) {
		return userRepository.findById(id).get();
	}

	@Override
	public void  deleteUser(Integer id) {
		 userRepository.deleteById(id);
	}

	@Override
	public Users addUser(Users user) {
		return userRepository.save(user);
	}

	
	@Override
	public List<Users> findAllUser() {
		List<Users> user = userRepository.findAll();
		
		return user;
		}
	
}
