package com.crm.models.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name_company;
    private String logo_company;
    private Date created_at;
    private Date updated_at;

    public Company() {
    }

    public Company(Long id, String name_company, String logo_company, Date created_at, Date updated_at) {
        this.id = id;
        this.name_company = name_company;
        this.logo_company = logo_company;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_company() {
        return name_company;
    }

    public void setName_company(String name_company) {
        this.name_company = name_company;
    }

    public String getLogo_company() {
        return logo_company;
    }

    public void setLogo_company(String logo_company) {
        this.logo_company = logo_company;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }


    


    

    
}
