package com.example.foodie.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodie.model.Profile;
import com.example.foodie.model.Receipe;
import com.example.foodie.repository.ProfileRepo;
import com.example.foodie.repository.ReceipeRepo;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepo pro;

    @Autowired
    private ReceipeRepo rec; // FIX: Autowire this too

    public void signup(Profile prof){
        pro.save(prof);
    }

    public Profile getProfilesById(int pid){
        return pro.findById(pid).orElse(new Profile());
    }

    public List<Profile> getProfile(){
        return pro.findAll();
    }

    public Profile login(String mail, String pw) {
        return pro.findByMailAndPw(mail, pw)
            .orElse(null);
    }

    // New method to fetch profile + recipes
    public Map<String, Object> getProfileWithRecipes(int pid) {
        Profile profile = pro.findById(pid)
            .orElseThrow(() -> new RuntimeException("Profile not found"));

        List<Receipe> recipes = rec.findByProfilePid(pid);

        Map<String, Object> response = new HashMap<>();
        response.put("profile", profile);
        response.put("recipes", recipes);

        return response;
    }
}
