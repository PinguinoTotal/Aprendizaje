package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Secretario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_secretario;
    private String sector;
    
    //relaciones
    //un usuario tiene una persona asosiada
    @OneToOne
    private Persona persona;
    //un secretario tiene un usuario
    @OneToOne
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(Long id_secretario, String sector, Persona persona, Usuario unUsuario) {
        this.id_secretario = id_secretario;
        this.sector = sector;
        this.persona = persona;
        this.unUsuario = unUsuario;
    }
    
    
}
