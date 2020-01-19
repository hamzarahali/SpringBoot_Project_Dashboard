package com.example.demo.entites;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Email;

import lombok.*;


@Entity
@Table ( name = "client" )
@Getter
@Setter


public class Client implements Serializable{
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column( name = "first_name" )
	private String fname;
	
	@Column( name = "last_name" )
	private String lname;
	
	@Column( name = "adress" )
	private String adress;
	
	@Email
	private String email;
	
	@Column( name = "password" )
	private String password;
	
	
	public Client(Long id, String fname, String lname, String adress, String email,
			String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.adress = adress;
		this.email = email;
		this.password = password;
	}
	
	public Client( String fname, String lname, String adress, String email,
			String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.adress = adress;
		this.email = email;
		this.password = password;
	}
	
	
	public Client() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
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

}
