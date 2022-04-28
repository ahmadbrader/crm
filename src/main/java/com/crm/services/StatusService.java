package com.crm.services;

import java.util.List;

import javax.transaction.Transactional;

import com.crm.models.entities.Status;
import com.crm.models.repos.BatisRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StatusService {
    @Autowired
    private BatisRepo batisRepo;

    public List<Status> findStatusByContactType(String type) {
        return batisRepo.findStatusByContactType(type);
    }
}
