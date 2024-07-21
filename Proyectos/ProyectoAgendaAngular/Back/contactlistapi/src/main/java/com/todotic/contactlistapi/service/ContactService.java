package com.todotic.contactlistapi.service;

import com.todotic.contactlistapi.model.Contact;
import com.todotic.contactlistapi.repository.IContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactService implements IContactService{
    
    @Autowired
    private IContactRepository contactRepo;

    @Override
    public void saveContact(Contact cont) {
        contactRepo.save(cont);
    }

    @Override
    public List<Contact> getContacts() {
        return contactRepo.findAll();
    }

    @Override
    public Contact findContact(Long id) {
        return contactRepo.findById(id).orElse(null);
    }

    @Override
    public void editContact(Contact cont) {
        this.saveContact(cont);
    }

    @Override
    public void deleteContact(Long id) {
        contactRepo.deleteById(id);
    }
    
    
    
}
