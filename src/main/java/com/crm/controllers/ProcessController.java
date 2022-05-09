package com.crm.controllers;

import java.util.List;

import com.crm.models.entities.Product;
import com.crm.request.AddProduct;
import com.crm.response.ResponseProcess;
import com.crm.services.ProcessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/process")
public class ProcessController {
    @Autowired
    private ProcessService service;
    
    @CrossOrigin
    @GetMapping("/{process}")
    public List<ResponseProcess> getContactProcess(@PathVariable int process) {
        return service.contactProcess(process);
    }

    @PutMapping("update/prospecting")
    public int updateToApproaching(@RequestBody ResponseProcess responseProcess) {
        return service.updateToApproaching(responseProcess);
    }

    @PutMapping("update/approaching")
    public int updateToPresenting(@RequestBody ResponseProcess responseProcess) {
        return service.updateToPresenting(responseProcess);
    }

    @PutMapping("update/presentation")
    public int updateToClosing(@RequestBody ResponseProcess responseProcess) {
        return service.updateToClosing(responseProcess);
    }

    @PostMapping("closing/add-product")
    public Product addProduct(@RequestBody AddProduct addProduct) {
        return service.addProduct(addProduct);
    }
}
