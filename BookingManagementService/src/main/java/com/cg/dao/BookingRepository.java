package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
