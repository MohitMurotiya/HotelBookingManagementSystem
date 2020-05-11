package com.cg.util;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Booking;
import com.cg.service.BookingSerivce;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {

	@Autowired
	private BookingSerivce service;

	@GetMapping("/bookings")
	public List<Booking> findAll() {
		return service.findAll();
	}

	@PostMapping("/booking/add")
	public void addBooking(@RequestBody Booking book) {
		service.addBooking(book);
	}

	@PutMapping("/booking/update")
	public void updateBooking(@RequestBody Booking book) {
		service.updateBooking(book);
	}

	@GetMapping("/bookings/date/{startDate}/to/{endDate}")
	public List<Booking> showBookingsByDate(
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
			@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
		if ((startDate.compareTo(endDate)) > 0) {
			return null;
		} else {
			return service.findAll().stream().filter(
					(bookings) -> bookings.getCheckin().isAfter(startDate.minusDays(1)) && bookings.getCheckout().isBefore(endDate.plusDays(1)))
					.collect(Collectors.toList());
		}

	}
}
