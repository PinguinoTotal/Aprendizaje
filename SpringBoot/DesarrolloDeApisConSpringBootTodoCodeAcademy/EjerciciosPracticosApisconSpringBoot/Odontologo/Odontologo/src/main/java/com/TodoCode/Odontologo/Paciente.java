package com.TodoCode.Odontologo;

import java.time.LocalDate;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class Paciente {
    private int id;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Paciente() {
    }

    public Paciente(int id, int dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    
}
