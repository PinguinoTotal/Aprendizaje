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
@Getter @Setter
public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_turno;
    @Temporal(TemporalType.DATE)
    private Date fechaTurno;
    private String hora_turno;
    private String afeccion;
    
    @ManyToOne
    @JoinColumn(name = "id_turno")
    private Odontologo odonto;
    
    @ManyToOne
    @JoinColumn(name = "id_turno2")
    private Paciente pacien;

    public Turno() {
    }

    public Turno(int id_turno, Date fechaTurno, String hora_turno, String afeccion) {
        this.id_turno = id_turno;
        this.fechaTurno = fechaTurno;
        this.hora_turno = hora_turno;
        this.afeccion = afeccion;
    }
}
