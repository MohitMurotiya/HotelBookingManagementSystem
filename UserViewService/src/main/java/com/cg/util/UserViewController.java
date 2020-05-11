package com.cg.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.UserRepositoryProxy;
import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserViewController {

	@Autowired
	private UserRepositoryProxy proxy;

	@GetMapping("/users")
	public List<RegistrationModel> findAll() {
		return proxy.findAll();
	}
	
	@GetMapping("/user/by/{userId}")
	public RegistrationModel findById(@PathVariable Integer userId) {
		return proxy.findAll().stream().filter(id -> id.getId()==userId).findAny().get();
	}

	@GetMapping("/users/loginDetails")
	public List<LoginModel> findAllLoginDetails() {
		return proxy.findAllLoginDetails();
	}

	@GetMapping("/users/role/{role}")
	public List<LoginModel> findByRole(@PathVariable String role) {
		System.out.println("Inside findByRole() method of UserViewController");
		return proxy.findAllLoginDetails().stream().filter(user -> user.getRole().equals(role))
				.collect(Collectors.toList());
	}

	@GetMapping("/user/username/{username}/password/{password}")
	public RegistrationModel findByUserName(@PathVariable String username, @PathVariable String password) {

		RegistrationModel model = proxy.findAll().stream().filter(register -> register.getUser().getUsername().equals(username)).findAny().get();
		if (model.getUser().getPassword().equals(password)) {
			return model;
		} else {
			return null;
		}
	}
}
