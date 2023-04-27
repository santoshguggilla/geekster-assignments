package com.assignment.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.main.model.User;
import com.assignment.main.service.UserService;

@RestController
@RequestMapping("/UserManagement")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "User added Successfully";
	}
	
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable int userId ) {
		return	userService.getUser(userId);
	}
	
	@PutMapping("/updateUser/{userId}")
	public String updateUser(@PathVariable int userId,@RequestBody User user) {
		if(userService.updateUser(userId,user))
			return "Updated Successfully";
		return "Invaid userId";
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public String deleteUser(@PathVariable int userId) {
		if(userService.deleteUser(userId))
			return "Deleted Successfully";
		return "Invalid userId";
	}

}
