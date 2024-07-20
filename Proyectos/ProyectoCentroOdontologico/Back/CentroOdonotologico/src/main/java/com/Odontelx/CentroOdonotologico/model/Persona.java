package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    @Temporal(TemporalType.DATE)
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
