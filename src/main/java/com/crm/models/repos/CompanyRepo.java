package com.crm.models.repos;

import com.crm.models.entities.Company;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepo extends CrudRepository<Company, Long>{
    
}
