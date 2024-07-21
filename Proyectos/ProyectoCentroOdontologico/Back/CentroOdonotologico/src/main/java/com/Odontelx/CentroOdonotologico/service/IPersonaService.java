package com.Odontelx.CentroOdonotologico.service;

import com.Odontelx.CentroOdonotologico.model.Persona;
import java.util.List;

public interface IPersonaService {
    //create
    public void savePersona(Persona per);
    //read
    //all
    public List<Persona> getPersonas();
    //one 
    public Persona findPersona(Long id);
    //update
    public void editPersona(Persona per);
    //delte
    public void deletePersona(Long id);
}
