package com.assignment.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.main.model.User;
import com.assignment.main.repository.UserRepository;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User getUser(int userId) {
		
		return userRepository.getUser(userId);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.getUsersFromDataSource();
	}

	@Override
	public boolean updateUser(int userId,User newUser) {
		// TODO Auto-generated method stub
		User user=userRepository.getUser(userId);
		if(user != null) {
			userRepository.update(newUser, userId);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		User user=userRepository.getUser(userId);
		if(user != null) {
			userRepository.remove(user);
			return true;
		}
		return false;
		
	}
	

}
