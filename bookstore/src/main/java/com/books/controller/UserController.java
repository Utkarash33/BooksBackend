package com.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.DTO.LoginRequest;
import com.books.entities.User;
import com.books.services.AuthService;
import com.books.services.AuthorService;

@RestController
@RequestMapping("/auth")
public class UserController {

	@Autowired
	AuthService authService;
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById (@PathVariable Integer userId)
	{
		
		
		return new ResponseEntity<>(null,HttpStatus.OK);
	}
	
	@PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
      
		String response= authService.registerUser(user);
		
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
        
    	String response = authService.loginUser(loginRequest);
    	return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
