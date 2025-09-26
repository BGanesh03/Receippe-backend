package com.example.foodie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.foodie.model.Profile;
import com.example.foodie.service.ProfileService;

@RestController
@RequestMapping("/profile")
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

    @PostMapping("/login")
public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
    String email = credentials.get("mail");
    String password = credentials.get("pw");

    Profile profile = service1.login(email, password);

    if (profile != null) {
        // Create a safe response object (DTO)
        Map<String, Object> response = new HashMap<>();
        response.put("pid", profile.getPid());
        response.put("name", profile.getName());
        response.put("email", profile.getMail());
        // Add any other fields you want to return

        return ResponseEntity.ok(response);
    } else {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }
}



@GetMapping("/receipe/{pid}")
public Map<String, Object> getMyRecipes(@PathVariable int pid) {
    return service1.getProfileWithRecipes(pid);
}



}
