package com.cg.hotel.service;

import java.util.List;

import com.cg.hotel.model.Room;

public interface RoomService {

	List<Room> findAll();

	void createRoom(Room room);

	void deleteRoom(Long roomId);

	void updateRoom(Room room);
}
