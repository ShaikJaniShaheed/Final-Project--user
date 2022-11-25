package com.cgi.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.user.entity.User;
import com.cgi.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User saveUser11(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		Optional <User> op= this.userRepository.findById(id);
		if(op.isPresent()) {
			return op.get();
	}
	else {
		return null;
	}
	
	}

	public User saveUser1(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}