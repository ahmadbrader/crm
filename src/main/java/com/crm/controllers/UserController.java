package com.crm.controllers;

import com.crm.models.entities.User;
import com.crm.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService service;
    
    @GetMapping
    public Iterable<User> getContactProcess() {
        return service.getAll();
    }
}
