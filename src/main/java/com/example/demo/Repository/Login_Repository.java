package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Login;

public interface Login_Repository extends JpaRepository<Login, Long>{
	Login findByUsernameAndPassword(String username, String password);
}

