/**
 * 
 */
package com.cg.hotel.dao;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.hotel.model.Hotel;


/**
 * @author HBMS
 *
 */
@FeignClient(name = "HotelManagement")
@RibbonClient(name = "HotelManagement")
public interface HotelRepositoryProxy {
	
	@PostMapping("/hotel/add")
	void createHotel(@RequestBody Hotel hotel);
	
	@PutMapping("/hotel/update")
	void updateHotel(@RequestBody Hotel hotel);
	
	@DeleteMapping("hotel/delete/{hotelId}")
	public void deleteHotel(@PathVariable Long hotelId);
}
