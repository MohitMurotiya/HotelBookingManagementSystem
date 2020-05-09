/**
 * 
 */
package com.cg.hotel.service;

import java.util.List;

import com.cg.hotel.model.Hotel;

/**
 * @author HBMS
 * HotelService.java
 * May 2, 2020
 */
public interface HotelService {
	
	List<Hotel> findAll();
	
	void createHotel(Hotel hotel);

	void deleteHotel(Long hotelId);
	
	void updateHotel(Hotel hotel);
}
