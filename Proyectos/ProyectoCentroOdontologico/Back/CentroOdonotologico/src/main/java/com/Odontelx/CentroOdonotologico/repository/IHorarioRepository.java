package com.Odontelx.CentroOdonotologico.repository;

import com.Odontelx.CentroOdonotologico.model.Horario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHorarioRepository extends JpaRepository<Horario, Long>{
    
}
