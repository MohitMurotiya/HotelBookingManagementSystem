package com.cg.util;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.BookingRepositoryProxy;
import com.cg.model.Booking;
import com.cg.model.RegistrationModel;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {

	@Autowired
	private BookingRepositoryProxy bProxy;


	@GetMapping("/bookings")
	public List<Booking> findAllBookings() {
		return bProxy.findAll();
	}
	
	@GetMapping("/bookings/by/hotel/{hotelId}")
	public List<Booking> findBookingsByHotel(@PathVariable Long hotelId) {
		return bProxy.findAll().stream().filter(x -> x.getHotelId()==hotelId).collect(Collectors.toList());
	}
	
	@GetMapping("/bookings/by/Customer/{userId}")
	public List<Booking> findBookingsByCustomer(@PathVariable Integer userId){
		return bProxy.findAll().stream().filter(x -> x.getUserId()==userId).collect(Collectors.toList());
	}
}
