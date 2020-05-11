package com.cg.dao;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.model.Room;

@FeignClient(name = "RoomViewService")
@RibbonClient(name = "RoomViewService")
public interface RoomRepositoryProxy {
	
	@GetMapping("/rooms")
	public List<Room> findAll();
}
