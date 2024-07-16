package com.Odontelx.CentroOdonotologico.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Responsable extends Persona {
    private int id_responsable;
    private String tipoResp;
    
    //relaciones 
    //no tiene porque es unidireccional desde el lado del paciente

    public Responsable() {
    }

    public Responsable(int id_responsable, String tipoResp, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_responsable = id_responsable;
        this.tipoResp = tipoResp;
    }

    
    
    
}
