package com.cg.dao;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.model.Address;
import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

@FeignClient(name = "UserManagement")
@RibbonClient(name = "UserManagement")
public interface UserRepositoryProxy {
	
	@PostMapping("/user/registeration")
	void registerUser(@RequestBody RegistrationModel user);
	
	@PutMapping("/user/account/update")
	void updateRegistrationDetails(@RequestBody RegistrationModel user);
	
	@DeleteMapping("/user/account/delete/{username}")
	void deleteUser(@PathVariable String username);
	
	@PutMapping("/user/logindetails/update")
	void updateLoginDetails(@RequestBody LoginModel user);
	
	@PutMapping("/user/addressDetails/update")
	public void updateAddressDetails(@RequestBody Address address);
}
