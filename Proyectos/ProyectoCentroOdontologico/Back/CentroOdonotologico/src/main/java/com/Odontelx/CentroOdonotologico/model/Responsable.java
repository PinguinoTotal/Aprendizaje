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
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_responsable;
    private String tipoResp;
    
    //relaciones
    //un responsable tiene un objeto persona asociado
    @OneToOne
    private Persona persona;

    public Responsable() {
    }

    public Responsable(Long id_responsable, String tipoResp, Persona persona) {
        this.tipoResp = tipoResp;
        this.persona = persona;
    }

    
    
    
}
