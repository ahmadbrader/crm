package com.crm.services;
import javax.transaction.Transactional;

import com.crm.configs.PasswordEncoder;
import com.crm.models.entities.User;
import com.crm.models.repos.UserRepoJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UserService implements UserDetailsService{
    @Autowired
    private UserRepoJpa userRepo;

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

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        return userRepo.findByEmail(email)
        .orElseThrow(() ->
        new UsernameNotFoundException("Email Not Found"));
    }
}
