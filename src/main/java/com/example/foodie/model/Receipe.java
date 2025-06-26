package com.example.foodie.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Receipe {
    @Id
    private int recid;
    private String name;
    private String ingredients;
    private String instructions;
}

