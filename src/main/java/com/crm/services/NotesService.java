package com.crm.services;

import javax.transaction.Transactional;

import com.crm.models.entities.NotesHistory;
import com.crm.models.repos.NotesJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class NotesService {
    @Autowired
    private NotesJpa noteJpa;

    public Iterable<NotesHistory> findByContactId(Long id) {
        return noteJpa.findByContact_id(id);
    }
}
