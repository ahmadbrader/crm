package com.crm.controllers;

import java.util.List;

import com.crm.models.entities.Product;
import com.crm.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private ProductService service;
    
    @GetMapping("/{contact_id}")
    public List<Product> getContactProcess(@PathVariable String contact_id) {
        return service.findByContactId(contact_id);
    }
}
