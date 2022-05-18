package com.crm.services;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import com.crm.models.entities.NotesHistory;
import com.crm.models.entities.Product;
import com.crm.models.repos.ContactRepo;
import com.crm.models.repos.NotesJpa;
import com.crm.models.repos.ProductJpa;
import com.crm.request.AddProduct;
import com.crm.request.UpdateStatus;
import com.crm.response.ResponseProcess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProcessService {
    @Autowired
    private ContactRepo contactRepo;

    @Autowired
    private ProductJpa productJpa;

    @Autowired
    private NotesJpa noteJpa;

    public List<ResponseProcess> contactProcess(int process) {
        return contactRepo.contactProcess(process);
    }

    public int updateToClosing(ResponseProcess responseProcess) {
        return contactRepo.updatePreToClo(responseProcess);
    }
    
    public int updateToApproaching(ResponseProcess responseProcess) {
        return contactRepo.updateProToAppr(responseProcess);
    }
    public int updateToPresenting(ResponseProcess responseProcess) {
        return contactRepo.updateAppToPresen(responseProcess);
    }

    public int changeStatus(String id, UpdateStatus form) {
        form.setId(id);
        String arr[] = { "4", "9", "15", "19", "21" };
        long l=Long.parseLong(id);  
        NotesHistory historyNote = new NotesHistory();
        historyNote.setNotes(form.getNotes());
        historyNote.setCreated_at(new Date());
        historyNote.setContact_id(l);
        noteJpa.save(historyNote);
        for (String element : arr) {
            if (form.getId_status().equals(element)) {
                return contactRepo.updateAppToPro(form);
            }
            
        }
        return contactRepo.changeStatus(form);
    }

    public Product addProduct(AddProduct addProduct) {
        Product product = new Product();
        product.setName_product(addProduct.getName_product());
        product.setValue_product(addProduct.getPrice());
        product.setQuantity(Integer.parseInt(addProduct.getQty()));
        product.setId_contact(addProduct.getContact_id().toString());
        return productJpa.save(product);
    }
}
