/**
 * 
 */
package com.cg.hotel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.hotel.model.Room;

/**
 * @author HBMS
 * RoomRepository.java
 * May 7, 2020
 */
public interface RoomRepository extends JpaRepository<Room, Long> {
	
	@Transactional
	void deleteByRoomNo(String number);
}
