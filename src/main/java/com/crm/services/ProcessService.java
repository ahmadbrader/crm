package com.crm.services;

import java.util.List;

import javax.transaction.Transactional;

import com.crm.models.entities.Product;
import com.crm.models.repos.ContactRepo;
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
        if (form.getId_status().equals("9")) {
            return contactRepo.updateAppToPro(form);
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
