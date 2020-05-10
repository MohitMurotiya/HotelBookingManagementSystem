/**
 * 
 */
package com.cg.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hotel.dao.RoomRepository;
import com.cg.hotel.model.Room;

/**
 * @author HBMS
 * RoomServiceImpl.java
 * May 7, 2020
 */

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	private RoomRepository repos;

	@Override
	public List<Room> findAll() {
		System.out.println("Inside findAll() method of RoomServiceImpl");
		return repos.findAll();
	}

	@Override
	public void createRoom(Room room) {
		System.out.println("Inside createHotel() method of RoomServiceImpl");
		repos.save(room);
	}

	@Override
	public void deleteRoom(Long roomId) {
		System.out.println("Inside deleteHotel() method of RoomServiceImpl");
		repos.deleteById(roomId);
	}

	@Override
	public void updateRoom(Room room) {
		
		System.out.println("Inside updateHotel() method of RoomServiceImpl");
		//repos.deleteById(room.getId());
		repos.save(room);
	}
}
