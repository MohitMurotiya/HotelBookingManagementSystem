package com.cg.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.UserRepositoryProxy;
import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

@RestController
public class UserProxyController {
	
	@Autowired
	private UserRepositoryProxy proxy;
	
	@PostMapping("/user/registeration")
	public void registerUser(@RequestBody RegistrationModel user) {
		proxy.registerUser(user);
	}
	
	@PutMapping("/user/account/update")
	public void updateRegistrationDetails(@RequestBody RegistrationModel user) {
		proxy.updateRegistrationDetails(user);
	}
	
	@DeleteMapping("/user/account/delete/{username}")
	public void deleteUser(@PathVariable String username) {
		proxy.deleteUser(username);
	}
	
	@PutMapping("/user/logindetails/update")
	public void updateLoginDetails(@RequestBody LoginModel user) {
		proxy.updateLoginDetails(user);
	}
}
