package com.crm.models.repos;

import com.crm.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductJpa extends CrudRepository<Product, Long>{
    
}
