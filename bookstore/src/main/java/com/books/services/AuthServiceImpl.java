package com.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.books.DTO.LoginRequest;
import com.books.config.JwtService;
import com.books.entities.User;
import com.books.exceptions.DuplicationDataException;
import com.books.repository.UserRepo;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String registerUser(User user) {
     
        if (repo.findByUsername(user.getUsername()).isPresent()) {
           throw new DuplicationDataException("User already present");
        }

      
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        user.setRole(user.getRole().toUpperCase());

      
        repo.save(user);

        return "User registered successfully.";
    }

    @Override
    public String loginUser(LoginRequest loginRequest) {
       
        User user = repo.findByUsername(loginRequest.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found."));

       
        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            return "Invalid username or password.";
        }

        
      

      
        return null;
    }
}