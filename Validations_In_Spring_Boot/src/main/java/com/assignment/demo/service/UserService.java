package com.assignment.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.demo.model.User;
import com.assignment.demo.repository.UserRepository;
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	public List<User> getAllUsers() {
		
		return userRepository.getAllUsers();
	}
	public void addUser(User user) {
		userRepository.save(user);
		
	}
	public User getUser(int userId) {
		
		return userRepository.getUser(userId);
	}
	public boolean updateUser(int userId, User user) {
		
		return userRepository.updateUser(userId,user);
	}
	public boolean deleteUser(int userId) {
		User user=userRepository.getUser(userId);
		if(user!=null) {
			return userRepository.remove(user);
		}
		return false;
	}

	
}
