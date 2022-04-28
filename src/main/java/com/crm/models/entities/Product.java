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
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String id_contact;
    private String name_product;
    private String date_product;
    private String time_product;
    private String value_product;
    private int quantity;
    @Column(columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP")
    private Date created_at;
    @Column(columnDefinition="TIMESTAMP default ON UPDATE CURRENT_TIMESTAMP")
    private Date updated_at;

    public Product() {
    }

    public Product(Long id, String id_contact, String name_product, String date_product, String time_product,
            String value_product, int quantity, Date created_at, Date updated_at) {
        this.id = id;
        this.id_contact = id_contact;
        this.name_product = name_product;
        this.date_product = date_product;
        this.time_product = time_product;
        this.value_product = value_product;
        this.quantity = quantity;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    

    public String getName_product() {
        return name_product;
    }


    public void setName_product(String name_product) {
        this.name_product = name_product;
    }


    public int getQuantity() {
        return quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_contact() {
        return id_contact;
    }

    public void setId_contact(String id_contact) {
        this.id_contact = id_contact;
    }
    
    public String getDate_product() {
        return date_product;
    }

    public void setDate_product(String date_product) {
        this.date_product = date_product;
    }

    public String getTime_product() {
        return time_product;
    }

    public void setTime_product(String time_product) {
        this.time_product = time_product;
    }

    public String getValue_product() {
        return value_product;
    }

    public void setValue_product(String value_product) {
        this.value_product = value_product;
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
