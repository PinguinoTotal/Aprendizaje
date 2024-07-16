package com.Odontelx.CentroOdonotologico.model;

import java.time.LocalDate;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private Date fecha_nac;

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
    }

    
    
    
}
