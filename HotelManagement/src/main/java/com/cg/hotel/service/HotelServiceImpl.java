/**
 * 
 */
package com.cg.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hotel.dao.HotelRepository;
import com.cg.hotel.model.Hotel;

/**
 * @author HBMS HotelServiceImpl.java May 2, 2020
 */
@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository repos;

	@Override
	public List<Hotel> findAll() {
		System.out.println("Inside findAll() method of HotelServiceImpl");
		return repos.findAll();
	}

	@Override
	public void createHotel(Hotel hotel) {
		System.out.println("Inside createHotel() method of HotelServiceImpl");
		repos.save(hotel);
	}

	@Override
	public void deleteHotel(Long hotelId) {
		System.out.println("Inside deleteHotel() method of HotelServiceImpl");
		repos.deleteById(hotelId);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		System.out.println("Inside updateHotel() method of HotelServiceImpl");
		//repos.deleteById(hotel.getHotelId());
		repos.save(hotel);
	}

}
