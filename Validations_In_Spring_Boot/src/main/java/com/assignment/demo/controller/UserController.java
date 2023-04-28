package com.assignment.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.demo.model.User;
import com.assignment.demo.service.UserService;

@RestController
@RequestMapping("/User/Validations/")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "User Added successfully";
	}
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") int userId) {
		return userService.getUser(userId);
	}
	@PutMapping("/updateUser/{id}")
	public String updateUser(@PathVariable("id") int userId,@Validated @RequestBody User user) {
		if(userService.updateUser(userId,user)) {
			return "User Updated successfully";
		}
		return "Invaild User id";
	}
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable("id") int userId) {
		if(userService.deleteUser(userId)) {
			return "User deleted Successfully";
		}
		return "Invaild User id";
	}

}
