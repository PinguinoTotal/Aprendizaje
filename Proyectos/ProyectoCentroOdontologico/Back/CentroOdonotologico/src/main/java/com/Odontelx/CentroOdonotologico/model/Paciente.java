package com.Odontelx.CentroOdonotologico.model;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Paciente extends Persona{
    private int id_paciente;
    private boolean tieneSeguro;
    private String tipoSangre;
    
    //relaciones
    //un paciente puede tener un resposable
    private Responsable unResponsable;
    
    //un paciente puede tener muchos turnos
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(int id_paciente, boolean tieneSeguro, String tipoSangre, Responsable unResponsable, List<Turno> listaTurnos, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_paciente = id_paciente;
        this.tieneSeguro = tieneSeguro;
        this.tipoSangre = tipoSangre;
        this.unResponsable = unResponsable;
        this.listaTurnos = listaTurnos;
    }
}
