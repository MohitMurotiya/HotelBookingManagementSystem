/**
 * 
 */
package com.cg.dao;


import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.model.Booking;
import com.cg.model.RegistrationModel;



/**
 * @author HBMS
 *
 */
@FeignClient(name = "BookingManagement")
@RibbonClient(name = "BookingManagement")
public interface BookingRepositoryProxy {
	
	@GetMapping("/bookings")
	public List<Booking> findAll();
}
