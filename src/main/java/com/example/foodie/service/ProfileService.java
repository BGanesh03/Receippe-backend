package com.example.foodie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodie.model.Profile;
import com.example.foodie.repository.ProfileRepo;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepo pro;

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
}
