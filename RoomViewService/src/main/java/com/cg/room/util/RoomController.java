package com.cg.room.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.room.model.Hotel;
import com.cg.room.dao.RoomRepositoryProxy;
import com.cg.room.model.Room;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RoomController {
	
	@Autowired
	private RoomRepositoryProxy proxy;
	
	@GetMapping("/rooms")
	public List<Room> findAll(){
		return proxy.findAllRooms();
	}
	
	@GetMapping("/room/by/{roomId}")
	public Room findById(@PathVariable Long roomId) {
		return proxy.findAllRooms().stream().filter(room -> room.getId()==roomId).findAny().get();
	}
	
	@GetMapping("/rooms/hotelName/{hotelId}")
	public List<Room> findRoomsByHotelName(@PathVariable Long hotelId) {
		Hotel hotel = proxy.findAll().stream().filter(h -> h.getHotelId()==hotelId).findAny().get();
		return hotel.getRooms().stream().filter(l -> l.isAvailability()==true).collect(Collectors.toList());
	}
	
	@GetMapping("/rooms/hotelName/{hotelId}/roomType/{type}")
	public List<Room> findRoomsByType(@PathVariable Long hotelId, @PathVariable String type){
		Hotel hotel = proxy.findAll().stream().filter(h -> h.getHotelId()==hotelId).findAny().get();
		return hotel.getRooms().stream().filter(l -> l.getRoomType().equals(type) && l.isAvailability()==true).collect(Collectors.toList());
	}
	
	@GetMapping("/rooms-admin/hotelName/{hotelId}")
	public List<Room> findRoomsByHotel(@PathVariable Long hotelId) {
		Hotel hotel = proxy.findAll().stream().filter(h -> h.getHotelId()==hotelId).findAny().get();
		return hotel.getRooms();
	}
	
	@GetMapping("/rooms-admin/hotelName/{hotelId}/roomType/{type}")
	public List<Room> findRooms(@PathVariable Long hotelId, @PathVariable String type){
		Hotel hotel = proxy.findAll().stream().filter(h -> h.getHotelId()==hotelId).findAny().get();
		return hotel.getRooms().stream().filter(l -> l.getRoomType().equals(type)).collect(Collectors.toList());
	}
}
