package com.example.library2managment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="library")

public class Entityclass {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="book_no")
	private Long b_id;
	
	@Column(name="book_name")
	private String bname;
	
	@Column(name="book_authname")
	private String authname;
	
	@Column(name="pub_year")
	private String pub_year;
	
	@Column(name="address")
	private String address;
	public Entityclass() {
	}
	public Entityclass(Long b_id, String bname, String authname, String pub_year, String address) {
		super();
		this.b_id = b_id;
		this.bname = bname;
		this.authname = authname;
		this.pub_year = pub_year;
		this.address = address;
	}
	public Long getB_id() {
		return b_id;
	}
	public void setB_id(Long b_id) {
		this.b_id = b_id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthname() {
		return authname;
	}
	public void setAuthname(String authname) {
		this.authname = authname;
	}
	public String getPub_year() {
		return pub_year;
	}
	public void setPub_year(String pub_year) {
		this.pub_year = pub_year;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
