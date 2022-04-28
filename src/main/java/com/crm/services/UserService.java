package com.crm.services;
import javax.transaction.Transactional;

import com.crm.models.entities.User;
import com.crm.models.repos.UserRepoJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepoJpa userRepo;

    public Iterable<User> getAll() {
        return userRepo.findAll();
    }
}
