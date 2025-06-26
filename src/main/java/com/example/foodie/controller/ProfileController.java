package com.example.foodie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodie.model.Profile;
import com.example.foodie.service.ProfileService;

@RestController
// @CrossOrigin
public class ProfileController {
    @Autowired
    ProfileService service1;

    @GetMapping("/profile/{pid}")
    public Profile getProfileById(@PathVariable int pid){
        return service1.getProfilesById(pid);
    }

    @GetMapping("/profile")
    public List<Profile> getProfile(){
        return service1.getProfile();
    }

    @PostMapping("/signup")
public ResponseEntity<String> signup(@RequestBody Profile pro){
    try {
        service1.signup(pro);
        return ResponseEntity.ok("Signup successful");
    } catch (Exception e) {
        return ResponseEntity.status(500).body("Signup failed: " + e.getMessage());
    }
}
}
