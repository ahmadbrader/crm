package com.crm.models.repos;

import com.crm.models.entities.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepoJpa extends CrudRepository<User, Long>{
    
}
