package com.hexaware.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hexaware.security.entity.UserEntity;
import com.hexaware.security.repository.UserRepository;

public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity user = repo.findByUsername(username);
		if(user==null) {
			throw new UserNotFoundException();
		}
		return null;
	}

}
