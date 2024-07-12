# Spring Boot

## Desarrollo de APIs con Spring Boot 

### Creando una PI con Spring Boot
Primero que nada se debe setear un proyecto de springboot, esto se hace desde una aplicacion web que tiene spring boot, se busca como Spring initializer [esta es la pagina](https://start.spring.io), en el curso pusimos estas dependencias para que funcionara bien: ![Texto alternativo](/assets/img/dependencias.png "Título alternativo")

despues de se debe descargar el proyecto con el boton GENERATE ![Texto alternativo](/assets/img/generate.png "Título alternativo")

despues de esto se debe descomprimir y abrir el proyecto con un editor de texto que pueda usar java

para el control de los endPoints se genera otra carpeta y le ponemos el nombre de controller ![Texto alternativo](/assets/img/controller.png "Título alternativo")

para la administracion de los endpoints es dento de la carpeta controller que tiene el siguiente codigo:

HelliController.java 
~~~ java
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

~~~


la manera en que se comunican el front y el back es a traves de un json {llave: valor} para hacer un array es con [] y si tenemos un elemento con objetos ifguales pues podemso enbglobar todos en [{objeto},{objeto},{objeto}]

~~~ json
[
    {
        "nombre": "cristiano",
        "apelldo": "Ronaldo",
        "edad": 35,
        "equipos": [
            "Sport Club",
            "Manchester United",
            "Real Madrid",
            "Juventud"
        ]
    },
    {
        "nombre": "Lionel",
        "apelldo": "Messi",
        "edad": 35,
        "equipos": [
            "Newll's Old Boys",
            "FC Barcelona",
            "PSG"
        ]
    },
    {
        "nombre": "Zlatan",
        "apelldo": "Ibrahimovic",
        "edad": 40,
        "equipos": [
            "Newll's Old Boys",
            "FC Barcelona",
            "PSG"
        ]
    }
]
~~~

para utilizar el post es necesario utilizar otros metodos:

esta es la estructura que toman los archivos:

![Texto alternativo](/assets/img/distribucionPost.png "Título alternativo")

primero creamos una clase la cual va a ser vir apra mandar objetos de ese tipo

Cliente.java
~~~ java
package com.todocodeacademy.CursoSpringBoot;

import lombok.Getter;
import lombok.Setter;

//usamos una libreria para hacer los seteres y getesr se los atributos
//de la clase
@Getter @Setter
public class Cliente {
    private Long id;
    private String nombre;
    private String apellido;
    
    //aunque tengamos el @Getter @Setter siempre 
    //es una buena practica crear los constructores
    
    //(alt+insert)

    public Cliente() {
    }

    public Cliente(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
~~~ 

luego creamos el scripot que va a resivir las peticiones

applicacionController.java
~~~ java

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

~~~

luego con postman verificamos que los post recibidos de manera correcta 

![Texto alternativo](/assets/img/postman1.png "Título alternativo")


para usar el response body que sera la respuesta de nuestra peticion que nos hagan por get es de esta manera:
applicacionController.java

~~~ java
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
~~~