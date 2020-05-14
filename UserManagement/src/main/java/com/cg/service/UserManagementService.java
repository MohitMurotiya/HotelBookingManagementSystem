package com.cg.service;

import java.util.List;

import com.cg.model.Address;
import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

public interface UserManagementService {

	List<RegistrationModel> findAll();

	void registerUser(RegistrationModel user);

	void updateRegistrationDetails(RegistrationModel user);

	void deleteUser(String name);

	List<LoginModel> findAllLoginDetails();

	void updateLoginDetails(LoginModel user);
	
	void updateAddressDetails(Address address);

	// List<LoginModel> findByRole(String role);

	// LoginModel findByUsername(String username);

}
