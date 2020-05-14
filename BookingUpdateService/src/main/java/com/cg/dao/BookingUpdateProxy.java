package com.cg.dao;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cg.model.Booking;

@FeignClient(name = "BookingManagement")
@RibbonClient(name = "BookingManagement")
public interface BookingUpdateProxy {
	
	@PostMapping("/booking/add")
	public void addBooking(@RequestBody Booking book);
}
