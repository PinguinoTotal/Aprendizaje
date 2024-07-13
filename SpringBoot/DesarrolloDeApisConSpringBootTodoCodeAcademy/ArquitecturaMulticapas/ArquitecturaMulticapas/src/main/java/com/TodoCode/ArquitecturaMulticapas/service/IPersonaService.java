package com.TodoCode.ArquitecturaMulticapas.service;

import com.TodoCode.ArquitecturaMulticapas.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //declarando los metodos en mi interface
    public void crearPersona(Persona per);
    public List<Persona> traerPersonas();
}
