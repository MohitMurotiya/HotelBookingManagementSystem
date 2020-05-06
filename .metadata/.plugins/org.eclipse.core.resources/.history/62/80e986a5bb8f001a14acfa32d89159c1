package com.cg.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.UserRepositoryProxy;
import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

@RestController
public class UserViewController {

	@Autowired
	private UserRepositoryProxy proxy;

	@GetMapping("/users")
	public List<RegistrationModel> findAll() {
		return proxy.findAll();
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
	public LoginModel findByUserName(@PathVariable String username, @PathVariable String password) {

		LoginModel login = proxy.findAllLoginDetails().stream().filter(user -> user.getUsername().equals(username))
				.findAny().get();
		if (login.getPassword().equals(password)) {
			return login;
		} else {
			return null;
		}
	}
}
