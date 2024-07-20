package com.Odontelx.CentroOdonotologico.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_horario;
    private String horario_inicio;
    private String hoarario_fin;

    public Horario() {
    }

    public Horario(String horario_inicio, String hoarario_fin) {
        this.horario_inicio = horario_inicio;
        this.hoarario_fin = hoarario_fin;
    }

    public Horario(Long id_horario, String horario_inicio, String hoarario_fin) {
        this.id_horario = id_horario;
        this.horario_inicio = horario_inicio;
        this.hoarario_fin = hoarario_fin;
    }
}
