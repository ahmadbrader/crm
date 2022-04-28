package com.crm.services;
import java.util.List;

import javax.transaction.Transactional;

import com.crm.models.entities.Contact;
import com.crm.models.repos.ContactJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ContactService {
    @Autowired
    private ContactJpa contactJpa;

    public Contact insertProspecting(Contact contact) {
        contact.setId_contact_type("1");
        contact.setId_status("1");
        contact.setFlag("Leads");
        contact.setDate_status();
        return contactJpa.save(contact);
    }
}
