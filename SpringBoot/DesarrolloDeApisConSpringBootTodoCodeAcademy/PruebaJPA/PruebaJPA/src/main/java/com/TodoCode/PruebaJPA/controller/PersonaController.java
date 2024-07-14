package com.TodoCode.PruebaJPA.controller;
import com.TodoCode.PruebaJPA.model.Persona;
import com.TodoCode.PruebaJPA.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    
    @Autowired
    IPersonaService persoServ;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return persoServ.getPersonas();
    }
    
    //crear persona
    @PostMapping("/personas/crear")
    public String SavePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "guardado con exito";
    }
    
    //eliminar persona
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        persoServ.deletePersona(id);
        return "eliminado correctamente";
    }
    
    //edicion
    @PutMapping("/personas/editar/{id_original}")
    public Persona editPersona(@PathVariable Long id_original,
            @RequestParam(required = false, name = "id") Long nuevaId,
            @RequestParam(required = false, name = "nombre") String nuevoNombre,
            @RequestParam(required = false, name = "apellido") String nuevoApellido,
            @RequestParam(required = false, name = "edad") int nuevaEdad){
        
        persoServ.editPersona(id_original, nuevaId, nuevoNombre, nuevoApellido, nuevaEdad);
        
        Persona perso = persoServ.findPersona(nuevaId);
        return perso;
    }
    
    //en este el id no debe de cambiar
    @PutMapping("/personas/editar")
    public Persona editPersona(@RequestBody Persona per){
        persoServ.editPersona(per);
        
        return persoServ.findPersona(per.getId());
    }
}
