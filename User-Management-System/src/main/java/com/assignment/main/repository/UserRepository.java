package com.assignment.main.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.assignment.main.model.User;

@Repository
public class UserRepository {

	private List<User> userList;
	
//	public UserRepository() {
//		userList = new ArrayList<>();
//		// not needed ...done for testing
//		userList.add(new User(0,"Santosh","santhoshguggilla@gmail.com","Hyderabad","6304443903"));
//
//	}

	public List<User> getUsersFromDataSource() {
		return userList;
	}

	public void save(User user) {
		userList.add(user);
		
	}

	public User getUser(int userId) {
		for (User user : userList) {
			if (user.getUserId()==userId) {
				return user;
			}
		}

		return null;
	}
	
	public void update(User newUser,int userId) {
		save(newUser);
		remove(getUser(userId));
	}
	
	public void remove(User user) {
		userList.remove(user);// mock a database
		
	}

}
