/**
 * 
 */
package com.cg.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.RegistrationModel;
import com.cg.model.LoginModel;
import com.cg.service.UserManagementService;

/**
 * @author User
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserManagementService service;

	@PostMapping("/user/registeration")
	public void registerUser(@RequestBody RegistrationModel user) {
		System.out.println("Inside registerUser() method of UserController");
		service.registerUser(user);
	}

	@PutMapping("/user/account/update")
	public void updateRegistrationDetails(@RequestBody RegistrationModel user) {
		System.out.println("Inside updateRegistrationDetails() method of UserManagementServiceImpl");
		service.updateRegistrationDetails(user);
	}

	@DeleteMapping("/user/account/delete/{username}")
	public void deleteUser(@PathVariable String username) {
		service.deleteUser(username);
	}

	@PutMapping("/user/logindetails/update")
	public void updateLoginDetails(@RequestBody LoginModel user) {
		System.out.println("Inside updateLoginDetails() method of UserController");
		service.updateLoginDetails(user);
	}
	
	@GetMapping("/users")
	public List<RegistrationModel> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/users/loginDetails")
	public List<LoginModel> findAllLoginDetails(){
		return service.findAllLoginDetails();
	}
}

/*
 * @GetMapping("/users/{role}") public List<LoginModel> findByRole(@PathVariable
 * String role){
 * System.out.println("Inside findByRole() method of UserController"); return
 * service.findByRole(role); }
 */

/*
 * @GetMapping("/user/username/{user}/and/password/{pass}") public LoginModel
 * findByUserName(@PathVariable String user, @PathVariable String pass) {
 * System.out.println("Inside findByUserName() method of UserController");
 * LoginModel u = service.findByUsername(user); if(u.getPassword().equals(pass))
 * { return u; } else return null; }
 */
