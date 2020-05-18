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

import com.cg.hotel.model.Hotel;
import com.cg.hotel.model.Room;
import com.cg.hotel.service.HotelService;
import com.cg.hotel.service.RoomService;

/**
 * @author HBMS HotelController.java May 2, 2020
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HotelController {

	@Autowired
	private HotelService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HotelController.class);
	
	@GetMapping("/hotels")
	public List<Hotel> findAll() {
		logger.info("Inside findALl() method of HotelController");
		return service.findAll();
	}

	@PostMapping("/hotel/add")
	public void createHotel(@RequestBody Hotel hotel) {
		logger.info("Inside createHotel() method of HotelController");
		service.createHotel(hotel);
	}

	@DeleteMapping("hotel/delete/{hotelId}")
	public void deleteHotel(@PathVariable Long hotelId) {
		logger.info("Inside deleteHotel() method of HotelController");
		service.deleteHotel(hotelId);
	}

	@PutMapping("hotel/update")
	public void updateHotel(@RequestBody Hotel hotel) {
		logger.info("Inside updateHotel() method of HotelController");
		service.updateHotel(hotel);
	}
}
