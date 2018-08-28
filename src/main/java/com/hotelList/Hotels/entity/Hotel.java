package com.hotelList.Hotels.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.domain.Persistable;

@Entity
@Table (name = "hotel_listing")

public class Hotel{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hotel_id")
	private long id;
	
	@Column(name = "hotel_name", length=40) // column names should match those in SQL
	private String name;
	private String city;
	@Column(name= "price_per_night")
	private String pricePerNight;
	
	
	public Hotel() {
		
	}


	public Hotel(long id, String name, String city, String pricePerNight) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public Hotel(String name, String city, String pricePerNight) {
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}


//	public long getId() {
//		return id;
//	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPricePerNight() {
		return pricePerNight;
	}


	public void setPricePerNight(String pricePerNight) {
		this.pricePerNight = pricePerNight;
	}


	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", city=" + city + ", pricePerNight=" + pricePerNight + "]";
	}


//	@Override
//	public Object getId() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//
//	@Override
//	public boolean isNew() {
//		// TODO Auto-generated method stub
//		return false;
//	}

	
	
}
