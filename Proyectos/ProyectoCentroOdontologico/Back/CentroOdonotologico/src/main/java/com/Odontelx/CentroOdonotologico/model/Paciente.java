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
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_paciente;
    private boolean tieneSeguro;
    private String tipoSangre;
    
    //Relaciones
    //un paciente tiene un objeto persona
    @OneToOne
    private Persona persona;
    //un paciente puede tener un responsable
    @OneToOne
    private Responsable unResposable;
    //un paciente puede tener muchso turnos
    @OneToMany(mappedBy = "pacien")
    private List<Turno> listaTurnos;

    public Paciente() {
    }

    public Paciente(boolean tieneSeguro, String tipoSangre, Persona persona, Responsable unResposable, List<Turno> listaTurnos) {
        this.tieneSeguro = tieneSeguro;
        this.tipoSangre = tipoSangre;
        this.persona = persona;
        this.unResposable = unResposable;
        this.listaTurnos = listaTurnos;
    }

    
    
    
}
