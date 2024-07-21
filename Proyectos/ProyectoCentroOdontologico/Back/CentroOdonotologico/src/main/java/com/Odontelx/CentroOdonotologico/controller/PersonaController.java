package com.Odontelx.CentroOdonotologico.controller;

import com.Odontelx.CentroOdonotologico.model.Persona;
import com.Odontelx.CentroOdonotologico.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService perServ;
    //create
    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona per){
        perServ.savePersona(per);
        return "Persona creada con exito";
    }
    //read
    //all
    @GetMapping("/personas/traerTodos")
    public List<Persona> getPersonas(){
        return perServ.getPersonas();
    }
    //one
    @GetMapping("/personas/traer/{id}")
    public Persona findPersona(@PathVariable Long id){
        return perServ.findPersona(id);
    }
    //update
    @PutMapping("/personas/edit")
    public String editPersona(@RequestBody Persona per){
        perServ.editPersona(per);
        return "Persona editada correctamente";
    }
    //delete
    @DeleteMapping("/personas/delete/{id}")
    public String deletePersona(@PathVariable Long id){
        perServ.deletePersona(id);
        return "Persona eliminada correctamente";
    }
    
}
