package com.crm.services;

import javax.transaction.Transactional;

import com.crm.models.entities.User;
import com.crm.models.repos.BatisRepo;
import com.crm.models.repos.UserRepoJpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepoJpa userRepo;

    @Autowired
    private BatisRepo batisRepo;

    @Autowired
    private BCryptPasswordEncoder bcrypt;

    public Iterable<User> getAll() {
        return userRepo.findAll();
    }

    public User register(User user) {
        String password = bcrypt.encode(user.getPassword());
        user.setPassword(password);
        return userRepo.save(user);
    }

    public User getMyAccount(String email) {
       
        return userRepo.findByEmail(email);
    }

}
