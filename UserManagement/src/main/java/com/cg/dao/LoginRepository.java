/**
 * 
 */
package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.model.LoginModel;

/**
 * @author User
 *
 */
public interface LoginRepository extends JpaRepository<LoginModel, Long> {

	@Transactional
	void deleteByUsername(String name);
}
