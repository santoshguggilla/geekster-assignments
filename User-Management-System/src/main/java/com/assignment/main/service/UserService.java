package com.assignment.main.service;

import java.util.List;

import com.assignment.main.model.User;

public interface UserService {

	public void addUser(User user);

	public User getUser(int userId);

	public List<User> getAllUsers();

	public boolean updateUser(int userId,User user);

	public boolean deleteUser(int userId);
}
