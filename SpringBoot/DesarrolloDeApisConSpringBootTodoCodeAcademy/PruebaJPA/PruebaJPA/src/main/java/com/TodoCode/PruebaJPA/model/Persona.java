package com.TodoCode.PruebaJPA.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    
    //aqui le damos una mascota para generar la relacion 1 a 1
    //y le decimos al programa que esto es una relacion 1 a 1 
    @OneToOne
    /*le damos a entender que la columna que creo en la base de datos llamas 
    "una_mascota_id_mascota" se va a asociar a la columna "id_mascota" de 
    la base de datos de mascota*/
    @JoinColumn (name = "una_mascota_id_mascota",referencedColumnName = "id_mascota")
    private Mascota unaMascota;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int edad, Mascota unaMascota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.unaMascota = unaMascota;
    }

    
}
