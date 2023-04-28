package com.assignment.demo.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@NotNull
	private int userId;
	@NotEmpty
	private String userName;
	@Email
	private String userEmail;
	@Size(min=10,max=12)
	@Pattern(regexp = "^$|[0-9]{10}")
	private String phoneNumber;
	@Size(min=8,max=16)
	@Pattern(regexp = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$")
	private String createPassword;

}
