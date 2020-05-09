/**
 * 
 */
package com.cg.room.dao;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.room.model.Room;


/**
 * @author HBMS
 *
 */
@FeignClient(name = "HotelManagement")
@RibbonClient(name = "HotelManagement")
public interface RoomRepositoryProxy {
	
	@PostMapping("/room/add")
	public void createRoom(@RequestBody Room room);
	
	@DeleteMapping("/room/delete/{roomId}")
	public void deleteRoom(@PathVariable Long roomId);
	
	@PutMapping("/room/update")
	public void updateRoom(@RequestBody Room room);
}
