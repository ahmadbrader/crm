package com.crm.request;

import lombok.Data;

@Data
public class UpdateStatus {
    private String id;
    private String id_status;
    private String notes;

    public UpdateStatus() {
    }

    public UpdateStatus(String id, String id_status, String notes) {
        this.id = id;
        this.id_status = id_status;
        this.notes = notes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_status() {
        return id_status;
    }

    public void setId_status(String id_status) {
        this.id_status = id_status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    

    

    

    
}
