package com.crm.models.repos;

import com.crm.models.entities.Contact;

import org.springframework.data.repository.CrudRepository;

public interface ContactJpa extends CrudRepository<Contact, Long>{
    
}
