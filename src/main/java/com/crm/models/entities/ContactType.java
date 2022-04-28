package com.crm.models.entities;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.websocket.Decoder.Text;

@Entity
@Table(name="contact_types")
public class ContactType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name_contact_type;
    private Date created_at;
    private Date updated_at;

    public ContactType() {
    }

    public ContactType(Long id, String name_contact_type, Date created_at, Date updated_at) {
        this.id = id;
        this.name_contact_type = name_contact_type;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_contact_type() {
        return name_contact_type;
    }

    public void setName_contact_type(String name_contact_type) {
        this.name_contact_type = name_contact_type;
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
