package com.TodoCode.ArquitecturaMulticapas.service;
import com.TodoCode.ArquitecturaMulticapas.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

//este archivo brinda servicios de service
@Service
public class PersonaService  implements IPersonaService{
    //métodos de logica de negocio 
    
    //los metodos siempre tienen que ser implementafdos a traves de interfaces 
    
    @Override
    public void crearPersona(Persona per) {
        //logica de creacion
        System.err.println("Persona creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        //aqui deberia ir la logica para devolver la lista de personas
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
