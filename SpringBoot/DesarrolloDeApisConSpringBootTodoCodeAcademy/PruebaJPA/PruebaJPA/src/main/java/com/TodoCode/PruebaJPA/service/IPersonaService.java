package com.TodoCode.PruebaJPA.service;

import com.TodoCode.PruebaJPA.model.Persona;
import java.util.List;

public interface IPersonaService {
    //haciendo el crud
    
    //metodo para traer a todas las personas
    //lectura
    public List<Persona> getPersonas();
    
    //alta
    public void savePersona(Persona perso);
    
    //baja
    public void deletePersona(Long id);
    
    //lectura de un solo objeto
    public Persona findPersona(Long id);
    
    //editarPersona 
    
    //las mejores practicas no deberia poder cambiarse el id, pero puede 
    //llegar a pasar
    public void editPersona(Long idOriginal,
                            Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);
}
