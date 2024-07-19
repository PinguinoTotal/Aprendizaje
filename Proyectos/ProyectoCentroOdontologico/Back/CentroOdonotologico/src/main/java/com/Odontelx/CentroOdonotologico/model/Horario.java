package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
