package com.example.foodie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.foodie.model.Receipe;
import com.example.foodie.service.ReceipeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ReceipeController {

    @Autowired
    ReceipeService service;

    @GetMapping("/receipes")
    
    public List<Receipe> getReceipes(){
        return service.getReceipes();
    }

    @GetMapping("/receipes/{recid}")
    public Receipe getReceipeById(@PathVariable int recid){
        return service.getReceipesById(recid);
    }

    @PostMapping("/receipes")
    public void addReceipe(@RequestBody Receipe rec){
        service.addReceipe(rec);
    }

    @PutMapping("/receipes")
    public void updateReceipe(@RequestBody Receipe rec){
        service.updateReceipe(rec);
    }

    @DeleteMapping("/receipes/{recid}")
    public void delReceipeById(@PathVariable int recid){
        service.delReceipeById(recid);
    }
}

