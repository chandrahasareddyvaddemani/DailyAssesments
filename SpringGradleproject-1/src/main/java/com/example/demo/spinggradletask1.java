package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class spinggradletask1 {
	@GetMapping("/greet")
	public String greeting() {
	return "index1";
	}

}
