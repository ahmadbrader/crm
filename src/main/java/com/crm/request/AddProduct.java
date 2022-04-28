package com.crm.request;

import lombok.Data;

@Data
public class AddProduct {
    private Long contact_id;
    private String name_product;
    private String qty;
    private String price;

    public AddProduct() {
    }

    public AddProduct(Long contact_id, String name_product, String qty, String price) {
        this.contact_id = contact_id;
        this.name_product = name_product;
        this.qty = qty;
        this.price = price;
    }

    public Long getContact_id() {
        return contact_id;
    }

    public void setContact_id(Long contact_id) {
        this.contact_id = contact_id;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    


    
}
