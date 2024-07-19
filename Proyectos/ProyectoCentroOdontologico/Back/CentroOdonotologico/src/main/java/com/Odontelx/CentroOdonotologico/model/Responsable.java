package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Responsable extends Persona {
    //private int id_responsable;
    private String tipoResp;
    
    //relaciones 
    //no tiene porque es unidireccional desde el lado del paciente

    public Responsable() {
    }

    public Responsable(String tipoResp, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.tipoResp = tipoResp;
    }

    

    

    
    
    
}
