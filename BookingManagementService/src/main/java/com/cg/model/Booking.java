package com.cg.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookingId")
	private Long bookingId;

	@Column(name = "hotelId")
	private Long hotelId;

	@Column(name = "roomId")
	private Long roomId;

	@Column(name = "userId")
	private Integer userId;

	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name = "checkin")
	private LocalDate checkin;

	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	@Column(name = "checkout")
	private LocalDate checkout;

	@Column(name = "Guests")
	private int numOfGuests;

	@Column(name = "Amount")
	private double finalPrice;

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param bookingId
	 * @param hotelId
	 * @param roomId
	 * @param userId
	 * @param checkin
	 * @param checkout
	 * @param numOfGuests
	 * @param finalPrice
	 */
	public Booking(Long bookingId, Long hotelId, Long roomId, Integer userId, LocalDate checkin, LocalDate checkout,
			int numOfGuests, double finalPrice) {
		super();
		this.bookingId = bookingId;
		this.hotelId = hotelId;
		this.roomId = roomId;
		this.userId = userId;
		this.checkin = checkin;
		this.checkout = checkout;
		this.numOfGuests = numOfGuests;
		this.finalPrice = finalPrice;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

	public int getNumOfGuests() {
		return numOfGuests;
	}

	public void setNumOfGuests(int numOfGuests) {
		this.numOfGuests = numOfGuests;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

}
