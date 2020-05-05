package com.cg.dao;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

@FeignClient(name = "UserManagement")
@RibbonClient(name = "UserManagement")
public interface UserRepositoryProxy {
	
	@GetMapping("/users")
	public List<RegistrationModel> findAll();
	
	@GetMapping("/users/loginDetails")
	public List<LoginModel> findAllLoginDetails();
}
