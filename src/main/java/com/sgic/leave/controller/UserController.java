package com.sgic.leave.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.leave.entity.User;
import com.sgic.leave.service.UserService;

@RestController
public class UserController {
	@Autowired
	public UserService userservice;

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		boolean success = userservice.addUser(user);
		String result = "Add user failed";
		ResponseEntity<String> status = new ResponseEntity<>(result, HttpStatus.FORBIDDEN);
		if (success) {
			result = "Add user succesfully";
			status = new ResponseEntity<>(result, HttpStatus.OK);
		}
		return status;

	}

	@GetMapping("/user")
	public ResponseEntity<Iterable<User>> viewUser() {
		Iterable<User> role = userservice.viewUser();
		return new ResponseEntity<>(role, HttpStatus.OK);
	}

	@PutMapping("/user")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
		boolean success = userservice.updateUser(user);
		String result = "Update user failed";
		ResponseEntity<String> status = new ResponseEntity<>(result, HttpStatus.FORBIDDEN);
		if (success) {
			result = "Update user successfully";
			status = new ResponseEntity<>(result, HttpStatus.OK);
		}
		return status;

	}
	@DeleteMapping("/user")
	public ResponseEntity<String> deleteUser(@RequestBody User user){
		boolean success = userservice.deleteUser(user);
		String reult ="Delete user failed";
		ResponseEntity<String> status = new ResponseEntity<>(reult,HttpStatus.FORBIDDEN);
		if (success) {
			reult ="Delete successfully";
			status = new ResponseEntity<>(reult,HttpStatus.OK);
		}
		return status;
		
	}
}
