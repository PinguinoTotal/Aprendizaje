package com.todocodeacademy.cursoSpringBoot.controller;

import com.todocodeacademy.cursoSpringBoot.model.Posteo;
import com.todocodeacademy.cursoSpringBoot.repository.IPosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {

    //inyectando la interfaz con autowire
    @Autowired
    IPosteoRepository repo;

    
    @GetMapping("/posteos")
    public List<Posteo> traerTodos() {
        //podemos lalmar a ka intrerfaz porque esta esta asosiada a la clase 
        //y por ende lo podemos llamar porque la clase que implementa la interface
        //tine ele @Override y por ende va a hacer lo que diga la clase que lo 
        //implementa
        return repo.traerTodos();
        
        //lo correcto seria llamar al servicio, y el servicio llama al repositorio
        //pero lo hacemos asi por fines didacticos
    }

}
