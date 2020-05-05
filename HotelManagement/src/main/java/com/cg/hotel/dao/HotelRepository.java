/**
 * 
 */
package com.cg.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hotel.model.Hotel;

/**
 * @author HBMS
 * HotelRepository.java
 * May 2, 2020
 */
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	@Transactional
	void deleteByHotelName(String name);
}
