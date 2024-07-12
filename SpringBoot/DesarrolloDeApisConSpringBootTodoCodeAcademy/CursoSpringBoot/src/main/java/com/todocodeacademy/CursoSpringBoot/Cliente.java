package com.todocodeacademy.CursoSpringBoot;

import lombok.Getter;
import lombok.Setter;

//usamos una libreria para hacer los seteres y getesr se los atributos
//de la clase
@Getter @Setter
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    
    //aunque tengamos el @Getter @Setter siempre 
    //es una buena practica crear los constructores
    
    //(alt+insert)

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
}
