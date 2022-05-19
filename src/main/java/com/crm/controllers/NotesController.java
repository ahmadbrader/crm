package com.crm.controllers;

import com.crm.models.entities.NotesHistory;
import com.crm.services.NotesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/notes")
public class NotesController {
    @Autowired
    private NotesService noteService;

    
    @GetMapping("/{id}")
    public Iterable<NotesHistory> getContactProcess(@PathVariable Long id) {
        return noteService.findByContactId(id);
    }
}
