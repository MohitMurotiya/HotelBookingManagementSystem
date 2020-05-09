/**
 * 
 */
package com.cg.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author HBMS Room.java May 6, 2020
 */

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ROOM_NO")
	private String roomNo;

	@Column(name = "ROOM_TYPE")
	private String roomType;

	@Column(name = "PRICE")
	private int price;

	@Column(name = "AVAILABILITY")
	private boolean availability;
	
	@ManyToOne
	@JoinColumn(name = "hotelId")
	private Hotel hotel;

	/**
	 * 
	 */
	public Room() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param roomNo
	 * @param roomType
	 * @param price
	 * @param availability
	 * @param hotel
	 */
	public Room(Long id, String roomNo, String roomType, int price, boolean availability) {
		super();
		this.id = id;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.price = price;
		this.availability = availability;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	@JsonBackReference
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
}
