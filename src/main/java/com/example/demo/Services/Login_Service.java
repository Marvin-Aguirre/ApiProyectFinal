package com.example.demo.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Login;
import com.example.demo.Repository.Login_Repository;

@Service
public class Login_Service {
	@Autowired
	private Login_Repository repo;
  
  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
  	return user;
  }

}

	
