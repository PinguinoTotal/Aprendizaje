package com.todocodeacademy.CursoSpringBoot.controller;

import com.todocodeacademy.CursoSpringBoot.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class applicacionController {
    
    //aqui preparamos la respuesta que deve devolver el back al front
    
    
    @GetMapping("/cliente/traer")
    //queremos que esto sea devuelto en el body de la respuesta 
    @ResponseBody
    public List<Cliente> traetClientes(){
        
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        //se pone 1L porque es un numero long 
        listaClientes.add(new Cliente(1L, "Zlatan", "Ibrahimovic"));
        listaClientes.add(new Cliente(1L, "Cristiano", "Ronaldo"));
        listaClientes.add(new Cliente(1L, "Lionel", "Messi"));
        
        //por default se manda en json 
        return listaClientes;
    }
    
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        //en este ejemplo se fuerza a que la respuesta sqea un sttaus 200 
        //y que responda con el mensaje "esta es una prueba de response"
        //return new ResponseEntity<> ("esta es una prueba de response", HttpStatus.OK);
        
        
        //en este ejemplo se fuerza a que la respuesta sea un sttaus 400 
        //y que responda con el mensaje "esta es una prueba de response"
        return new ResponseEntity<> ("esta es una prueba de response", HttpStatus.NOT_FOUND);
    }
}