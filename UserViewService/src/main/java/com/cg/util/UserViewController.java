package com.cg.util;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.UserRepositoryProxy;
import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@Api(value = "API exposure UserViewService")
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserViewController {

	@Autowired
	private UserRepositoryProxy proxy;
	
	private static final Logger logger = LoggerFactory.getLogger(UserViewController.class);

	@GetMapping("/users")
	@ApiOperation(value = "findAllUsers")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = RegistrationModel.class),
			@ApiResponse(code = 500, message = "Failure", response = RegistrationModel.class) })
	public List<RegistrationModel> findAll() {
		logger.info("Inside findAll method of UserViewController");
		return proxy.findAll();
	}
	
	@GetMapping("/user/by/{userId}")
	@ApiOperation(value = "findUserById")
	public RegistrationModel findById(@PathVariable Integer userId) {
		logger.info("Inside findById method of UserViewController");
		return proxy.findAll().stream().filter(id -> id.getId()==userId).findAny().get();
	}

	@GetMapping("/users/loginDetails")
	@ApiOperation(value = "findUserLoginDetails")
	public List<LoginModel> findAllLoginDetails() {
		logger.info("Inside findAllLoginDetails method of UserViewController");
		return proxy.findAllLoginDetails();
	}

	@GetMapping("/users/role/{role}")
	@ApiOperation(value = "findRoleOfUser")
	public List<LoginModel> findByRole(@PathVariable String role) {
		logger.info("Inside findByRole() method of UserViewController");
		return proxy.findAllLoginDetails().stream().filter(user -> user.getRole().equals(role))
				.collect(Collectors.toList());
	}

	@GetMapping("/user/username/{username}/password/{password}")
	@ApiOperation(value = "findUserByUserName")
	public RegistrationModel findByUserName(@PathVariable String username, @PathVariable String password) {
		logger.info("Inside findByUserName method of UserViewController");
		RegistrationModel model = proxy.findAll().stream().filter(register -> register.getUser().getUsername().equals(username)).findAny().get();
		if (model.getUser().getPassword().equals(password)) {
			return model;
		} else {
			return null;
		}
	}
}
