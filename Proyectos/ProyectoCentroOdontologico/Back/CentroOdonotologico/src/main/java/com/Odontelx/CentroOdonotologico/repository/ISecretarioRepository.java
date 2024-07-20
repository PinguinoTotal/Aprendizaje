package com.Odontelx.CentroOdonotologico.repository;
import com.Odontelx.CentroOdonotologico.model.Secretario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISecretarioRepository extends JpaRepository<Secretario, Long> {
    
}
