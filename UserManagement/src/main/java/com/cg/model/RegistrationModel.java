/**
 * 
 */
package com.cg.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author User
 *
 */

@Entity
@Table(name = "REGISTRATION")
public class RegistrationModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "FIRSTNAME")
	private String fname;
	
	@Column(name = "LASTNAME")
	private String lname;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "NUMBER")
	private String number;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ADDRESS")
	private Address addr;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "USER")
	private LoginModel user;

	public RegistrationModel() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param id
	 * @param fname
	 * @param lname
	 * @param email
	 * @param number
	 */
	public RegistrationModel(Integer id, String fname, String lname, String email, String number) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.number = number;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
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
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public LoginModel getUser() {
		return user;
	}

	public void setUser(LoginModel user) {
		this.user = user;
	}
	
	
}
