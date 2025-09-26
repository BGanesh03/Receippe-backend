package com.example.foodie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Receipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recid;
    private String name;
    private String ingredient;
    private String steps;
    @ManyToOne
    @JoinColumn(name = "pid") 
    private Profile profile;
}

