package com.crm.controllers;

import com.crm.models.entities.Contact;
import com.crm.services.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/contact")
public class ContactController {
    @Autowired
    private ContactService service;
    
    @PostMapping
    public Contact getContactProcess(@RequestBody Contact contact) {
        return service.insertProspecting(contact);
    }
}
