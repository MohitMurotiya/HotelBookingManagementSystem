/**
 * 
 */
package com.cg.hotel.dao;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/hotels")
	public List<Hotel> findAll();
}
