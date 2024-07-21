package com.todotic.contactlistapi.service;

import com.todotic.contactlistapi.model.Contact;
import java.util.List;

public interface IContactService {
    //create
    public void saveContact(Contact cont);
    //read
    public List<Contact> getContacts();
    public Contact findContact(Long id);
    //update
    public void editContact(Contact cont);
    //delete
    public void deleteContact(Long id);
}
