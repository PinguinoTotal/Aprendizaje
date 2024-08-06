package com.Odontelx.CentroOdonotologico.repository;
import com.Odontelx.CentroOdonotologico.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
    
}