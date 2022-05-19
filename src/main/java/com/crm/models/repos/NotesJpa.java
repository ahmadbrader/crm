package com.crm.models.repos;

import com.crm.models.entities.NotesHistory;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
public interface NotesJpa extends CrudRepository<NotesHistory, Long>{

    @Query("SELECT u FROM NotesHistory u WHERE u.contact_id = ?1 order by id desc")
    Iterable<NotesHistory> findByContact_id(Long id);
}
