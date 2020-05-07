/**
 * 
 */
package com.cg.hotel.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/hotels")
	public List<Hotel> findAll(){
		System.out.println("Inside findALl() method of HotelServiceController");
		return proxy.findAll();
	}
	
	@GetMapping("/hotel/name/{hotelName}")
	public Hotel findByName(@PathVariable String hotelName){
		return proxy.findAll().stream().filter(name -> name.getHotelName().equals(hotelName)).findAny().get();
	}
	
	@GetMapping("/hotel/city/{hotelCity}")
	public List<Hotel> findByCity(@PathVariable String hotelCity){
		return proxy.findAll().stream().filter(name -> name.getCity().equals(hotelCity)).collect(Collectors.toList());
	}
	
	@GetMapping("/hotel/rating/{hotelRating}")
	public List<Hotel> findByRating(@PathVariable int hotelRating){
		return proxy.findAll().stream().filter(name -> name.getRating()==hotelRating).collect(Collectors.toList());
	}
}