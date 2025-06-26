package com.example.foodie.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.foodie.model.Receipe;

@Repository
public interface ReceipeRepo extends JpaRepository<Receipe , Integer>{

}
