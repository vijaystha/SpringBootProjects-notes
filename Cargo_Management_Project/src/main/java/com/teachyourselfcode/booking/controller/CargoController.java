package com.teachyourselfcode.booking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CargoController {

	@RequestMapping("/create")
public String CreateCargo() {
	return "cargo-create";
}
	
	
}
