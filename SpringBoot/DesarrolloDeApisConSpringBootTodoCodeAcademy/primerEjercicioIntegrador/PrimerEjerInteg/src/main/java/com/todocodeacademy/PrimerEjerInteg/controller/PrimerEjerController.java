package com.todocodeacademy.PrimerEjerInteg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimerEjerController {
    @GetMapping()
    public String defa(){
        return "Esperando la entrada de los galones";
    }
    
    @GetMapping("/conversion")
    public String conversion(@RequestParam float galones){
        double gallitro = galones * 3.78541;
        double redondeado = Math.ceil(gallitro);
        return "debes pedir: " + gallitro+ " litros o tambien podrias pedir: " + redondeado +" litros";
    }
}
