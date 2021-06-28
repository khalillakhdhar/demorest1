package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	@GetMapping("")
	public String types()
	{
		return "les types des  <a href='controles'>controllers</a>";
	}
	@GetMapping("controles")
	public ModelAndView controles()
	{
		ModelAndView mv=new ModelAndView("types.html");
		return mv;
	}

}
