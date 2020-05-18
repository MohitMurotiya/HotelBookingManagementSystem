/**
 * 
 */
package com.cg.hotel.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hotel.dao.HotelRepositoryProxy;
import com.cg.hotel.model.Hotel;

/**
 * @author HBMS
 * May 2, 2020
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HotelServiceController {

	@Autowired
	private HotelRepositoryProxy proxy;
	
	private static final Logger logger = LoggerFactory.getLogger(HotelServiceController.class);
	
	@PostMapping("/hotel/add")
	public void createHotel(@RequestBody Hotel hotel) {
		logger.info("Inside createHotel() method of HotelServiceController");
		proxy.createHotel(hotel);
	}
	
	@DeleteMapping("hotel/delete/{hotelId}")
	public void deleteHotel(@PathVariable Long hotelId) {
		logger.info("Inside deleteHotel() method of HotelServiceController");
		proxy.deleteHotel(hotelId);
	}
	
	@PutMapping("/hotel/update")
	public void updateHotel(@RequestBody Hotel hotel) {
		logger.info("Inside updateHotel() method of HotelServiceController");
		proxy.updateHotel(hotel);
	}
}
