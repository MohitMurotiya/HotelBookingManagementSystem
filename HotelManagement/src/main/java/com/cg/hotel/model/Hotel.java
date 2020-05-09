/**
 * 
 */
package com.cg.hotel.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author HBMS Hotel.java May 2, 2020
 */
@Entity
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hotelId")
	private Long hotelId;
	@Column(name = "name")
	private String hotelName;
	@Column(name = "rating")
	private int rating;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private int pincode;
	@Column(name = "contact")
	private String contact;
	@Column(name = "email")
	private String email;
	@Column(name = "description")
	private String description;

	@OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL)
	private List<Room> rooms;

	/**
	 * 
	 */
	public Hotel() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hotelId
	 * @param hotelName
	 * @param rating
	 * @param city
	 * @param pincode
	 * @param contactNum
	 * @param email
	 * @param description
	 */
	public Hotel(Long hotelId, String hotelName, int rating, String city, int pincode, String contact, String email,
			String description) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.rating = rating;
		this.city = city;
		this.pincode = pincode;
		this.contact = contact;
		this.email = email;
		this.description = description;
	}

	/**
	 * @return the hotelId
	 */
	public Long getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return pincode;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	/**
	 * @return the contactNum
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * @param contactNum the contactNum to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	@JsonManagedReference
	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}
