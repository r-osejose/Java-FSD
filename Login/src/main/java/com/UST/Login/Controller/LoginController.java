package com.UST.Login.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login1")
public class LoginController {
	
	@GetMapping("/welcome")
	public String getmesg() {
		return "Welcome to UST";
	}
	
}
