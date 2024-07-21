package com.todotic.contactlistapi.controller;

import com.todotic.contactlistapi.model.Contact;
import com.todotic.contactlistapi.service.IContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/contacts")
@CrossOrigin
@RestController
public class ContactController {
    
    @Autowired
    private IContactService contactServ;
    
    //create
    @PostMapping("/create")
    public String createContact(@RequestBody Contact cont){
        contactServ.saveContact(cont);
        return "Contacto creado exitosamente";
    }
    
    //read
    @GetMapping()
    public List<Contact> getContacts(){
        return contactServ.getContacts();
    }
    
    @GetMapping("{id}")
    public Contact findContact(@PathVariable Long id){
        return contactServ.findContact(id);
    }
    
    //update
    @PutMapping("edit")
    public String editContact(@RequestBody Contact cont){
        contactServ.editContact(cont);
        return "contacto editado correctamente";
    }
    
    //delete
    @DeleteMapping("delete/{id}")
    public String deleteContact(@PathVariable Long id){
        contactServ.deleteContact(id);
        return "contacto eliminado";
    }
    
}
