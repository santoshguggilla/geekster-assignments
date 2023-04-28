package com.assignment.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.assignment.demo.model.User;
@Repository
public class UserRepository {

	private List<User> userList;
	
	public UserRepository() {
		userList = new ArrayList<>();
		// not needed ...done for testing
		userList.add(new User(0,"Santosh","santhoshguggilla@gmail.com","6304443903","12@Santosh"));
	}
	public List<User> getAllUsers() {
		return userList;
	}
	public void save(User user) {
		userList.add(user);
		
	}
	public User getUser(int userId) {
		for(User user:userList) {
			if(user.getUserId()==userId) return user;
		}
		return null;
	}
	public boolean updateUser(int userId,User newUser) {
		for(User user:userList) {
			if(user.getUserId()==userId) userList.remove(user);
		}
		newUser.setUserId(userId);
		save(newUser);
		return true;
	}
	public boolean remove(User user) {
		userList.remove(user);
		return true;
	}
	

}
