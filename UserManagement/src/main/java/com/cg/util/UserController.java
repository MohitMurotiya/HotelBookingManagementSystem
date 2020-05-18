/**
 * 
 */
package com.cg.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.RegistrationModel;
import com.cg.model.Address;
import com.cg.model.LoginModel;
import com.cg.service.UserManagementService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author User
 *
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserManagementService service;

	@PostMapping("/user/registeration")
	public void registerUser(@RequestBody RegistrationModel user) {
		logger.info("Inside registerUser() method of UserController");
		service.registerUser(user);
	}

	@PutMapping("/user/account/update")
	public void updateRegistrationDetails(@RequestBody RegistrationModel user) {
		logger.info("Inside updateRegistrationDetails() method of UserController");
		service.updateRegistrationDetails(user);
	}

	@DeleteMapping("/user/account/delete/{username}")
	public void deleteUser(@PathVariable String username) {
		logger.info("Inside deleteUser() method of UserController");
		service.deleteUser(username);
	}

	@PutMapping("/user/logindetails/update")
	public void updateLoginDetails(@RequestBody LoginModel user) {
		logger.info("Inside updateLoginDetails() method of UserController");
		service.updateLoginDetails(user);
	}
	
	@GetMapping("/users")
	public List<RegistrationModel> findAll(){
		logger.info("Inside updateLoginDetails() method of UserController");
		return service.findAll();
	}
	
	@GetMapping("/users/loginDetails")
	public List<LoginModel> findAllLoginDetails(){
		logger.info("Inside updateLoginDetails() method of UserController");
		return service.findAllLoginDetails();
	}
	
	@PutMapping("/user/addressDetails/update")
	public void updateAddressDetails(@RequestBody Address address) {
		logger.info("Inside updateAddressDetails() method of UserController");
		service.updateAddressDetails(address);
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
