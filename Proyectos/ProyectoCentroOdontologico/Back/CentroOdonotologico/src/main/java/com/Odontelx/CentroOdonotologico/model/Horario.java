package com.Odontelx.CentroOdonotologico.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Horario {
    private int id_horario;
    private String horario_inicio;
    private String hoaraio_fin;

    public Horario() {
    }

    public Horario(int id_horario, String horario_inicio, String hoaraio_fin) {
        this.id_horario = id_horario;
        this.horario_inicio = horario_inicio;
        this.hoaraio_fin = hoaraio_fin;
    }
    
    
}
