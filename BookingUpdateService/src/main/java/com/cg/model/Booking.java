package com.cg.model;

import java.time.LocalDate;

public class Booking {

	private Long bookingId;
	private Long hotelId;
	private Long roomId;
	private Integer userId;
	private LocalDate checkin;
	private LocalDate checkout;
	private int numOfGuests;
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
