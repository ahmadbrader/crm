package com.crm.services;

import java.util.List;

import javax.transaction.Transactional;

import com.crm.models.entities.Product;
import com.crm.models.repos.BatisRepo;
import com.crm.models.repos.ProductJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductJpa productJpa;

    @Autowired
    private BatisRepo batisRepo;

    public List<Product> findByContactId(String id) {
        return batisRepo.findProductByIdContact(id);
    }
}
