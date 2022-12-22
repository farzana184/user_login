package com.login.userlogin.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.userlogin.model.User;
import com.login.userlogin.service.LoginService;



@RestController
public class LoginControllerImpl implements LoginController {
	
	@Autowired
	LoginService loginService ;
    
	Logger logger = LoggerFactory.getLogger(LoginControllerImpl.class);
	
	@GetMapping("/getUser")
	public String getUser()
	{
		return loginService.getUser();
	}
	@Override
	@PostMapping("/createUser")
	public String createUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return loginService.createUser(user);
	}
	@Override
	@PutMapping("/updateUser")
	public String updateUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		return loginService.updateUser(user);
	}
	@Override
	@DeleteMapping("/deleteUser/{username}")
	public String deleteUser(@PathVariable String username) {
		// TODO Auto-generated method stub
		logger.info("logincontrollerimp:deleteUser " + username);
		return loginService.deleteUser(username);
	}

}