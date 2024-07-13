package com.TodoCode.ArquitecturaMulticapas.model;

import lombok.Getter;
import lombok.Setter;


//a la clase persona no tenemos que especificar nada en la cabecera porque java 
//ya lo sabe por default
@Getter @Setter
public class Persona {
    private Long id;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
