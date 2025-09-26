package com.example.foodie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.foodie.model.Receipe;

@Repository
public interface ReceipeRepo extends JpaRepository<Receipe , Integer>{
    List<Receipe> findByProfilePid(int pid);
}
