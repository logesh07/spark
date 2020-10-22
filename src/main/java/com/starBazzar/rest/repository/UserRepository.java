package com.starBazzar.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.starBazzar.rest.model.Dto.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

	Users findByUsername(String username);

}
