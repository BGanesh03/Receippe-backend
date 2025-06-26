package com.example.foodie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.foodie.model.Profile;

@Repository
public interface ProfileRepo extends JpaRepository<Profile , Integer>{

}
