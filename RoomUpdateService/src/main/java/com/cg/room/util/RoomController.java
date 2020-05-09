/**
 * 
 */
package com.cg.room.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.room.dao.RoomRepositoryProxy;
import com.cg.room.model.Room;

/**
 * @author HBMS
 * RoomController.java
 * May 8, 2020
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RoomController {
	
	@Autowired
	private RoomRepositoryProxy proxy;
	
	@PostMapping("/room/add")
	public void createRoom(@RequestBody Room room) {
		proxy.createRoom(room);
	}
	
	@DeleteMapping("/room/delete/{roomId}")
	public void deleteRoom(@PathVariable Long roomId) {
		proxy.deleteRoom(roomId);
	}
	
	@PutMapping("/room/update")
	public void updateRoom(@RequestBody Room room) {
		proxy.updateRoom(room);
	}
	
}
