package com.crm.controllers;

import java.util.List;

import com.crm.models.entities.Company;
import com.crm.services.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;
    
    @GetMapping
    public Iterable<Company> getAll() {
        return companyService.getAll();
    }

    @PostMapping
    public Company create(@RequestBody Company company)
    {
        return companyService.create(company);
    }
}
