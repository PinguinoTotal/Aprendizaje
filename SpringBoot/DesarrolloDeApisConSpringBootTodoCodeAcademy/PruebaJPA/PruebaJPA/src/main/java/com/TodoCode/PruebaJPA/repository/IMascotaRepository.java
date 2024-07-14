package com.TodoCode.PruebaJPA.repository;

import com.TodoCode.PruebaJPA.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository <Mascota,Long>{
    
}
