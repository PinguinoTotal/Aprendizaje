package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Odontologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_odontologo;
    private String especialidad;
    
    //Relaciones
    //tendremos un objeto Persona asociado 
    @OneToOne
    private Persona persona;
    //cada Odontologo puede tener muchso turnos
    @OneToMany(mappedBy ="odonto" )
    private List<Turno> listaTurnos;
    //cada Odontologo puede tener un usuario
    @OneToOne
    private Usuario unUsuario;
    //cada odontologo puede tener un horario
    @OneToOne
    private Horario unHorario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, Persona persona, List<Turno> listaTurnos, Usuario unUsuario, Horario unHorario) {
        this.especialidad = especialidad;
        this.persona = persona;
        this.listaTurnos = listaTurnos;
        this.unUsuario = unUsuario;
        this.unHorario = unHorario;
    }

    

    
    
    
}
