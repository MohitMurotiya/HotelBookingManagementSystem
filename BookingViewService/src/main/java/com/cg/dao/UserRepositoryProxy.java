package com.cg.dao;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.model.RegistrationModel;

@FeignClient(name = "UserViewService")
@RibbonClient(name = "UserViewService")
public interface UserRepositoryProxy {
	
	@GetMapping("/users")
	public List<RegistrationModel> findAll();
}
