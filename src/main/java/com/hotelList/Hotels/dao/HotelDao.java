package com.hotelList.Hotels.dao;

import java.util.List;
import java.util.TreeSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelList.Hotels.entity.Hotel;

@Repository
public interface HotelDao extends JpaRepository<Hotel, Long>{
		
	List<Hotel> findByCityOrderByPricePerNightAsc(String city);
	
	@Query("select distinct city from Hotel") // HQL
	TreeSet<String> findDistinctCity();
	
}
