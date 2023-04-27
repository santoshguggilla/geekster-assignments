package com.assignment.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

	private int userId;
	private String name;
	private String emailId;
	private String address;
	private String phone_Number;

}
