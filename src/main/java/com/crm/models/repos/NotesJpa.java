package com.crm.models.repos;

import com.crm.models.entities.NotesHistory;

import org.springframework.data.repository.CrudRepository;
public interface NotesJpa extends CrudRepository<NotesHistory, Long>{
    
}
