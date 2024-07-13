package com.TodoCode.PruebaJPA.controller;
import com.TodoCode.PruebaJPA.model.Persona;
import com.TodoCode.PruebaJPA.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    //el controller llama a la logica, la logica al repository y ella a la base de datos
    
    @Autowired
    IPersonaService persoServ;
    
    //traer todas las personas, es un get
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        //esta es un respuesta clasica, porque tambien puede tener el response
        //entity, etc
        return persoServ.getPersonas();
    }
    
    //crear nueva persona, es post
    @PostMapping("/personas/crear")
    public String SavePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "guardado con exito";
    }
    
    //eliminar persona
    //en http tambien tiene algo para eliminar 
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        persoServ.deletePersona(id);
        return "eliminado correctamente";
    }
    
    //para la edicion es puttmapping 
    
}
