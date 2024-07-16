package com.Odontelx.CentroOdonotologico.model;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Turno {
    private int id_turno;
    private Date fechaTurno;
    private String hora_turno;
    private String afeccion;

    public Turno() {
    }

    public Turno(int id_turno, Date fechaTurno, String hora_turno, String afeccion) {
        this.id_turno = id_turno;
        this.fechaTurno = fechaTurno;
        this.hora_turno = hora_turno;
        this.afeccion = afeccion;
    }
}
