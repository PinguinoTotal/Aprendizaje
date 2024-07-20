package com.Odontelx.CentroOdonotologico.repository;
import com.Odontelx.CentroOdonotologico.model.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IResponsableRepository extends JpaRepository<Responsable, Long> {
    
}
