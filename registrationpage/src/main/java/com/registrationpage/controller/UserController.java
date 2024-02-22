package com.registrationpage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registrationpage.entity.User;
import com.registrationpage.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userservice;
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute User user)
	{
		userservice.saveUser(user);
		System.out.println("Data Stored Successfully!!!");
		return "redirect:/";
	}
	
	
}
