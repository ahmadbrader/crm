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
@Table(name="status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String id_contact_type;
    private String name_status;
    private String information_status;
    private String desc_status;
    private String next_status;
    private int next_id;
    private Date created_at;
    private Date updated_at;

    public Status() {
    }

    public Status(Long id, String id_contact_type, String name_status, String information_status, String desc_status,
            String next_status, int next_id, Date created_at, Date updated_at) {
        this.id = id;
        this.id_contact_type = id_contact_type;
        this.name_status = name_status;
        this.information_status = information_status;
        this.desc_status = desc_status;
        this.next_status = next_status;
        this.next_id = next_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_contact_type() {
        return id_contact_type;
    }

    public void setId_contact_type(String id_contact_type) {
        this.id_contact_type = id_contact_type;
    }

    public String getName_status() {
        return name_status;
    }

    public void setName_status(String name_status) {
        this.name_status = name_status;
    }

    public String getInformation_status() {
        return information_status;
    }

    public void setInformation_status(String information_status) {
        this.information_status = information_status;
    }

    public String getDesc_status() {
        return desc_status;
    }

    public void setDesc_status(String desc_status) {
        this.desc_status = desc_status;
    }

    public String getNext_status() {
        return next_status;
    }

    public void setNext_status(String next_status) {
        this.next_status = next_status;
    }

    public int getNext_id() {
        return next_id;
    }

    public void setNext_id(int next_id) {
        this.next_id = next_id;
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
