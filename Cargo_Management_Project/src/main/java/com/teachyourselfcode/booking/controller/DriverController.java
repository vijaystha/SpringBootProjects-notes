package com.teachyourselfcode.booking.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public class DriverController {

	@RequestMapping("/create")
	public String CreateDriver() {
		return "driver-create";
	}
	
}
