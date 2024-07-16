package com.Odontelx.CentroOdonotologico.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Usuario {
    private int id_usuario;
    private String nombreUsuario;
    private String contrasena;
    private String rol;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombreUsuario, String contrasena, String rol) {
        this.id_usuario = id_usuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }
}
