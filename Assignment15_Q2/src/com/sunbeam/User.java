package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	private int id ;
	private String first_name;
	private String last_name;
	private String email;
	private String password;
	private java.util.Date dob;
	private int status;
	private String role;
	
	
	public User() {
	}
	


	public User(int id, String first_name, String last_name, String email, String password, Date dob, int status,
			String role) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public java.util.Date getDob() {
		return dob;
	}


	public void setDob(java.util.Date dob) {
		this.dob = dob;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", password=" + password + ", dob=" + sdf.format(dob) + ", status=" + status + ", role=" + role + "]";
	}



}
