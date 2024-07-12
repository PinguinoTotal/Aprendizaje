package com.TodoCode.Restaurante;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Plato {
    private int id;
    private String nombre;
    private float precio;
    private String descripcion;

    public Plato() {
    }

    public Plato(int id, String nombre, float precio, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }
}
