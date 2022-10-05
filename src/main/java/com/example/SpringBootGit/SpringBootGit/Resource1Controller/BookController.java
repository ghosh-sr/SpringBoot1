package com.example.SpringBootGit.SpringBootGit.Resource1Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	@RequestMapping("/books")
	public String bookString() {
		return "This is a list of books available hier";
	}
	
}
