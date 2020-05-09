/**
 * 
 */
package com.cg.hotel.util;


import org.springframework.beans.factory.annotation.Autowired;
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
public class HotelServiceController {

	@Autowired
	private HotelRepositoryProxy proxy;
	
	@PostMapping("/hotel/add")
	public void createHotel(@RequestBody Hotel hotel) {
		proxy.createHotel(hotel);
	}
	
	@DeleteMapping("hotel/delete/{hotelId}")
	public void deleteHotel(@PathVariable Long hotelId) {
		proxy.deleteHotel(hotelId);
	}
	
	@PutMapping("/hotel/update")
	public void updateHotel(@RequestBody Hotel hotel) {
		proxy.updateHotel(hotel);
	}
}
