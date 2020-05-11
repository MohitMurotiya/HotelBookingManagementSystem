package com.cg.dao;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.model.Hotel;

@FeignClient(name = "HotelService")
@RibbonClient(name = "HotelService")
public interface HotelRepositoryProxy {

	@GetMapping("/hotels")
	public List<Hotel> findAll();
}
