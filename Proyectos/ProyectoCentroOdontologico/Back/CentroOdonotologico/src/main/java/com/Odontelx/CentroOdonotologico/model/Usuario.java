package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nombre_usuario;
    private String contrasenia;
    private String rol;
   

    public Usuario() {
    }

    public Usuario(Long id_usuario, String nombre_usuario, String contrasenia, String rol) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
    }

    

    
    
    
}
