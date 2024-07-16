package com.Odontelx.CentroOdonotologico.model;

import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Odontologo extends Persona{
    private int id_odontologo;
    private String especialidad;
    
    //relaciones 
    //un odontologo tiene una lista de turnos
    private List<Turno> listaTurnos;
    //un odontologo tiene un usuario
    private Usuario unUsuario;
    //un odontologo tiene 
    private Horario unHoraraio;

    public Odontologo() {
    }

    public Odontologo(int id_odontologo, String especialidad, List<Turno> listaTurnos, Usuario unUsuario, Horario unHoraraio, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.id_odontologo = id_odontologo;
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHoraraio = unHoraraio;
    }

    

    
}
