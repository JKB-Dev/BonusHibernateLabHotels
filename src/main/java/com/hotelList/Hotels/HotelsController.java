package com.hotelList.Hotels;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hotelList.Hotels.dao.HotelDao;


@Controller
public class HotelsController {
	
	@Autowired
	HotelDao repository;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("hotelCities", repository.findDistinctCity());
		return mv;
	}
	
	
	@RequestMapping("/results")
	public ModelAndView hotelMv(@RequestParam("city") String city) {
		ModelAndView mv = new ModelAndView("hotel-results");
		System.out.println(city);
		mv.addObject("hotelResults", repository.findByCityOrderByPricePerNightAsc(city));
		mv.addObject("city", city);
		return mv;
	}
}
