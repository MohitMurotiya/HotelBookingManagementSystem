package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.model.LoginModel;
import com.cg.model.RegistrationModel;

public interface RegistrationRepository extends JpaRepository<RegistrationModel, Integer> {
	
	@Transactional
	void deleteByUser(LoginModel user);
}
