package com.todotic.contactlistapi.repository;

import com.todotic.contactlistapi.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactRepository extends JpaRepository<Contact, Long>{
    
}
