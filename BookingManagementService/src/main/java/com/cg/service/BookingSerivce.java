package com.cg.service;

import java.util.List;

import com.cg.model.Booking;

public interface BookingSerivce {

	List<Booking> findAll();

	void addBooking(Booking book);
}
