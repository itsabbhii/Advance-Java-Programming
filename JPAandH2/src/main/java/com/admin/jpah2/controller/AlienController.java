package com.admin.jpah2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlienController {
	@Autowired
	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
