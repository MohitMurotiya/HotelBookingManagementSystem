package com.cg.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.UserRepositoryProxy;
import com.cg.model.Address;
import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserProxyController {
	
	@Autowired
	private UserRepositoryProxy proxy;
	
	private static final Logger logger = LoggerFactory.getLogger(UserProxyController.class);
	
	@PostMapping("/user/registeration")
	public void registerUser(@RequestBody RegistrationModel user) {
		logger.info("Inside registerUser() method of UserProxyController");
		proxy.registerUser(user);
	}
	
	@PutMapping("/user/account/update")
	public void updateRegistrationDetails(@RequestBody RegistrationModel user) {
		logger.info("Inside updateRegistrationDetails() method of UserProxyController");
		proxy.updateRegistrationDetails(user);
	}
	
	@DeleteMapping("/user/account/delete/{username}")
	public void deleteUser(@PathVariable String username) {
		logger.info("Inside deleteUser() method of UserProxyController");
		proxy.deleteUser(username);
	}
	
	@PutMapping("/user/logindetails/update")
	public void updateLoginDetails(@RequestBody LoginModel user) {
		logger.info("Inside updateLoginDetails() method of UserProxyController");
		proxy.updateLoginDetails(user);
	}
	
	@PutMapping("/user/addressDetails/update")
	public void updateAddressDetails(@RequestBody Address address) {
		logger.info("Inside updateAddressDetails() method of UserProxyController");
		proxy.updateAddressDetails(address);
	}
}
