package com.crm.models.repos;

import java.util.Optional;

import com.crm.models.entities.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepoJpa extends CrudRepository<User, Long>{
    
    User findByEmail(String email);
    User findOneById(Long id);
}
