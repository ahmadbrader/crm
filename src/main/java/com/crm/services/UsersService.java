package com.crm.services;

import javax.transaction.Transactional;

import com.crm.models.entities.User;
import com.crm.models.repos.UserRepoJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsersService {
    @Autowired
    private UserRepoJpa userRepo;

    @Autowired
    private BCryptPasswordEncoder bcrypt;

    public User register(User user) {
        String password = bcrypt.encode(user.getPassword());
        user.setPassword(password);
        return userRepo.save(user);
    }
}
