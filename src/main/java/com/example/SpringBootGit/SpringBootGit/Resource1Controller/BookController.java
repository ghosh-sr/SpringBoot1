package com.example.SpringBootGit.SpringBootGit.Resource1Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping("/home")
	public String home() {
		return "This is home page";
	}

	@RequestMapping("/about")
	public String about() {
		return "This is about page";
	}
	
}
