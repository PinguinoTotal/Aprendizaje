package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_turno;
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;
    private String hora_turno;
    private String afeccion;
    
    //relaciones
    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private Odontologo odonto;
    
    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente pacien;

    public Turno() {
    }

    public Turno(Date fechaTurno, String hora_turno, String afeccion, Odontologo odonto, Paciente pacien) {
        this.fechaTurno = fechaTurno;
        this.hora_turno = hora_turno;
        this.afeccion = afeccion;
        this.odonto = odonto;
        this.pacien = pacien;
    }

    
    
    
}
