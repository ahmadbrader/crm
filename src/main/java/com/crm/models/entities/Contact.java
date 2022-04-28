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
@Table(name="contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String id_sales;
    private String id_contact_type;
    private String id_status;
    @Column(columnDefinition="text")
    private String product_temp;
    @Column(columnDefinition="text")
    private String value_temp; 
    private String type_of_prospect;
    private String flag;
    private String company_contact;
    private String title_contact;
    private String name_contact;
    private String birth_contact;
    private String office_phone_contact;
    private String mobile_phone_contact;
    private String notes_contact;
    private String extension_contact;
    private String email_contact;
    private String job_contact;
    private String address_contact;
    private String id_revert;
    private String task_prospecting;
    private Date date_prospecting;
    private String task_approaching;
    private Date date_approaching;
    private Date date_presentation;
    private Date date_status;
    @Column(columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP()")
    private Date created_at;
    @Column(columnDefinition = "TIMESTAMP default ON UPDATE CURRENT_TIMESTAMP")
    private Date updated_at;

    public Contact() {
    }

    public Contact(String id_sales, String id_contact_type, String id_status, String product_temp, String value_temp,
            String type_of_prospect, String flag, String company_contact, String title_contact, String name_contact,
            String birth_contact, String office_phone_contact, String mobile_phone_contact, String notes_contact,
            String extension_contact, String email_contact, String job_contact, String address_contact,
            String id_revert, String task_prospecting, Date date_prospecting, String task_approaching,
            Date date_approaching, Date date_presentation, Date date_status, Date created_at, Date updated_at) {
        this.id_sales = id_sales;
        this.id_contact_type = id_contact_type;
        this.id_status = id_status;
        this.product_temp = product_temp;
        this.value_temp = value_temp;
        this.type_of_prospect = type_of_prospect;
        this.flag = flag;
        this.company_contact = company_contact;
        this.title_contact = title_contact;
        this.name_contact = name_contact;
        this.birth_contact = birth_contact;
        this.office_phone_contact = office_phone_contact;
        this.mobile_phone_contact = mobile_phone_contact;
        this.notes_contact = notes_contact;
        this.extension_contact = extension_contact;
        this.email_contact = email_contact;
        this.job_contact = job_contact;
        this.address_contact = address_contact;
        this.id_revert = id_revert;
        this.task_prospecting = task_prospecting;
        this.date_prospecting = date_prospecting;
        this.task_approaching = task_approaching;
        this.date_approaching = date_approaching;
        this.date_presentation = date_presentation;
        this.date_status = date_status;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    

    public Date getDate_presentation() {
        return date_presentation;
    }

    public void setDate_presentation(Date date_presentation) {
        this.date_presentation = date_presentation;
    }

    public void setDate_status(Date date_status) {
        this.date_status = date_status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_sales() {
        return id_sales;
    }

    public void setId_sales(String id_sales) {
        this.id_sales = id_sales;
    }

    public String getId_contact_type() {
        return id_contact_type;
    }

    public void setId_contact_type(String id_contact_type) {
        this.id_contact_type = id_contact_type;
    }

    public String getId_status() {
        return id_status;
    }

    public void setId_status(String id_status) {
        this.id_status = id_status;
    }

    public String getProduct_temp() {
        return product_temp;
    }

    public void setProduct_temp(String product_temp) {
        this.product_temp = product_temp;
    }

    public String getValue_temp() {
        return value_temp;
    }

    public void setValue_temp(String value_temp) {
        this.value_temp = value_temp;
    }

    public String getType_of_prospect() {
        return type_of_prospect;
    }

    public void setType_of_prospect(String type_of_prospect) {
        this.type_of_prospect = type_of_prospect;
    }

    public String getCompany_contact() {
        return company_contact;
    }

    public void setCompany_contact(String company_contact) {
        this.company_contact = company_contact;
    }

    public String getTitle_contact() {
        return title_contact;
    }

    public void setTitle_contact(String title_contact) {
        this.title_contact = title_contact;
    }

    public String getName_contact() {
        return name_contact;
    }

    public void setName_contact(String name_contact) {
        this.name_contact = name_contact;
    }

    public String getBirth_contact() {
        return birth_contact;
    }

    public void setBirth_contact(String birth_contact) {
        this.birth_contact = birth_contact;
    }

    public String getOffice_phone_contact() {
        return office_phone_contact;
    }

    public void setOffice_phone_contact(String office_phone_contact) {
        this.office_phone_contact = office_phone_contact;
    }

    public String getMobile_phone_contact() {
        return mobile_phone_contact;
    }

    public void setMobile_phone_contact(String mobile_phone_contact) {
        this.mobile_phone_contact = mobile_phone_contact;
    }

    public String getNotes_contact() {
        return notes_contact;
    }

    public void setNotes_contact(String notes_contact) {
        this.notes_contact = notes_contact;
    }

    public String getExtension_contact() {
        return extension_contact;
    }

    public void setExtension_contact(String extension_contact) {
        this.extension_contact = extension_contact;
    }

    public String getEmail_contact() {
        return email_contact;
    }

    public void setEmail_contact(String email_contact) {
        this.email_contact = email_contact;
    }

    public String getJob_contact() {
        return job_contact;
    }

    public void setJob_contact(String job_contact) {
        this.job_contact = job_contact;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getAddress_contact() {
        return address_contact;
    }

    public void setAddress_contact(String address_contact) {
        this.address_contact = address_contact;
    }

    public String getId_revert() {
        return id_revert;
    }

    public void setId_revert(String id_revert) {
        this.id_revert = id_revert;
    }

    public String getTask_prospecting() {
        return task_prospecting;
    }

    public void setTask_prospecting(String task_prospecting) {
        this.task_prospecting = task_prospecting;
    }

    public Date getDate_prospecting() {
        return date_prospecting;
    }

    public void setDate_prospecting(Date date_prospecting) {
        this.date_prospecting = date_prospecting;
    }

    public String getTask_approaching() {
        return task_approaching;
    }

    public void setTask_approaching(String task_approaching) {
        this.task_approaching = task_approaching;
    }

    public Date getDate_approaching() {
        return date_approaching;
    }

    public void setDate_approaching(Date date_approaching) {
        this.date_approaching = date_approaching;
    }

    public Date getDate_status() {
        return date_status;
    }

    public void setDate_status() {
        this.date_status = new Date();
    }

    

    


    


    

    


}
