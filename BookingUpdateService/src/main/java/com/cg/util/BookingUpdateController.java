package com.cg.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.BookingUpdateProxy;
import com.cg.model.Booking;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookingUpdateController {
	
	@Autowired
	private BookingUpdateProxy proxy;
	
	@PostMapping("/booking/add")
	public void addBooking(@RequestBody Booking book) {
		proxy.addBooking(book);
	}
}
