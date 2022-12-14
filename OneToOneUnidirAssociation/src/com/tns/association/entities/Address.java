package com.tns.association.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="addrid")
private int addrid;
	@Column(name="street")
private String street;
	@Column(name="city")
private String city;
	@Column(name="state")
private String state;
	@Column(name="zipcode")
private int zipcode;
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getzipcode() {
		return zipcode;
	}
	public void setzipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Address() {
		
	}
	public Address(int addrid, String street, String city, String state, int zipcode) {
		
		this.addrid = addrid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

}

