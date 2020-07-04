package com.barhoum.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Controleur {
	@GetMapping("/")
	public String home() {
		return "/pages/home";
	}
	@GetMapping("/pages/actualite")
	public String act() {
		return "/pages/actualite";
	}

}
