package com.todocodeacademy.CursoSpringBoot.controller;

import com.todocodeacademy.CursoSpringBoot.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class applicacionController {
    
    //haciendo post
    @PostMapping("/cliente")
    //request body son los elementos que se mandaran por post
    public void crearCliente(@RequestBody Cliente cli){
            System.out.println("cliente creado");
            System.out.println("El cliente se llama: "
                    + cli.getNombre() + " " +  cli.getApellido());
    }
}
