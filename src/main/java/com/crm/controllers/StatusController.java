package com.crm.controllers;
import java.util.List;

import com.crm.models.entities.Status;
import com.crm.request.UpdateStatus;
import com.crm.services.ProcessService;
import com.crm.services.StatusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/status")
public class StatusController {
    @Autowired
    private StatusService service;
    @Autowired
    private ProcessService processService;
    
    @GetMapping("/{type}")
    public List<Status> findStatusByContactType(@PathVariable String type) {
        return service.findStatusByContactType(type);
    }

    @PostMapping("/{id}")
    public int changeStatus(@PathVariable String id, @RequestBody UpdateStatus updateStatus) {
        return processService.changeStatus(id, updateStatus);
    }
}
