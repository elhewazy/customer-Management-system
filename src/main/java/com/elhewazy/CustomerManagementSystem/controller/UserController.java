package com.elhewazy.CustomerManagementSystem.controller;

import com.elhewazy.CustomerManagementSystem.model.User;
import com.elhewazy.CustomerManagementSystem.servic.UserServicImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class UserController {
    @Autowired
    UserServicImp Us;

    @PutMapping
    public User updateCustomer(){
        return null;
    }
    @PostMapping
    public User addUser(){
        return null;
    }
    @GetMapping
    public User getUser(){
        return null;
    }
    @DeleteMapping
    public User deletUser(){
        return null;
    }
}
