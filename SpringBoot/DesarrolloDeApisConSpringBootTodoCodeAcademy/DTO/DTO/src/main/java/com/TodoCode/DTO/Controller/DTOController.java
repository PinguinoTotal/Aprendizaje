package com.TodoCode.DTO.Controller;

import com.TodoCode.DTO.Inquilino;
import com.TodoCode.DTO.Propiedad;
import com.TodoCode.DTO.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DTOController {
    
    @GetMapping("/propiedad/{id}")
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        //que a traves de la id buscamos la propiedad
        //trajimos al inquilino asociado a esa propiedad
        
        Propiedad prop = new Propiedad(15487L, "casa", "308Negro Arroyo Lane", 200.0, 40000.0);
        
        Inquilino inqui = new Inquilino(1L, "12345678", "Walter", "White", "Profesor de quimica");
        
        //unificando los valores del DTO
        PropiedadDTO propiDTO = new PropiedadDTO();
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        propiDTO.setNombre(inqui.getNombre());
        propiDTO.setApellido(inqui.getApellido());
        
        
        return propiDTO;
    }
}
