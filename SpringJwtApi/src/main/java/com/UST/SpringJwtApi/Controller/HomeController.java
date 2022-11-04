package com.UST.SpringJwtApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UST.SpringJwtApi.Model.JwtRequest;
import com.UST.SpringJwtApi.Model.JwtResponse;
import com.UST.SpringJwtApi.Service.UserService;
import com.UST.SpringJwtApi.Utility.JwtUtility;

@RestController
public class HomeController {
	@Autowired
	private JwtUtility jwtUtility;
	
	@Autowired 
	private AuthenticationManager autheticationManager;
	
	@Autowired 
	private UserService userservice;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to Daily Code Buffer!!";
	}
	
	@PostMapping("//autheticate")
	public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest)throws Exception{
		try {
			autheticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(
							jwtRequest.getUsername(),
							jwtRequest.getPassword()
							)
					);
		}
		catch(BadCredentialsException e) {
			throw new Exception("INVALID CREDENTIALS",e);			
		}
		final UserDetails userDetail
		=userservice.loadUserByUsername(jwtRequest.getUsername());
		
		final String token =
				jwtUtility.generateToken(userDetail);
		
		return new JwtResponse();
	}

}
