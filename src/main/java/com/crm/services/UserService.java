package com.crm.services;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import com.crm.models.entities.User;
import com.crm.models.repos.BatisRepo;
import com.crm.models.repos.UserRepoJpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    public ResponseEntity<?> resetPassowrd(String username) {
        Map<String, Object> responseMap = new HashMap<>();
        User user = userRepo.findByEmail(username);
        try {
            String password = bcrypt.encode("natieva123");
            user.setPassword(password);
            userRepo.save(user);
            responseMap.put("error", false);
            responseMap.put("message", "Change Password Success");
            responseMap.put("user", user);
            return ResponseEntity.status(200).body(responseMap);
        } catch (Exception e) {
            responseMap.put("error", true);
            responseMap.put("message", "Change Password Error");
            return ResponseEntity.status(500).body(responseMap);
        }
       
    }

    public ResponseEntity<?> resetPassowrdById(Long id) {
        Map<String, Object> responseMap = new HashMap<>();
        User user = userRepo.findOneById(id);
        try {
            String password = bcrypt.encode("natieva123");
            user.setPassword(password);
            userRepo.save(user);
            responseMap.put("error", false);
            responseMap.put("message", "Change Password Success");
            responseMap.put("user", user);
            return ResponseEntity.status(200).body(responseMap);
        } catch (Exception e) {
            responseMap.put("error", true);
            responseMap.put("message", "Change Password Error");
            return ResponseEntity.status(500).body(responseMap);
        }
       
    }

    

}
