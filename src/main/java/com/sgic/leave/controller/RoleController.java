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

import com.sgic.leave.entity.Role;
import com.sgic.leave.service.RoleService;

@RestController
public class RoleController {
	@Autowired
	public RoleService roleService;

//@PostMapping ("/role")
//public boolean addRoles(@RequestBody Role role) {
//	boolean success  = true;
//	roleService.addRole(role);
//	return success;
//	
//}
	@PostMapping("/role")
	public ResponseEntity<String> addRoles(@RequestBody Role role) {
		boolean success = roleService.addRole(role);
		String result = "Add role failed";
		ResponseEntity<String> status = new ResponseEntity<>(result, HttpStatus.FORBIDDEN);
		if (success) {
			result = "Add role sucessfully";
			status = new ResponseEntity<>(result, HttpStatus.OK);
		}

		return status;
	}

	@GetMapping("/role")
	public ResponseEntity<Iterable<Role>> viewRole() {
		Iterable<Role> role = roleService.viewRole();
		return new ResponseEntity<>(role, HttpStatus.OK);

	}

	@PutMapping("/role")
	public ResponseEntity<String> updadeRole(@RequestBody Role role) {
		boolean success = roleService.updadeRole(role);
		String result = "Update role failed";
		ResponseEntity<String> Status = new ResponseEntity<>(result, HttpStatus.FORBIDDEN);
		if (success) {
			result = "Update role sucessfully";
			Status = new ResponseEntity<>(result, HttpStatus.OK);
		}
		return Status;

	}
	@DeleteMapping("/role")
	public ResponseEntity<String> deleteRole(@RequestBody Role role){
		boolean success = roleService.deleteRole(role);
		String result ="Delete role failed";
		ResponseEntity<String> status = new ResponseEntity<>(result,HttpStatus.FORBIDDEN);
		if (success) {
			result = "Delete role sucessfully";
			status = new ResponseEntity<>(result,HttpStatus.OK);
		}
		return status;
		
	}

}
