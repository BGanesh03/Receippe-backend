package com.example.foodie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.foodie.model.Receipe;
import com.example.foodie.repository.ReceipeRepo;

@Service
public class ReceipeService {

    @Autowired
    private ReceipeRepo repo;

    // List<Receipe> receipes = new ArrayList<>(Arrays.asList(new Receipe(101,"briyani","rice oil" ,"cooking intstruct"),
    //                             new Receipe(102,"Fried rice","rice oil" ,"cooking intstruct")));

                                
    public List<Receipe> getReceipes(){
        return repo.findAll();
    }


    public Receipe getReceipesById(int recid) {
        return repo.findById(recid).orElse(new Receipe(recid, null, null, null, null));
    }

    public void addReceipe(Receipe rec){
        repo.save(rec);
    }


    public void updateReceipe(Receipe rec) {
        repo.save(rec);
    }


    public void delReceipeById(int recid) {
       repo.deleteById(recid);
    }

    public Receipe getReceipeByUserId(int pid){
        return repo.findById(pid).orElse(new Receipe(pid, null, null, null, null));
    }
}
