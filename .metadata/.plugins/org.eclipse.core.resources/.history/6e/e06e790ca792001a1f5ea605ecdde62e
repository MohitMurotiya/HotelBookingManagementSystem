/**
 * 
 */
package com.cg.room.dao;


import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.room.model.Hotel;
import com.cg.room.model.Room;


/**
 * @author HBMS
 *
 */
@FeignClient(name = "HotelManagement")
@RibbonClient(name = "HotelManagement")
public interface RoomRepositoryProxy {
	
	@GetMapping("/rooms")
	public List<Room> findAllRooms();
	
	@GetMapping("/hotels")
	public List<Hotel> findAll();
}
