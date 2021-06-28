package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("")
	String types()
	{
		return "les types des  <a href='controles'>controllers</a>";
	}

}
