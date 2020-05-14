package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.BookingRepository;
import com.cg.model.Booking;

@Service
public class BookingServiceImpl implements BookingSerivce {

	@Autowired
	private BookingRepository repos;

	@Override
	public List<Booking> findAll() {
		return repos.findAll();
	}

	@Override
	public void addBooking(Booking book) {
		repos.save(book);
	}

}
