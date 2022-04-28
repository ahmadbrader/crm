package com.crm.services;

import java.util.List;

import javax.transaction.Transactional;

import com.crm.models.entities.Company;
import com.crm.models.repos.CompanyRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CompanyService {
    
    @Autowired
    private CompanyRepo companyRepo;

    public Company create(Company company) {
        return companyRepo.save(company);
    }

    public Iterable<Company> getAll() {
        return companyRepo.findAll();
    }
}
