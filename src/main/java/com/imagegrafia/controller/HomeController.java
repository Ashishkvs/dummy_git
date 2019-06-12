package com.imagegrafia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class HomeController {

	@GetMapping
	public String getInfo() {
		return "Ashish";
	}
}
