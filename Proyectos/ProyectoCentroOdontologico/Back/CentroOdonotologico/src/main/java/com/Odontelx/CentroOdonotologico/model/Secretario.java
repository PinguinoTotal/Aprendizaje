package com.Odontelx.CentroOdonotologico.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Secretario extends Persona {
    private int id_secretario;
    private String sector;
    
    //relaciones
    //un secretario tiene un usuario
    private Usuario unUsuario;

    public Secretario() {
    }

    public Secretario(int id_secretario, String sector, Usuario unUsuario, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_secretario = id_secretario;
        this.sector = sector;
        this.unUsuario = unUsuario;
    }

    

    
}
