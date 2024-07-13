package com.TodoCode.PruebaJPA.repository;
import com.TodoCode.PruebaJPA.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
//<Persona, Long>
//esto es la clase que queremos mapear y el tipo de dato del id de esta clase
public interface IPersonaRepository extends JpaRepository <Persona,Long>{
    
}
