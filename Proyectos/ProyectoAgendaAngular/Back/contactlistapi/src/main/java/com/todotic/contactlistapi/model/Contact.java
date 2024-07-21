package com.todotic.contactlistapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Setter @Getter
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    private String email;
    
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    public Contact() {
    }

    public Contact(Long id, String name, String email, Date createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
    }

    
    
    
}
