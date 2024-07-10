package com.todocodeacademy.helloWorld.ncontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//con esto decimos que este va a ser nuestro controlador de la api
@RestController
public class HelliController {
    //aqui van a ir todos los endpoints
    
    //EL GET MAPPING es importante porque el es el recibira los gets
    //del front y los administrara y devolvera lo que se necesite devolver
    
    @GetMapping
    public String esperando(){
        return "Esperando a una URl";
    }
    
    
    //con el getMapping con @GetMapping ("/hello") en la direccion 
    //http://localhost:8080/hello nos devolvera Hola mudno desde una API
    //y asi con el bye
    //el gettmaping es capaz de pasar parametros path variablke y request paragram
    //usandoo path variable
    @GetMapping ("/hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Hola " + nombre + "desde una API";
    }
    
    /*tenemos que mencionar que como ya no tenemos el  @GetMapping solo pues 
    ahora nops marcara error al principio si no le ponemos una ruta, ya que no 
    le estamos cargando nada*/
    //se llena como: localhost:8080/byr/pedro/16/informatico
    //de esta manera la infomacion viaja de manera no codificada
    @GetMapping ("/bye/{nombre}/{edad}/{profesion}")
    public String sayBye(@PathVariable String nombre,
                         @PathVariable int edad,
                         @PathVariable String profesion){
        return "Bye World " + "Nombre: " + nombre + 
                             " Edad: " + edad + 
                             " Profesion: " + profesion ;
    }
    
    
    //request param
    //se llena como: localhost:8080/hello?nombre=Pedro&edad=16&profesion=informatico
    @GetMapping ("/hello2")
    public String sayHello2(@RequestParam String nombre,
                            @RequestParam int edad,
                            @RequestParam String profesion){
        return "Bye World " + "Nombre: " + nombre + 
                             " Edad: " + edad + 
                             " Profesion: " + profesion ;
    }
    
    //miniejercicio
    @GetMapping ("/peso")
    public String compararPeso(@RequestParam float peso){
        String textoPeso = "";
        if(peso >= 1 && peso <= 18.5){
            textoPeso = "Peso insuficiente";
        }else if(peso >= 18.6 && peso <= 24.9){
            textoPeso = "Peso normal";
        }else if(peso >= 25.0 && peso <= 29.9){
            textoPeso = "Sobre peso";
        }else if(peso >= 30){
            textoPeso = "Obesidad";
        }
        return textoPeso;
    }
}
