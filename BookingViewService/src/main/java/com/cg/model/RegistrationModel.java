/**
 * 
 */
package com.cg.model;

/**
 * @author User
 *
 */

public class RegistrationModel {

	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String number;
	private Address addr;
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
