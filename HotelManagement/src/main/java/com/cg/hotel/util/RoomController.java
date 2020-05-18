/**
 * 
 */
package com.cg.hotel.util;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hotel.model.Room;
import com.cg.hotel.service.RoomService;

/**
 * @author HBMS
 * RoomController.java
 * May 8, 2020
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RoomController {
	
	@Autowired
	private RoomService service;
	
	private static final Logger logger = LoggerFactory.getLogger(RoomController.class);
	
	@GetMapping("/rooms")
	public List<Room> findAll(){
		logger.info("Inside findAll() method of RoomController");
		return service.findAll();
	}
	
	@PostMapping("/room/add")
	public void createRoom(@RequestBody Room room) {
		logger.info("Inside createRoom() method of RoomController");
		service.createRoom(room);
	}
	
	@DeleteMapping("/room/delete/{roomId}")
	public void deleteRoom(@PathVariable Long roomId) {
		logger.info("Inside deleteRoom() method of RoomController");
		service.deleteRoom(roomId);
	}
	
	@PutMapping("/room/update")
	public void updateRoom(@RequestBody Room room) {
		logger.info("Inside updateRoom() method of RoomController");
		service.updateRoom(room);
	}
	
}
