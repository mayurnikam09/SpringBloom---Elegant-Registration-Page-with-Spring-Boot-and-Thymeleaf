package com.registrationpage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrationpage.entity.User;
import com.registrationpage.repository.userRepo;

@Service
public class UserService {

	@Autowired
	private userRepo userRepo;
	
	
	
	public User saveUser(User user)
	{
		return userRepo.save(user);
	}
}
