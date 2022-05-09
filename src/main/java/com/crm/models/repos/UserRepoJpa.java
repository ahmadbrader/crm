package com.crm.models.repos;

import java.util.Optional;

import com.crm.models.entities.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepoJpa extends PagingAndSortingRepository<User, Long>{
    
    Optional<User> findByEmail(String email);
}
