# Spring Boot

## Desarrollo de APIs con Spring Boot 

### APIs con Spring Boot

#### Creando una API con Spring Boot
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

#### Patron DTO (Data Transfer Object)

por lo general siempre existen problemas de comunicacion, porque le back y el front hablan diferentes idiomas

Dto es una clase intermediaria entre la comunicacion 

el dto es crear una clase que unifique los valores de diferentes clases que estan ligadas que queremos saber o son necesarios apra el front end 

Inquilino.java
~~~ java
package com.TodoCode.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Inquilino {
    
    // (premisa) al front solo le importa saber el nombre y apellido del inquilino
    private Long id_inquilino;
    private String dni;
    private String nombre;
    private String apellido;
    private String profesion;

    public Inquilino() {
    }

    public Inquilino(Long id_inquilino, String dni, String nombre, String apellido, String profesion) {
        this.id_inquilino = id_inquilino;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
    }
}
~~~

Propiedad.java
~~~ java
package com.TodoCode.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Propiedad {
    
    // (premisa) al front le importa saber todo menos m2 de la propiedad
    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private Double metros_cuadrados;
    private Double valor_alquiler;

    public Propiedad() {
    }

    public Propiedad(Long id_propiedad, String tipo_propiedad, String direccion, Double metros_cuadrados, Double valor_alquiler) {
        this.id_propiedad = id_propiedad;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        this.valor_alquiler = valor_alquiler;
    }
}
~~~

PropiedadDTO.java
~~~ java
package com.TodoCode.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PropiedadDTO {
    private Long id_propiedad;
    private String tipo_propiedad;
    private String direccion;
    private Double valor_alquiler;
    private String nombre;
    private String apellido;

    public PropiedadDTO() {
    }

    public PropiedadDTO(Long id_propiedad, String tipo_propiedad, String direccion, Double valor_alquiler, String nombre, String apellido) {
        this.id_propiedad = id_propiedad;
        this.tipo_propiedad = tipo_propiedad;
        this.direccion = direccion;
        this.valor_alquiler = valor_alquiler;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
~~~

DTOcontroller.java
~~~ java
package com.TodoCode.DTO.Controller;

import com.TodoCode.DTO.Inquilino;
import com.TodoCode.DTO.Propiedad;
import com.TodoCode.DTO.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DTOController {
    
    @GetMapping("/propiedad/{id}")
    public PropiedadDTO devolverPropiedad(@PathVariable Long id){
        //que a traves de la id buscamos la propiedad
        //trajimos al inquilino asociado a esa propiedad
        
        Propiedad prop = new Propiedad(15487L, "casa", "308Negro Arroyo Lane", 200.0, 40000.0);
        
        Inquilino inqui = new Inquilino(1L, "12345678", "Walter", "White", "Profesor de quimica");
        
        //unificando los valores del DTO
        PropiedadDTO propiDTO = new PropiedadDTO();
        propiDTO.setId_propiedad(prop.getId_propiedad());
        propiDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propiDTO.setDireccion(prop.getDireccion());
        propiDTO.setValor_alquiler(prop.getValor_alquiler());
        propiDTO.setNombre(inqui.getNombre());
        propiDTO.setApellido(inqui.getApellido());
        return propiDTO;
    }
}
~~~

#### Arquitectura multicapas

el mas comun de los modelos de capas tiene (todos van en minusculas en el proyecto)
<ol>
    <li>
        Controller
        <ul>
            <li>Capa encargada de atender las solicutudes HTTP entrantes que vamos a tener para poder derivar a la capa que corresponde, a apartir de eso generar un response y poder responder al cliente que hace la solicutud</li>
            <li>Generalmente trabaja con la capa de servicio que es la encargada de buscar los datos y hacer operaciones logicas para poder generar la response</li>
        </ul>
    </li>
    <li>
        Repository o DAO (Data Acces Object)
        <ul>
            <li>Manejo de la persistencia de datos, la interaccion con la base de datos</li>
            <li>Aqui estan las controladoras de persistencia, nuestras clases jpa que necesitemos, las configuraciones que necesitemos para comunicarnos con la base de datos</li>
        </ul>
    </li>
    <li>
        Model(o Entity)
        <ul>
            <li>Aqui van todas las clases enstandares que representan una entidad dentro de mi base de datos</li>
        </ul>
    </li>
    <li>
        DTO (Data Transfer Object)
        <ul>
            <li>Aqui van todos los DTO dentro de este paquete</li>
        </ul>
    </li>
    <li>
        Service
        <ul>
            <li>Aqui vatoda la parte logica del proyecto, las operaciones, operaciones de los metodos,busqueda, autentificacion, etc</li>
        </ul>
    </li>
</ol>


debe de quedar de esta manera:

![Texto alternativo](/assets/img/arquitectura%20de%20capas.png "Título alternativo")

quedando masomenos de esta manera

![Texto alternativo](/assets/img/arquitecturaDeCapasRelleno.png "Título alternativo")

se deben implementar los metodos a traves de interfaces 

carpeta Controller

aplicacionController.java
~~~ java
package com.TodoCode.ArquitecturaMulticapas.controller;

import org.springframework.web.bind.annotation.RestController;

//indicamos que brinda el servicio de rest controller 
@RestController
public class aplicacionController {
    
}
~~~

carpeta Repository o DAO (Data Acces Object)

PersonaRepository.java
~~~ java
package com.TodoCode.ArquitecturaMulticapas.repository;
//el nombre del archivo debe tener el nomnbre y la carpeta en la que va, o 
//más bien que servicio esta brindando

import org.springframework.stereotype.Repository;


//con estos abe que PersonaRepository va a ser un archivo que brinda los 
//servicios de respository, o uno de ellos, ya que puede tener más
@Repository
public class PersonaRepository {
    
    //metodos para llamar a la base de datos, etc
    
}
~~~

carpeta Model(o Entity)

Persona.java
~~~ java
package com.TodoCode.ArquitecturaMulticapas.model;

import lombok.Getter;
import lombok.Setter;


//a la clase persona no tenemos que especificar nada en la cabecera porque java 
//ya lo sabe por default
@Getter @Setter
public class Persona {
    private Long id;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
~~~

carpeta DTO (Data Transfer Object)

esta la vimos la clase anterior

carpeta Service

PersonaService.java
~~~ java
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
~~~

IPersonaService.java
~~~ java
package com.TodoCode.ArquitecturaMulticapas.service;

import com.TodoCode.ArquitecturaMulticapas.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    //declarando los metodos en mi interface
    public void crearPersona(Persona per);
    public List<Persona> traerPersonas();
}
~~~

#### Inyeccion de dependencias 
cada capa debe estar desacoplada de las demas pero puedan llamarse entre si, todo esto es parta que no se haga a traves de instacias si no mediante interfaces, se puede a traves de constructores y seters

la estructura es asi:

![Texto alternativo](/assets/img/intyeccionDeDependenciasCONSySET.png "Título alternativo")


y se implementa de esta manera:

ServicioLavado.java
~~~ java
package com.mycompany.inyecciondedependecias.model;

public class ServicioLavado {
    private ServicioNormal serviNorm;
    private ServicioPremium serviPrem;

    //la inyeccion de dependencias se basa en no hacer nuevois objetos, 
    //si no que solo crearlos una ves y reusarlos
    
    //inyeccion de dependencias por constructores
    public ServicioLavado(ServicioNormal serviNorm, ServicioPremium serviPrem) {
        this.serviNorm = serviNorm;
        this.serviPrem = serviPrem;
    }
    
    //inyeccion de dependencias por set
    public void setServiNorm(ServicioNormal serviNorm) {
        this.serviNorm = serviNorm;
    }

    public void setServiPrem(ServicioPremium serviPrem) {
        this.serviPrem = serviPrem;
    }
    
}
~~~

tambien la inyeccion de dependencias puede hacerse mediante autowire que se hace de esta manera, este es otro nuevo proyecto:

![Texto alternativo](/assets/img/inyeccionAutowirex.png "Título alternativo")

Posteo.java
~~~ java
package com.todocodeacademy.cursoSpringBoot.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Posteo {
    
    private Long id;
    private String titulo;
    private String autor;

    public Posteo() {
    }

    
    public Posteo(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }
}
~~~

IPosteoRepository.java
~~~ java
package com.todocodeacademy.cursoSpringBoot.repository;
import com.todocodeacademy.cursoSpringBoot.model.Posteo;
import java.util.List;

public interface IPosteoRepository {
    
    public List<Posteo> traerTodos();
    
}
~~~

PosteoRepository.java
~~~ java
package com.todocodeacademy.cursoSpringBoot.repository;
import com.todocodeacademy.cursoSpringBoot.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository implements IPosteoRepository{

    @Override
    public List<Posteo> traerTodos() {
        //simulando la base de datos de forma logica
       List<Posteo> listaPosteos = new ArrayList<Posteo> ();
       listaPosteos.add(new Posteo (1L, "¿Cómo formatear una PC?", "Luisina de Paula"));
       listaPosteos.add(new Posteo (2L, "¿Cómo mantener la seguridad?", "Gabriel Guismín"));
       
       return listaPosteos;
    }
}
~~~

aplicaccionController.java
~~~ java
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
~~~

### JPA's (eclipse o hibernate son proveedores de jpa's)

#### Implementando Hibernate a SpirngBoot

primero hacemos la implementacion de dependencias en SpringBoot mediante el SpirngInitializr, 

![Texto alternativo](/assets/img/configuracionHibernateJPA.png "Título alternativo")

*nota: h2 no es tan necesario porque nos permite hacer una mini base de datos que ya podemos hacer con myphpAdmin*

levantamos el proyecto y vamos a la base de datos, creamos una nueva base de datos llamada **pruebaJPA** VACIO

luego levantamos el proyecto en java y hacemos una configuracion en el archivo **aplication.properties** 

![Texto alternativo](/assets/img/applicationproperties.png "Título alternativo")

~~~ 
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/pruebajpa?seSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
~~~

abrimos el localhost en un navegador y ponemos h2-console despues del localhost de esta manera : **http://localhost:8080/h2-console**

esto nos dara una consola de h2 en donde la configuraremos de esta manera

![Texto alternativo](/assets/img/h2Console.png "Título alternativo")

lo de h2 es para ver que nuestra conexion a la base de datos e scorrecta, tambien podemos hacer esto para poder modifoicar la base de datos con h2, pero no es necesario en este momento

creamos un modelo y le damos los decoradores para que se mapee contra una base de datos

y terminamos teniendo un archivo con esta distribucion:

![Texto alternativo](/assets/img/distribucionHibernate1.png "Título alternativo")

y creamo nuestro model, la clase persona 

persona.java
~~~ java
package com.TodoCode.PruebaJPA.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
//marcamos a la clase como una entidad para poder mapearla contra 
//una base de datos
@Entity
public class Persona {
    //le damos a entender que este sera nuestro id
    @Id
    //le damos la secuencia 
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
~~~

crear el servicio personaService con suc correspondiente IpersonaService

recordemos que el controller llama al service y el service llama al repository por ende hacemos la inyeccion de dependencia del repository

PersonaService.java
~~~ java
package com.TodoCode.PruebaJPA.service;
import com.TodoCode.PruebaJPA.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private IPersonaRepository persoRepo;
}

~~~

IPersonaService.java
~~~ java
package com.TodoCode.PruebaJPA.service;

public interface IPersonaService {
    
}
~~~

creamos persona repository, recordemos que esta extiende de JpaReposityory para no tener que hacer todos los metodos, si no que ya solo implementarlos

IPersonaRepository.java
~~~ java
package com.TodoCode.PruebaJPA.repository;
import com.TodoCode.PruebaJPA.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
//<Persona, Long>
//esto es la clase que queremos mapear y el tipo de dato del id de esta clase
public interface IPersonaRepository extends JpaRepository <Persona,Long>{
    
}

~~~

despues de hacer la configuracion, y correr el programa se nos generara una tabla en la base de datos y ya habremos terminado de este ejercicio de como configurar JPA + Hibernate en Spring Boot


#### Creando un CRUD con JPA + Hibernate 

esta clase la vamos a aseguri con lo que ya teniamos echo anteriormente 

implementamos los metodos en IPersonasService

hacemos los respectivops metods implementados en PersonasService

hasta aca ya estaria lista la parte de negocio de nuestra aplicación 
