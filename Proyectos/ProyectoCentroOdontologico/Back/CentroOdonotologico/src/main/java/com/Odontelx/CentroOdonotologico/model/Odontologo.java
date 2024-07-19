package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Odontologo extends Persona{
    //private int id_odontologo;
    private String especialidad;
    
    //relaciones 
    //un odontologo tiene una lista de turnos
    @OneToMany(mappedBy = "odonto")
    //mapea mediante el objeto odonto que tine del otro lado de la base de datos
    private List<Turno> listaTurnos;
    //un odontologo tiene un usuario
    @OneToOne
    private Usuario unUsuario;
    //un odontologo tiene 
    @OneToOne
    private Horario unHoraraio;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario unUsuario, Horario unHoraraio, int id, String dni, String nombre, String apellido, String telefono, String direccion, Date fecha_nac) {
        super(id, dni, nombre, apellido, telefono, direccion, fecha_nac);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHoraraio = unHoraraio;
    }

    

    

    

    
}
