# Master en Javascript: Aprende JS, JQuery, Angular, NodeJS

como es necesario que el javascript sea cargado en un html hice una muy pequeña y basica hoja de html para cargar el proyecto
~~~ html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chuleta JavaScript</title>
</head>
<body>
    <h1>Chuleta JavaScript</h1>

    <div id="mi_caja">
        
    </div>
    <button id="miBoton">presioname</button>

    <form action="">
        <input type="text" name="nombre" id="campo_nombre">
    </form>

    <h2>FETCH</h2>
    <div id="fetcher"></div>

    <h2>Jannet</h2>
    <div id="jannet"></div>
</body>

<!--cargar los archivos javascript-->
<script src="chuleta.js"></script>
<script src="chuletaDOM.js"></script>
</html>
~~~ 

## Javascript 

~~~ js
//siempe hay que recordar que javascript es un lenguaje 
//que es compilado ene le navegador por ende siempre se utiliza un 
//html para que se cargue en la pagina y se vea que hace 

//usar modo estricto en javascript
'use strict'

//la variable let solo puede ser usada en donde es declaradada, mientras que var es global 

let miVariable = "hola";
var miOtraVariable = "hola";

//constantes
const MIVARIABLE = "HOLA"

//hacer un número entero que sea un string 
var numeroString = "25";

var numeroNumero = parseInt(numeroString);

//también se puede usar parse flota

//tipos de datos 
var variableString = "";
var variableNumero = 0;
var variebleBool = true;


//typeof nos dice que tipo de dato es la variable
console.log(typeof variableBool)

// estructura If

if(true){

}else if(true){

}else {

}


//operadores lógicos || OR && AND

//switch
switch(edad){
    case 18:

    break;
    case 21:

    break;
    default:

    break;
}

// bucle for 
for(var i=0; i<100; i++){
}

//bucle while
while(true){
}

//bucle do while
do{

}while(true)

//break rompe con el bucle break;

//alertas

alert("");


//alerta que arroja un bool 

var miResultado = confirm("texto");

//alerta ingreso datos 

var miVariable1 = prompt("texto")
//esto regresa un string

//funciones 
function miFuncion(){ return variable;}

//parámetros en funciones 
function miFuncion(numero1, numero2){return numero1 + numero2;}


//parámetros opcionales
function miFuncion(numero1, numero2 = 20){return numero1 + numero2;}

//parámetros rest
//si esto lo uso así el restoDeFrutas va a ser un array que resiva todos los valores de las frutas
function miFuncion(fruta1, fruta2, ...restoDeFrutas){}

//parámetros spreed
//si esto lo uso así el restoDeFrutas va a ser un array que resiva todos los valores de frutas
function miFuncion(fruta1, fruta2, ...restoFrutas){}

var frutilla=["manzana","pera"];

//rest
miFuncion(...frutilla);
//así el valor de fruta1 es manzana y fruta 2 es pera

//el rest expande lo que tenemos en los arrays
console.log(...frutilla); //manzaana pera

//funciones anonimas
//las funciones anonimas solo no tienen nombres y se utilizan opara hacer callbacks

var pelicula = function(nombre){
    return "La pelicula es :" + nombre;
}

pelicula("batman");
// La pelicula es: Batman

//callbacks, es una funcion anonima que se le pasa como parametro a otra funcion 
//y dentro de ella se ejecuta la funcion

//suma y muestra y suma por dos son callbacks
function sumame(nmero1, numero2, sumaYMuestra, sumaPorDos){
    var sumar = numero1 + numero2;
    sumaYMuestra(sumar); //aqui se les pasa el valor psumar para que haga 
    //lo que dice cada una de las funciones 
    sumaPorDos(sumar);
    return sumar;
}

sumame(5,7, function(dato){
    console.log("La suma es: " + dato);
}, 
function(dato){
    console.log("La suma por dos es: " + (dato*2));
}); //esto es una llamada a la funcion sumame pasandole funciones como parametros


//funciones de flecha
//son una manera más clara de hacer callbacks
sumame(5,7
    , (dato) => {
    console.log("La suma es: " + dato);
}, 
(dato) => {
    console.log("La suma por dos es: " + (dato*2));
}); 

//metodos para procesar textos en javascript 
var numero = 44;
var texto1 = "Bienvenido al curso de javascript";
var texto2 = "es muy buen curso"

//convertir a string
numero.toString();
//convertir en minusculas
texto1.toLowerCase();
//convertir a mayusculas
texto2.toUpperCase();

// longitud de string 
texto1.length(); //tambien se usa en arrays

//para unir Strings se hace con +


//metodos de busqueda en Strings 
var busqueda = texto1.indexOf("Curso");
var busqueda = texto1.search("Curso"); //es lomismo que index of

//sacar el texto de un string, dandole el index de donde empeiza y luego cuantas letras quiero sacar
var busqueda = texto1.substring(14,5);

//reemplazar cosas en un string 
//reempleza el texto Javascript con Symphony
var busqueda = texto1.replace("JavaScript","Symphony"); 

//separara string dependeiendo de ddonde quiera 
var busqueda = texto1.slice(14,22);

//obtener un array dependiendo de que parametro le de
//separar el string a traves de sus espacios
var busqueda = texto1.split(" ");

//recortar espacios por adelante y por detras de un string
var busqueda = texto1.trim();


//plantillas de texto 
var nombre = "Piripituchi";
//sacar esto: `` alt+96
var texto = `Hola mi nombre es: ${nombre}` 
//tambien se le puede poner las plantillas con html para poder meterlo en 
//con html


//Arrays
//los arrays pueden tener cualquier tipo de dato
var nombres = ["Hola", "Como estas", 25, true];

var lenguajes = new Array("PHP", "JavaScript");

//llamar una variable del array 
nombres[2];

//saber el largo del array 
nombres.length();

//usando Bucle for each

//elemento es el lenguaje 
//index es el indice
//y data es el array original
lenguajes.forEach((elemento, index, data) => {
    console.log(elemento);
});

//Array dentro de otro arrays


var arr1 = [1,2,3,4,5,6];
var arr2 = [7,8,9,10,11,12];
var multiple = [arr1, arr2];

//agarrar una variable de un array multiple

multiple[0][3]; //nos daria 4


//operaciones con arrays 

//añadir elementos al array 
arr1.push(7);

//eliminar el ultimo elemento del array
arr1.pop();

//eliminar un elemento de un array
//desde el indice 0 elimina 1 elemento
arr1.splice(0, 1)

//convertir un array a un string 
arr1String = arr1.join();

//convertir un string a un array
//pues usando el split que ya habia usado

//ordenando arreglos

//ordenar de manera alfabetica
arr1.sort();

//ordenar de manera alfabetica de manera inversa
arr1.reverse();

//recorrer array con un for in
for (let lenguaje in lenguajes) {
    console.log(lenguajes[lenguaje]);
}

//buscar en un array
var precios = [10,20,30,40,50,60];

//dar el indice de donde encuentre PHP
lenguajes.findIndex(lenguaje => lenguaje == "PHP");

var busqueda = precios.some(precio => precio >= 20); //devuelve true o false


//DOM
//Document objet model

// agregarle a la pagina un html
document.write("<h1>Lenguajes mas cosas, ya no se que decir</h1>");

~~~

## DOM, BOM, EVENTOS, JSON. LOCALSTORAGE PETICIONES ASINCRONAS
~~~ js
//DOM

//evento load (se ejecuta despues de que todo el dom ha sido cargado)

//esto se pone cuando los scripts son cargados en la parte superior del html
window.addEventListener("load", () => { });

//obteniendo la referencia de los objetos por id
var mi_caja = document.getElementById("mi_caja");
//esto seria lo mejor, ya que por clase se deben dar el css

//obteniendo refrencia por clase
var cajitas = document.getElementsByClassName("cajita");

//obteniendo la referencia por etiqueta
var misCajas = document.getElementsByTagName("div");
//esto nos da un array de elementos misCajas[0]

//tomando la caja por querySelector (más elegante)
//se toman como si fueran css
var caja = document.querySelector("#mi_caja");

//tomando la clase caja con querySelector
var cajita = document.querySelectorAll(".cajita");

//crear elementos del dom
var seccion = document.createElement("section");
var parrafo = document.createElement("p");
//var texto = document.createTextNode();//"creando una caja de texto";

//añadiendo el texto en el parrafo
parrafo.append(texto);
seccion.append(parrafo);

mi_caja.innerHTML = "Poner texto desde javascript";
//cambiar estilos desde javascript
mi_caja.style.background = "red";
mi_caja.style.padding = "20px";
mi_caja.style.color = "white";

//agregandole una clase a mi componente caja
mi_caja.className = "hola";

//BOM Browser Object Model

//saber el alto de la ventana
console.log(window.innerHeight);

//saber el ancho de la ventana
console.log(window.innerWidth);

//saber el ancho de la pantalla
console.log(screen.width);

//saber el alto d ela pantalla
console.log(screen.height);

function cambiarColor() {
    alert("se ha cambiado de color, no es cierto");
}

//Eventos
var miBoton = document.querySelector("#miBoton");

miBoton.addEventListener("click", function () {
    cambiarColor();
});

//mouse over ('mouseover')
//mouse out ('mouseout')

var formularioNombre = document.querySelector("#campo_nombre");

//focus ('focus') ("hacer foco en el input, osease seleccionar el input")
//blur ('blur') es salir de el input
//Keydown ('heydown')
//keypress ('keypress')
//keyup ('keyup')

//Temporizadores

var tiempo = setInterval(function () {
    console.log("set interval ejecutado");
}, 3000); //se imprime set interval ejecutado cada 3000 ms

//iniciar el timer
//pues llamar a la funcion que da el set intervalk como variable, se puede hacer un return de esta variable

//parando los timers
clearInterval(tiempo);

//JSON

//esto e sun objeto json
var pelicula = {
    titulo: "Batman vs Superman",
    year: 2017,
    pais: "Estados Unidos",
};

//usando las variables de un json
pelicula.titulo = "Superman Begins";

//array de JSONs
var peliculas = [
    { titulo: "amar te duele", year: 2016, pais: "Francia" },
    pelicula,
];

console.log(peliculas);

//Local Storage (memoria del navegador)
//guardar informacion en html

//saber si tenemos local storage

if (typeof Storage != "undefined") {
    console.log("localStorage disponible");
} else {
    console.log("incompatibilidad con LocalStorage");
}

//Guardar datos
//(key, valor)
localStorage.setItem("titulo", "curso de Symfony de Victor Robles");

//recuperar elemento
localStorage.getItem("titulo");

//guardar objetos
var usuario = {
    nombre: "victor",
    email: "victor@victor.com",
    web: "victor.es",
};

//para hacer la conexion con el local storage y las peticiones debe ser un string
//los objetos json por eso debemos usar JSON.stringify

localStorage.setItem("usuario", JSON.stringify(usuario));

//recuperar objeto
//tambien deben ser convertidos de string (que es como llega)
//a Json usando el JSON.parse
var userjs = JSON.parse(localStorage.getItem("usuario"));

//eliminar cosas de local storage
localStorage.removeItem("usuario");

//eliminar todo el local storage
localStorage.clear();

//peticiones fetch y ajax

//fetch es para hacer peticiones ajax a un back
//usamos apiPlaceHolder

//tambien podemos usar data.josn() para pasar el objeto data a json

var div_usuarios = document.querySelector("#fetcher");
var div_jannet = document.querySelector("#jannet");

var usuarios = [];

//esto es para minimizar el callback hell encadenando promesas
getUsuarios()
    .then((data) => data.json())
    .then((users) => {
        listadoUsuarios(users.data);

        return getJannet(); //como es fetch podemos seguir encadenando thens
    })
    .then(data => data.json())
    .then(user => {
        mostrarJannet(user.data);

        return getInfo();
    })
    .then(data => {
        console.log(data);
    })
    //capturtando errores en las promesas
    .catch(error => {
        console.log(error);
    });

function getUsuarios() {
    //hacemos la promesa
    // el metodo fetch devuelbe promesas
    return fetch("https://reqres.in/api/users?page=2")
}

function getJannet() {
    //hacemos la promesa
    // el metodo fetch devuelbe promesas
    return fetch("https://reqres.in/api/users/2")
}

//creando una promesa propia
function getInfo(){
    var profesor = {
        nombre: "victor",
        apellido: "Robles",
        url: "victor es"
    };

    return new Promise((resolve, reject) => {
        var profesor_string = JSON.stringify(profesor);

        //podemos hacer que la promesa tarde unos segundos con setTimeOut

        //obtenemos un error 
        if(typeof profesor_string != 'string') return reject('error');

        //si no tenbemos erroes regresamos la promesa 
        return resolve(profesor_string);
    });
}

function listadoUsuarios(usuarios) {
    usuarios.map((user, i) => {
        let nombre = document.createElement("h3");

        nombre.innerHTML = `${i} ${user.first_name} ${user.last_name}`;
        
        div_usuarios.appendChild(nombre);
    });
}

function mostrarJannet(user) {
    console.log(user);
    let nombre = document.createElement("h3");

    nombre.innerHTML = `${user.first_name} ${user.last_name}`;

    div_jannet.appendChild(nombre);

}
//capturando cualquier error 

try {
    var year = 2019;
    alert(yea);    
} catch (error) {
    console.log("ha ocurrido un error " + error)
}

//fechas, matematicas y más
var fecha = new Date();

var year = fecha.getFullYear();
var mes = fecha.getMonth(); //el mes 0 es enero
var dia = fecha.getDay();
var hora = fecha.getHours();

~~~

# Master en TypeScript, JavaScript Moderno
~~~javascript
//eccma script, estandar de programacion para javascript, se van adicionando cosas

//let, var y const siguen siendo los mismos, las let hacen un ahorro de memoria 

//eliminar un elemento de los JSON 
pelicula = {
    nombre: "amar te duele",
    anio: 2019
};

//elimina la propiedad del objeto json
delete pelicula.anio;

//buscar si hay una propiedad en el json 
console.log("anio" in pelicula); //true

//tambien es posible accesar a los valores de los Json con 
pelicula["anio"];

//for en jsons
for (let propiedad in pelicula) {
    //tambien es posible accesar a los valores de los Json con 
    console.log(pelicula[propiedad]);
}

//checar que un atributo dentro de un Json no sea una funcion 
//typeof(dato_actual) !== "funcrion"

//tipo de dato Symbol
let animal = Symbol("tigre");
let animal2 = Symbol("tigre");

console.log(animal == animal2)
//false, mo son lo mismo, porque symbol
//hace que este sea unico 

//operador ternario
let persona = ["victor robles", 70];

let edad = (persona[1] >= 18) ? "es mayor de edad" : "es menor de edad";

//Diferebncia entre == y === y != y !==

//== evalua el contenido "80" y 80 == iguales
//== evalua el contenido y el tipo de dato "80" y 80 === diferentes 
//lo mismo con != y !==


//bucles
let nombres = ["pedro", "pablo", "ramses"];

//for of
for (const nombre of nombres) {
    console.log(nombre);
}

//for in (por lo general se usa en JSONs)
for (const indice in nombres) {
    console.log(nombres[indice]);
}

//for each
nombres.forEach((nombre, indice) => {
    console.log(nombre, indice);
});

//iterables
const mi_iterable = nombres[Symbol.iterator]();
console.log(mi_iterable.next()); //avanzar en el array 

//funciones flecha

let multiplicacion = (numero1, numero2) => numero1 * numero2;
//dentro de los JSON no se pueden usar el this en las funciones flechas

//desestructuracion 
let frutas = ["manzana", "pera", "naranja", "sandia"];

/*
let manzana = frutas[0];
let pera = frutas[1];
*/

//si ponemos let [manzana, pera, sandia] = frutas;
//tendremos problemas porque sandia sera igual a naranja
//console.log(sandia)  naranja

let [manzana, pera, naranja, sandia] = frutas;
console.log(manzana) //manzana y asi

//desestructurar objetos

let persona1 = {
    nombre: "Victor",
    edad: 80,
    altura: 190,
    pais: "España"
};

//si aqui hacempos 
//let {nombre,edad1,pais} = persona1;
//console.log(pais) españa
//porque como tiene la misma etiqueta y como es un JSON puede detectarlo
let { nombre, edad1, altura, pais } = persona1;
console.log(nombre) //victor

//utilidad parametros funciones
function mostrarUsurio({ nombre, apellido = "desconocido", ciudad = "barcelona" }) {
    console.log(nombre, apellido, ciudad);
}

//asi "saltamos" los parametros de las funciones 
mostrarUsurio({ nombre: "victor", ciudad: "Valencia" });


//promesas
function getInfo() {
    var profesor = {
        nombre: "victor",
        apellido: "Robles",
        url: "victor es"
    };

    return new Promise((resolve, reject) => {
        var profesor_string = JSON.stringify(profesor);

        //podemos hacer que la promesa tarde unos segundos con setTimeOut
        setTimeout(() => {
            //obtenemos un error 
            if (typeof profesor_string != 'string') return reject('error');

            //si no tenbemos erroes regresamos la promesa 
            return resolve(profesor_string);
        }, 3500);

    });
}

getInfo()
    //las promesas usan thens
    .then(items => console.log(items))
    //catch es para intentar capturar los errores de las promesas
    .catch(error => console.error(error.message))
    //finali siemrpe se utiliza al final de una promesa, lo ultimo que hace 
    .finally(() => console.log("Promesa finalizada"))

//el fetch es una peticion ajax  que devuelve promesas
let pokeapi = fetch("https://pokeapi.co/api/v2/pokemon/ditto")
    .then(response => response.json)
    .then(dito => console.log(dito));


// hacer que las peticiones sean sincronas, que necesites esperar para que se haga algo más
async function getMisInfos() {
    let misInfos = await getInfo();
    console.log(misInfos);
}


//clases con propiedades privadas
class Carro {
    //haciendo una propiedad privada
    //con el # se hace privada
    #_nPuertas = 0;
    #_modelo = "";
    #_nllantas = 0;
    //si es con _ es protegida
    _plazas = 0;
    constructor(modelo, nllantas, npuertas) {
        this.#_modelo = modelo;
        this.#_nllantas = nllantas;
        this.#_nPuertas = npuertas;
    }

    get modelo() {
        return this.#_modelo;
    }

    set modelo(modelo){
        this.#_modelo = modelo;
    }

    get nllantas(){
        return this.#_nllantas;
    }

    set nllantas(nllantas){
        this.#_nllantas = nllantas;
    }

    get nPuertas(){
        return this.#_nPuertas
    }

    set nPuertas(nPuertas){
        this.#_nPuertas = nPuertas;
    }
}

var carro = new Carro("nisan", 4,4);
console.log("el carro es: " + carro.modelo);

//sets, estructura que almacena valores unicos de cualquier tipo
//en este no puede haber valores duplicados
let gadgets = new Set(["movil", "tablet", "portatil"]);
console.log(gadgets);

//metodos de los sets
//agregar elementos
gadgets.add(12);

//tamaño del set 
gadgets.size;

//se recorre con un for in o foreach

//eliminarlos
gadgets.delete(12);

//comprobar existencia
gadgets.has("movil") //true;

//eliminar todos los elementos del set
gadgets.clear();

//maps
//estos siempre tienen clave y valor
const gadgets1 = new Map();
//en este se pueden repetir valores, pero no claves
/*
gadgets1.set(1,"PC");
gadgets1.set(2,"TV");
gadgets1.set(3,"TABLET");
gadgets1.set("cuatro","Movil");
gadgets1.set("cinco","Laptop");*/

//tambien se pueed hacer esto:
gadgets1.set(1,"PC")
        .set(2,"TV")
        .set(3,"TABLET")
        .set("cuatro","Movil")
        .set("cinco","Laptop");

//sacar una variable
console.log(gadgets.get("cinco"));

const antiguos_gadgets = {
    seis: "radiocaset",
    siete: "compact dico",
    ocho: "telefono sobremesa"
};

//volviendo un Json a un map 

const gadgets2 = new Map(Object.entries(antiguos_gadgets));

//nuevos metodos de array 

let personas = ["victror", "paco", "pepe", "juan", "antonio"];

//find 
let busqueda = personas.find((persona) => persona === "pepe"); //regresa pepe

//find index
let busqueda1 = personas.findIndex(persona => persona === "juan"); //regresa el indice 
//de donde encontro a juan 

//crear array basandome en un obejto iterable 
let array_leytras = Array.from("ahsjdlasjdlas");
console.log(array_leytras)// a , h, s, j, ...

//comprobar su existe un elemento dentro de un array 
console.log(persona.includes("paco")); //true

//filtarr array 
let nuevas_personas = personas.filter(persona => persona.includes("a"));
//solo guarda los nombre que tienen una a en el nombre 

//objetos literales
let titulo = "el señor de los anillos";
let genero = "accion";
let duracion = "2 horas";


//esto e sun JSON 
const pelicula = {
    titulo,
    genero,
    duracion,
    [genero+"2022"]: "hola",
    //ahora se pueden hacer asi las funciones 
    mostrar(){
        return this.titulo + " " + this.genero;
    }
};

Object.values(pelicula) //regresa un array con los valores que tiene el JSOn

//novedades Ecmascript

//Nullish ??
function multiplicacion(numero1, numero2){
    //numero1 existe o es diferente de null? si si, dale el valor de numero1, si no es 1 
    numero1 = numero1 ?? 1;
    //numero2 existe o es diferente de null? si si, dale el valor de numero2, si no es 1 
    numero2 = numero2 ?? 1;

    return numero1 * numero2
}

function mostrarUsuario(id, nombre){
    // si (id+" "+nombre) existe o es diferente de null? si si
    // dale el valor de (id+" "+nombre) , si no es "usuario desconocido"
    let mi_usuario = (id+" "+nombre) ?? "usuario desconocido";
    return mi_usuario;
}

//separadores numericos 
let numero4 = 4_000_000_000; //esto sigue siendo un numero 
//pero se lee mejor 

//replace replace all
let frase = "voy en mi moto contentento por la carreterea y veo otra moto";
//esto solo remplaza la priemra vez que se encuentra la palabra moto
let nueva_frase = frase.replace("moto", "coche");
//esto remplaza todo
let nueva_frase1 = frase.replaceAll("moto", "coche");

//asignadores logicos 
let nombre5 = "pedro";
let id = 80;

nombre5 ||= id;
//si nombre5 no vale nada, entonces nombre5 se cargara con el valord e ir;
//si let nombre5;
//y nombre ||= id;
//entonces nombre5 = id;
console.log(nombre5);
~~~


# Universidad Java

## Todos los numeros hacen refecncia a las clases que se tomaron en el curso de universidad Java 
### 621, 622, 623, 624, 625, 626, 627, 628, 629.-
01-01-HolaMundo.js
~~~java
//Ejemplo de tipos de datos en javascript
//tipo de dato string  
var nombre = "ubaldo";
console.log(nombre);

var apellido = "lara";

nombre = 10;
//saber el tipo de dato que es la vraiable
console.log(typeof nombre);

//tipo de dato numerico
var numero = 1000;
console.log(numero);

//tipo de dato object
var objeto = {
  nombre: "juan",
  apellido: "perez",
  telefono: 45445
}
console.log(objeto);

//tipo de dato boolean (true, false)
var bandera = false;

//tipo de dato function
function miFuncion(){}
//las funciones son tipos de datos

//tipo de dato symbol
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

//tipo cakase es una function
class Persona{
  constructor(nombre, apellido){
    this.nombre = nombre;
    this.apellido = apellido;
  }
} //las clases son tipo funcion

//tipo undefined
var x; //undefined es un valor que se le da a una variable
// pero tambien es un tipo de dato
console.log(x);

//null es ausencia de valor, es tipo object
var y = null; //no es como undefined

//arrays en javascript
var autos = ["BMW", "Volvo"]; //es un tipo object
console.log(autos);

//concatenar cadena
var nombreCompleto = nombre + ' ' + apellido;
console.log(nombreCompleto);

//esto lo convierte en un string todo, hasta los numeros
var x = nombre + 2 + 4;

//ya no es tan recomendable poner var a una variable
//esto no e sun abuena practiva
//nombre = "Juan";

let nombre1 = "juan";
console.log(nombre1);

//const ya no es posible cambiarlo
const apellido1 = "Perez";

//las variables deben ser en camell case 
let h,j;
h = 10, j =20;

console.log(h,j);

//javascript es sencible a mayusculas y minusculas
let nombreCompleto1 = "Juan Perez";

//las variables no pueden empezar con numeros

//en javacript las variables son dinamicas
~~~

### 630, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644.-
03-01-OperadoresJavaSript.js
~~~javaScript
//operadores
/*
suma +
resta -
multiplicacion *
exponente **
division /
modulo (resto de division) %
++ incremento
-- decremento
*/

//preincremento ++variable
//primero se incrementa luego se usa
//postinremento variable++
//primero se usa despues de incrementa

//predecremento --variable
//primero se decrementa luego se usa
//postdecremento variable--
//primero se usa despues de decrementa

//precedencia de operadores 
/*
todo se evalua de derecha a izqueirda, lo mejor 
es tener todo controlado usando los parentesis
depende mucho tambien de la importancia de cada una de las 
operaciones 
*/

//operadores compuestos
/*
a += 3; a = a + 3;
a -= 2; a = a - 2;
a *= 2; a = a * 2;
a /= 2; a = a / 2;
a %= 2; a = a % 2;
a **= 2; a = a ** 2;
*/

//operadores de comparacion
/*
== revisa el valor sin importar el tipo
comparacion estricta
=== se revisa el valor e importa el tipo
>=
<= 
<
>
!= operador distinto
distinto estricto
si son diferentes en valor o son diferentes en tipo regresa true
!== 
!
*/

//ejercicio de numero par

let a = 20;

if(a%2==0){
  console.log("el numero es par")
} else{
  console.log("el numero es impar");
}

//lo mejor es no poner valores sin variables, para poder cambiarlo sin problemas
//en el codigo
let adulto = 18;
if(a>=adulto){
  console.log("ya es un adulto")
} else{
  console.log("aun no es un adulto");
}

//operadores logicos
// and && y or || 

//operador ternario es la manera compacta de hacer if else 
let resultado = 3==2 ? true: false;

let hola =  "4";

//convertir de string a numero
let numero = Number(hola);
//esto nos dara NAN si no es un numero

if(isNaN(numero)){
  console.log("no es un numero");
}else{
  console.log("es un numero");
}
~~~

### 653, 654, 655, 656, 657, 658.-
Ciclo While
Ciclo Do while
Ciclo for
palabra break
palabra continue
etiquetas (go to )

### 659, 660, 661, 662, 663.-
~~~javaScript
//arrays
//asi se hacia antes 
//let autos = new Array('BMW, Mercedes');
let autos = ['BRMW', 'Merceedes', 'ASKD'];

//agregando cosas a el array, hasta el final
autos.push("audi");

//tambien se puede agregar asi un nuevo valor
autos[autos.length] = "carro";

//saber si es un arreglo
Array.isArray(autos);

autos instanceof Array;
~~~

### 664, 665, 666, 667, 668, 669, 670, 671, 672, 673.-
07-01-Funciones
~~~javaScript
//la funcion es un codigo reutilizable
function miFuncion(a, b){
  console.log("suma: " + (a + b));
  return a+b;
}

let resultado = miFuncion(2,3);

//funciones anonimas
let x = function(a,b){
  return a+b
};

//la varaibel guarda la referencia de la funcion 
resultado = x(1,2);

//las funciones son objetos que tienen propeidades y metodos

//haciendo una funcion flecha
const sumarFuncionTipoFlecha = (a,b) =>{
a+b;
}

resultado = sumarFuncionTipoFlecha(3,5);
console.log(resultado);

//parametros y argumentos
let sumar = funcion(a,b){
  //tomando el argumento 
  arguments[0];
}

resultado = suma(2); //si no se le ponen todos los
//parametros el que no esta asignado sera undefined
//si no le damos valores por default
//si se le pasa más de los que tienen, se pueden usar pero
//usando arguments

let resultadoTodo = sumarTodo(5,4,13,10,9);

function sumarTodo() {
  let suma = 0;
  //tomando el numero de argumentos que entra en la funcion 
  for (let i = 0; i < arguments.length; i++) {
    suma += arguments[i]
  }
}

/*el paso por valor es que cuando le pasamos un valor a 
una funcion se crea una copia de el valor de esta, pero si lo 
pasamos por referencia si cambiamos el valor de este si se vera 
afectado por fuera de la funcion, solo se copian los que no tienen 
atributos ni metodos, pero los que si, se pasara la referencia 

para pasar la referencia se le pone $variable
*/

//haciendo un objeto
const persona = {
  nombre: 'Juan',
  apellido: 'Perez'
}
~~~

### 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688.-

08-01-Objects
~~~javaScript
//haciendo un objeto
let persona = {
  nombre: 'Juan',
  apellido: 'Perez',
  email: 'Jperez@mail.com',
  edad: 28,
  idioma: 'es',

  //agregar metodos a los objetos
  nombreCompleto: function(){
    //se puede usar this como en las clases de 
    //java 
    return this.nombre + " " + this.apellido;
  },

  get miFuncion(){
    return "otra funcion";
  }, 

  get lang(){
    return this.idioma.toUpperCase();
  },

  set lang(lang){
    this.idioma = lang.toUpperCase();
  }
};

//accediendo a los parametros del objeto
console.log(persona.nombre);
//llamando a la funcion que tenemos en el objeto
console.log(persona.nombreCompleto());

//tambien se puede acceder a las propiedades asi:
console.log(persona['apellido']);

//ciclo for in 
for (proipiedad in persona) {
  //en el ciclo for in obtenemos las claves de los objetos
  console.log(proipiedad);   
  console.log(persona[proipiedad])
}

//agregando nuevas propiedades dinamicamente
persona.tel = 462862;

//eliminando propiedades
delete persona.email;

//volvemos nuestro objeto a un array 
let personaArray = Object.values(persona);
console.log(personaArray)

//metodo get de un objeto 
//ya no es necesario poner ()
console.log(persona.miFuncion)

console.log(persona.lang)

//usando una funcion set
//aunque no se llame como funcion, se esta llamando
//internamente un set que tiene el objeto 
persona.lang ='en';

//otra manera de hacer objetos
let persona2 = new Object();
persona2.nombre = "carlos";
persona2.direccion = "saturno15";
persona2.tel = 46551652;

//funcion constructor
function Persona(nombre, apellido, email){
  //constructor de objetos de tipo persona 
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
  //agregando metodos
  this.nombreCompleto = function(){
    return this.nombre + " " + this.apellido;
  }
}

//usando prototipe para poner parametros dinamicamente
// y ahora ya podemos usar tel
Persona.prototype.tel = '415215354';

//creando objetos que son echos con el constructor, cuando
//ponemos new le damos un nuevo espacio en memoria 
//asi que se crean 
let padre= new Persona('Juan', 'Perez', 'Jperez@mial.com');
padre.tel = '45421385';
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona('Lupe', 'Escupe', 'Elupe@mail.com');
console.log(madre);
console.log(madre.nombreCompleto());

padre.nombre = "Jose";
console.log(padre);


//distintas formas de crear objetos ne JavaScript
let miObjeyto = new Object();
let miObjeto2 = {};

let persona3 = {
  nombre: 'Juan',
  apellido: 'Perez',

  nombreCompleto: function(){
    return this.nombre + " " + this.apellido;
  },

  nombreCompleto2: function(titulo, tel){
    return titulo+ ' ' + this.nombre + ' ' + this.apellido + ' ' + tel;
  }
}

let persona4 = {
  nombre: 'Carlos',
  apellido: 'Lara',
}

//uso del metodo nombre completo que esta en persona 3
//con la persona 4 para que ponga todo el nombre 
console.log(persona3.nombreCompleto.call(persona4));
//con call pasamos parametros a objetos que implementan
//un metodo que no implementa el objeto que trenemos pero funciona 

//usando call, pero con más parametros que le podemos pasar
console.log(persona3.nombreCompleto2.call(persona3, 'Ingeniero', 465182));


//el metodo apply es muy similar a call
//solo que al pasar los otros parametros, se pasan por array
let arreglo = ['Ing', '54132854'];
console.log(persona3.nombreCompleto2.apply(persona4, arreglo));
~~~

### 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700.-
~~~javaScript
//haciendo una clase
class Persona{
  //atributos estaticos
  static contadorObjetosPersona = 0;//atributo de nuestra clase

  static get MAX_OBJ(){ //haciendo un atributo constante, aunque se hace hace 
    //como su fuera un metodo 
    return 5;
  }

  email = 'valor default email';//atributo de nuestro objeto

  constructor(nombre, apellido){
    this._nombre = nombre;
    this._apellido = apellido;
  }

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get apellido(){
    return this._apellido;
  }

  set apellido(apellido){
    this._apellido = apellido;
  }

  //añadiendo una funcion a la clase, que al
  //empleados heredar de esta tambien lo tiene 
  nombreCompleto(){
    return this._nombre + " " +this._apellido;
  }

  //sobreescribiendo un metodo del object
  toString(){
    return this._nombre + " " +this._apellido;
  }

  //metodos estaticos
  static saludar(){
    console.log("Hola desde estatic");
  }

  static saludar2(persona){
    console.log("saludando a : " + persona.nombre)
  }
}

let persona1 = new Persona('Juan', 'Perez');
console.log(persona1);

//usando el metodo get
console.log(persona1.nombre);

//usando el metodo set
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);

let persona2 = new Persona('Carlos','Lara');
console.log(persona2);

//haciendo una clase que extiende de persona
class Empleado extends Persona{
  constructor(nombre,apellido,departamento){
    //inicializando al padre y al hijo
    super(nombre,apellido);
    this.departamento = departamento;
  }

  get departamento(){
    return this._departamento;
  }

  set departamento(departamento){
    this._departamento = departamento;
  }

  //tambien se pueden sobreescribir los metodos
  //de los hijos sobre los padres
  nombreCompleto(){
    return this._nombre + " " +this._apellido+ " " +this._departamento;
  }
}

let empleado1 = new Empleado('juan','lopez','finanzas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

//como las clases extienden del objeto object, podemos hacer uso de
//sus metodos
console.log(empleado1.toString());

//es polimorfismo porque si se llama nombre completo este depende quien lo llame
//van a pasar cosas diferentes 

//los metodos estaticos se asocian desde la clase y no desde un objeto 
Persona.saludar();
Persona.saludar2(persona1);

//los metodos estaticos tambien son heredables, y tambien el polimorfismo se 
//asoscian a sus entradas, por ende si se llama a un objeto persona, podemos 
//pasarle un objeto empleado sin problemas

//usando atributos estaticos 
Persona.contadorObjetosPersona = 5;

//las clases hijas tambien heredan los atributos estaticos
//si incrementamos el atributo estatico en el constructor, tambien lo suma su hijo 

console.log(persona1.email);

console.log(Persona.MAX_OBJ);
~~~

### 701, 702, 703, 704, 705.-
EjercicioPersona.js
~~~javaScript
//todo lo ponemos en el mismo archivo, pero se puede hacer en archivos separados, pero 
//como no tenemos servidor,esto aun no es posible 
class Persona{
  static contadorPersonas = 0;

  constructor(nombre, apellido, edad){
    this._nombre = nombre;
    this._apellido = apellido;
    this._edad = edad;
    this._idPersona = ++Persona.contadorPersonas;
  }

  get idPersona(){
    return this._idPersona;
  }

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get apellido(){
    return this._apellido;
  }

  set apellido(apellido){
    this._apellido = apellido;
  }

  get edad(){
    return this._edad;
  }

  set edad(edad){
    this._edad = edad;
  }

  toString(){
     return "idPersona: " + this._idPersona + " nombre: " + this._nombre + " apellido: " + this._apellido + " edad: " + this._edad;
  }
}

class Empleado extends Persona{
  static contadorEmpleados = 0;
  constructor(nombre, apellido, edad,sueldo){
    super(nombre, apellido, edad);
    this._sueldo = sueldo;
    this._idEmpleado = ++Empleado.contadorEmpleados;
  }

  get idEmpleado(){
    return this._idEmpleado;
  }

  get sueldo(){
    return this.sueldo;
  }

  set sueldo(sueldo){
    this._sueldo =sueldo;
  }

  toString(){
    return super.toString() + " idEmpleado: " + this._idEmpleado + " sueldo: " + this._sueldo;
  }
}

class Cliente extends Persona{
  static contadorClientes = 0;

  constructor(nombre, apellido, edad,fechaDeRegistro){
    super(nombre, apellido, edad);
    this._fechaDeRegistro = fechaDeRegistro;
    this._idCliente = ++Cliente.contadorClientes;
  }

  get idCliente(){
    return this._idCliente
  }

  get fechaDeRegistro(){
    return this._fechaDeRegistro
  }

  set fechaDeRegistro(fechaDeRegistro){
    this._fechaDeRegistro = fechaDeRegistro;
  }

  toString(){
    return super.toString() + " idCliente: " + this._idCliente + " fechaDeRegistro: " + this._fechaDeRegistro;
  }
}

let persona1 = new Persona("Ramiro","Perez",22);
console.log(persona1);

let empleado1 = new Empleado("Chucho", "Ramirez",22, 500);
console.log(empleado1);

let cliente1 = new Cliente("Johana", "Todd", 23, new Date());
console.log(cliente1);
~~~

### 706, 707, 708, 709, 710.-
Ventas.js
~~~javaScript
class Producto{
  static contadorProductos = 0;
  constructor(nombre, precio){
    this._idProducto = ++Producto.contadorProductos;
    this._nombre = nombre;
    this._precio = precio;
  }

  get idProducto(){
    return this._idProducto;
  }

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get precio(){
    return this._precio;
  }

  set precio(precio){
    this._precio = precio;
  }

  toString(){
    return "idProducto: " + this._idProducto + " nombre: " + this._nombre + " precio: " + this._precio;
  }
}

class Orden{
  static contadorOrdenes = 0;
  constructor(){
    this._idOrden = ++Orden.contadorOrdenes;
    this._productos = [];
  }

  static get MAX_PRODUCTOS(){
    return 5;
  }

  agregarProductos(producto){
    if(this._productos.length < Orden.MAX_PRODUCTOS){
      this._productos.push(producto);
    }else{
      console.log("la orden a superado el numero maximo de productos");
    }
  }

  calcularTotal(){
    if(this._productos != 0){
      let total = 0;
      for (let i = 0; i < this._productos.length; i++) {
        total += this._productos[i].precio;
      }
      return "el total de la orden es: " + total;
    }else{
      console.log("la orden no tiene productos");
    }
  }

  toString(){
    return "idOrden " + this._idOrden+ " productos: " + this._productos;
  }
}

let orden1 = new Orden();

let producto1 = new Producto("chicles", 2);
console.log(producto1);
let producto2 = new Producto("mouse", 500);
console.log(producto2);
let producto3 = new Producto("rancheritos", 1441);
console.log(producto3);

orden1.agregarProductos(producto1);
orden1.agregarProductos(producto2);
orden1.agregarProductos(producto3);

console.log(orden1);

console.log(orden1.calcularTotal());


~~~

### 711, 712, 713, 714, 715, 716, 717.-
MundoPC.js
~~~javaScript
'use strict';

class DispositivoEntrada{
  constructor(tipoEntrada, marca){
    this._tipoEntrada = tipoEntrada;
    this._marca = marca;
  }

  get tipoEntrada(){
    return this._tipoEntrada;
  }

  set tipoEntrada(tipoEntrada){
    return this._tipoEntrada = tipoEntrada;
  }

  get marca(){
    return this._marca;
  }

  set marca(marca){
    return this._marca = marca;
  }

  toString(){
    return "tipoEntrada: " + this._tipoEntrada + " marca: " + this._marca;
  }
}

class Raton extends DispositivoEntrada{
  static contadorRatones = 0;
  constructor(tipoEntrada, marca){
    super(tipoEntrada, marca);
    this.idRaton = ++Raton.contadorRatones;
  }

  toString(){
    return super.toString + " idRaton: " + this._idRaton;
  }
}

class Teclado extends DispositivoEntrada{
  static contadorTeclados = 0;
  constructor(tipoEntrada, marca){
    super(tipoEntrada, marca);
    this.idTeclado = ++Teclado.contadorTeclados;
  }

  toString(){
    return super.toString + " idTeclado: " + this._idTeclado;
  }
}

class Monitor{
  static contadorMonitores = 0;
  constructor(marca, tamano){
    this._marca = marca;
    this._tamano = tamano;
    this._idMonitor = ++Monitor.contadorMonitores;
  }

  get idMonitor(){
    return this._idMonitor;
  }

  get marca(){
    return this._marca;
  }

  set marca(marca){
    this._marca = marca;
  }

  get tamano(){
    return this._tamano;
  }

  set tamano(tamano){
    this._tamano = tamano;
  }

  toString(){
    return "idMonitor: " + this._idMonitor + " marca: " + this._marca + " tamaño: " + this._tamano;
  }
}

class Computadora{
  static contadorComputadoras = 0;
  constructor(nombre, monitor, teclado, raton){
    this._nombre = nombre;
    this._monitor = monitor;
    this._teclado = teclado;
    this._raton = raton;
    this._idComputadora = ++Computadora.contadorComputadoras;
  }

  get idComputadora(){
    return this._idComputadora;
  } 

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get monitor(){
    return this._monitor;
  }

  set monitor(monitor){
    this._monitor = monitor;
  }

  get teclado(){
    return this._teclado;
  }

  set teclado(teclado){
    this._teclado = teclado;
  }

  get raton(){
    return this._raton;
  }

  set raton(raton){
    this._raton = raton;
  }

  toString(){
    return "idComputadora: " +this.idComputadora
    + " nombre: "+this._nombre
    + " monitor: "+this._monitor
    + " teclado: "+this._teclado
    + " raton: "+this._raton; 
  }
}

class Orden{
  static contadorOrdenes = 0;
  constructor(){
    this._idOrden = ++Orden.contadorOrdenes;
    this._computadoras = [];
  }

  agregarComputadora(computadora){
    this._computadoras.push(computadora);
  }

  mostraOrden(){
    this._computadoras.forEach(computadora => {
      console.log(computadora);
    });
  }

  get idOrden(){
    return this._idOrden;
  }

  get computadoras(){
    return this._computadoras;
  }

  set computadoras(computadoras){
    this._computadoras = computadoras;
  }

  toString(){
    return "idOrden: " + this._idOrden + " computadoras: " + this._computadoras;
  }
}

let raton1 = new Raton("raton", "marcanius");
console.log(raton1);
let raton2 = new Raton("raton", "Razer");
console.log(raton2);

let teclado1 = new Teclado("teclado", "marcanius");
console.log(teclado1);
let teclado2 = new Teclado("teclado", "Razer");
console.log(teclado2);

let monitor1 = new Monitor("marcanius", "3 pulgadas");
console.log(monitor1);
let monitor2 = new Monitor("razer", "20 pulgadas");
console.log(monitor2);

let computadora1 = new Computadora("computadora1", monitor1, teclado1, raton1);
let computadora2 = new Computadora("computadora2", monitor1, teclado1, raton2);
let computadora3 = new Computadora("computadora3", monitor1, teclado2, raton1);
let computadora4 = new Computadora("computadora4", monitor1, teclado2, raton2);
let computadora5 = new Computadora("computadora5", monitor2, teclado1, raton1);
let computadora6 = new Computadora("computadora6", monitor2, teclado1, raton2);
let computadora7 = new Computadora("computadora7", monitor2, teclado2, raton1);
let computadora8 = new Computadora("computadora8", monitor2, teclado2, raton2);

let orden = new Orden();

orden.agregarComputadora(computadora1);
orden.agregarComputadora(computadora2);
orden.agregarComputadora(computadora3);
orden.agregarComputadora(computadora4);
orden.agregarComputadora(computadora5);
orden.agregarComputadora(computadora6);
orden.agregarComputadora(computadora7);
orden.agregarComputadora(computadora8);

orden.mostraOrden();
~~~

### 718, 719, 720, 721.-
la sobreescritura es ponerle el mismo nombre a la funcion que tiene el padre en el hijo y asi se puede sobreescribir la funcion

polimorfismo quiere decir multiples formas 

podemosa saber de que clase sea 
if(tipo instanceof empleado1) true or false

el instance of nos puede reconocer como true si preguntamos por la clase padre a una clase hija, porque esta hereda de su padre

### 722, 723, 724, 725.-
~~~javaScript
'use strict'

//el bloque try catch hace que 
//se intente algo y capura el error si ocurre
//pero no hace que el programa colapse abruptamente
let resultado = -1;
try {
  //x =10;
  //el throw hace que podemos hacer nuestros propios errores
  if(isNaN(resultado))throw"no es un numero"
} catch (error) {
 console.log(error); 
}
finally{
  //siempre se ejecuta este bloque de codigo,
  //aunque lance o no el error 
}


//funciones flecha o funciones anonimas 
let miFuncionFlecha = () =>{
  console.log("saludos desde mi funcion flecha");
}

miFuncionFlecha();

const funcionesConParametros = (mensaje) => console.log(mensaje);

funcionesConParametros("hola");

~~~

### 726, 727, 728.-
Callbaks
~~~javaScript
//los callbacks son funciones que 
//se pasan como parametros a otras funciones 

function miFuncion1(){
  console.log('funcion1');
}

function miFuncion2(){
  console.log('funcion2');
}

function imprimir(mesnsaje){
  console.log(mesnsaje);
}

function sumar(op1, op2, funcionCallback){
  let res = op1 + op2;
  funcionCallback(`Se imprime el resultado que es: ${res}`);
}

sumar(5,3,imprimir)

//en la funcion callback se usa la funcion que pasamos a la funcion 
//ver el ejemplo anterior 

//los callbacks son para procesos que se ejecutan de manera asincrona 

//lamadas asicnronas con uso setTimeout
function miFuncionCallback(){
  console.log('saludo asincrono despues de 3 segundos')
}

setTimeout(miFuncionCallback, 3000);

miFuncion1();

//con set time out hace que una funcion se dispare despues de 3 segundos 
setTimeout(()=>console.log("saludo asincrono 2 de 5 segundos"), 5000);

//la clase 728 explica muy bien de porque usar 
//funciones asincronas 

//usando set interval
//manda a llamar una funcion cada cierto tiempo

let reloj = () =>{
  let fecha = new Date();
  console.log(`${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
}

//el set interval llama la funcion reloj cada segundo 
setInterval(reloj, 1000);

~~~

### 729, 730, 731, 732, 733.-
~~~javaScript
//las promesas son codigo que tienen varios estados
/*primero se corre el codigo y pasa a pendiente, luego 
pasa a ser resuelto o rechazar*/

//las promesas debenn resivir callbacks
let miPromesa = new Promise((resolver,rechazar)=>{
  let expresion = false;
  if(expresion){
    resolver('Resolvio correcto');
  }else{
    rechazar('Se produjo un error');
  }
});

//se meten callbacks a los parametros
miPromesa.then(valor => console.log(valor),error => console.log(error));

//lo de arriba es lo mimso que esto de abajo 
miPromesa.then(valor => console.log(valor)).catch(error => console.log(error));


//en las promesas no es necsario hacer uso de la parte de error 
//aqui s eve que se puede suar la funcion timeout, para
//hacer asicnrono esto 
let promesa = new Promise(resolver => {
  console.log('Inicio promesa');
  setTimeout(()=> resolver('saludos con promesa y timeput'), 3000);
  console.log('Fin de la promesa');
});

promesa.then(valor => console.log(valor));

//async significa que una funcion esta obligada a regresar una promesa 
//esto hacxe que ya no sea necesario meter el resolver
//por que siempre va a estar activo
async function miFuncionConPromesa(){
  return 'saludos con promesa y async';
}

miFuncionConPromesa().then(valor => console.log(valor));

//await y async
//await espera el resultado de la promesa

async function miFuncionConPromesaYAwait(){
  let miPromesa = new Promise(resolver => {
    resolver('promesa con await');
  });

  //await llama la promesa y espera el resultado 
  //de la promesa y lo imprime
  console.log(await miPromesa);
}

miFuncionConPromesaYAwait();

//promesas await async y setTimeout, esta promesa se 
//realizara despues de cierto tiempo

async function funcionConPromesaAwaitTimeout(){
  let miPromesa = new Promise((resolver)=>{
    setTimeout(() => resolver('Promesa con timeout'), 3000)
  });
  console.log(await miPromesa);
}

//es necsario poner async para poder usar el 
//await dentro de una funcion 
funcionConPromesaAwaitTimeout();
~~~

### 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756.-
Manejo del DOM HTML con JavaScript y Manejo de Eventos con DOM HTML y Javascript
~~~html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="style.css">
  <title>Document</title>
</head>
<!--este metodo se pone para ver en que momento se carga el body 
de la pagina -->
<body onload="entrar()">
  <h1 id="cabecero">Ejemplo DOM con javascript</h1>
  <p class="parrafo">saludos</p>
  <p class="parrafo">saludos</p>
  <p class="parrafo">saludos</p>

  <h2>Formulario</h2>
  <form action="get" id="formulario">
    <label for="nombre">Nombre: </label>
    <input type="text" name="nombre" id="nombre" placeholder="escribe tu nombre"><br>

    <label for="apellido">Apellido: </label>
    <input type="text" name="apellido" id="apellido" placeholder="escribe tu apellido"><br>
  </form>

  <button onclick="mostrarValores()">Mostrar</button>

  <div id="valores">

  </div>

  <h2>Cambiando imagenes</h2>
  <img id="imagen" src="html5.png" alt="javascript">

  <button onclick="cambioImagen()">Cambiar Imagen</button>

  <h2>Eventos</h2>
  <!--si se le pone on se pueden ver todos los eventos que se le pueden 
  poner en el html-->
  <h3 onclick="cambiarTexto(this)">link que se puede puchurrar</h3>

  <h3 id="titulo3">Titulo que cambia desde javascript</h3>

  <!--el script de javascript debe estar despues de los
  eleemntos que queremos manipular-->
  <script src="script.js"></script>

  <h2>Evento Onchange</h2>
  Nombre: <input type="text" name="nombre1" id="nombre1" onchange="convertir(this)">

  <!--asi se ponemn los onmouse  cuando se pasa sobre el texto o sale del texto-->
  <h2 onmouseover="funcionDeOnmouseOver()">OnmouseOver</h2>
  <h2 onmouseout="funcionDeOnmouseOut()">OnmouseOut</h2>

  <!--asi se ponemn los onmouse  cuando se da click y se levanta el click-->
  <h2 onmousedown="funcionDeOnmouseDown()">OnmouseOver</h2> <!--cuando tenemos el mouse abajo-->
  <h2 onmouseup="funcionDeOnmouseUp()">OnmouseOut</h2> <!--cuando levantamos el click-->
  <h2 onclick="funcionDeonClick()">OnmouseOut</h2> <!--este se hace muy rapido, pero se hace-->

  <!--cuando un evento pierde el focus se le pone el blur-->
  <h2 onfocus="" onblur=""></h2>

</body>
</html>
~~~

~~~javaScript
'use strict'

//accediendo a lo que tiene dentro cabecero
let cabecero = document.querySelector('#cabecero').innerHTML;

console.log(cabecero);

//console.log(document.querySelector('#parrafo').innerHTML);

//cambiando lo que tien el h1 a traves de javascript
document.querySelector('#cabecero').innerHTML = 'nuvo cabecero';

//tomando todos los elementos que tienen una misma etiqueta
//document.getElementsByTagName();

//tomando todos los elementos que tienen esa clase
let parrafos = document.getElementsByClassName('parrafo');
console.log(parrafos);

//usando el query selectorAll agrra todos los elemntos que tienen una misma classe 
//pero este puede ser más especifico como

let parra = document.querySelectorAll('h1.parrafo');

let par = document.querySelectorAll('.parrafo');
console.log(par);

function mostrarValores(){
  //asi accedemos a el formulario, que es el id que le dimos en html
  let formulario = document.forms['formulario'];
  let texto = '';
  //tambien se puede acceder a los valores de esta manera:
  //aqui accedemos al objeto input de name nombre
  let nombre = formulario['nombre'];

  for (let i = 0; i < formulario.length; i++) {
    //con le value se toma el valor de el formulario, lo que la 
    //escribio dentro de el 
    texto += formulario[i].value + ' ';
    
  }
  console.log(texto);

  document.querySelector("#valores").innerHTML = texto;

  //al usar document.write despues de que ya fue compilado toda la
  //pagina este sobreecribe todo el contenido que tenga la pagina 
  //document.write('saludos desde javascript')
}

let ruta1Imagen = "javascript.png";
let ruta2Imagen = "html5.png";
function cambioImagen(){
  let imagen = document.querySelector('#imagen');
  if (imagen.src === ruta1Imagen) {
    imagen.src = ruta2Imagen;
  }else{
    imagen.src = ruta1Imagen;
  }
}

//eventos
function cambiarTexto(texto){
  //aqui podemos hacer esto porque le pasamos 
  //por parametros la refencia del objeto htm que queremos cambiar
  texto.innerHTML = 'otro texto';
}

//añadiendo el llamdo de la funcion en el javascripe en lugar de en el 
//html
let titulo3 = document.querySelector('#titulo3');
titulo3.onclick = cambiaTexto;

function cambiaTexto(){
  titulo3.innerHTML = 'nuevo titulo'
}

function entrar(){
  alert('entrando a la pagina web');
  let texto = '';
  //revisando si las cookies estan habilitadas
  if(navigator.cookieEnabled){
    texto = 'cookies estan habilitadas';
  }else{
    texto = 'las cookies estan deshabilitadas';
  } console.log(texto);
}

function convertir(nombreInput){
  nombreInput.value = nombreInput.value.toUpperCase();
}

//para usar adeventListener necesitamos llamarlo desde javascript
//se escribe igual que en el html, solo que se le quita el "on" de "onclick"
document.querySelector('#nombre').addEventListener('focus',cambiar);
document.querySelector('#nombre').addEventListener('blur',regresar);
document.querySelector('#apellido').addEventListener('focus',cambiar);
document.querySelector('#apellido').addEventListener('blur',regresar);

//funciones flecha con addEventListener
document.querySelector('#nombre').addEventListener('focus',(evento) => {
  evento.target.style.background = 'pink';
});
document.querySelector('#nombre').addEventListener('blur',(evento) => {
  evento.target.style.background = 'white';
});

//tambien es posible hacer que se le aplique todos los event listeners 
//a todos los elementos de un formulario 
const forma = document.getElementById('forma');
forma.addEventListener('focus', cambiar);
forma.addEventListener('focus',(evento) => {
  evento.target.style.background = 'pink';
}, true);
forma.addEventListener('blur',(evento) => {
  evento.target.style.background = 'white';
}, true);


function cambiar(evento){
  //esto hace referencia al elemento u objetop que lanza el evento
  let componente = evento.target;
  componente.style.background = 'yellow';
}

function regresar(evento){
  let componente = evento.target;
  componente.style.background = 'white';
}
~~~

### 757, 758, 759, 760.-
Calculadora
este proyecto no tiene css porque se hiz con clases a traves de boostrap
~~~html
<!doctype html>
<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
  <body>
    <div class="container">
      <h1 class="m-3 mb-5 mt-5">Aplicación Calculadora</h1>
      <form id="calculadora">
        <div class="mt-3 mb-3">
          <label for="operacionA" class="form-label">Operacion A</label>
          <input type="number" class="form-control" placeholder="Operacion A" aria-label="Recipient's username" aria-describedby="basic-addon2" id="operacionA">
        </div>
        <div class="mt-3 mb-3">
          <label for="operacionB" class="form-label">Operacion B</label>
          <input type="number" class="form-control" placeholder="Operacion B" aria-label="Recipient's username" aria-describedby="basic-addon2" id="operacionB">
        </div>
        <button type="submit" class="btn btn-outline-primary" >Sumar</button>
        <div class="mt-3" id="resultado">
        </div>
      </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <script src="js/script.js"></script>
  </body>
</html>
~~~

~~~javaScript
'use strict'
let formulario = document.getElementById('calculadora');
formulario.addEventListener('submit',sumar);
let operacionA = document.getElementById('operacionA');
let operacionB = document.getElementById('operacionB');
let resultado = document.getElementById('resultado');


function sumar(){
  let resultadoText = "Resultado: "
  let opAval = parseFloat(operacionA.value);
  let opAva2 = parseFloat(operacionB.value);
  if (!isNaN(opAval) && !isNaN(opAva2)) {
    resultadoText += (opAval + opAva2);
  } else{
    resultadoText += 'La operación no incluye números';
  }
  resultado.innerHTML = resultadoText;
  event.preventDefault();
}
~~~

### 761, 762, 763, 764, 765.-
Listado de personas
~~~html
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles/style.css">
  <title>Listado de Personas</title>
</head>
<body>
  <h1>Listado de personas</h1>

  <div id="nombres">
    <ul id="listaNombres">
    </ul>
  </div>

  <div id="agregar">
    <div id="boton_sumar">
      <button id="agregar_nombre">+</button>
    </div>

    <div id="campos">
      <input type="text" id="nombre" placeholder="Nombre">
      <input type="text" id="apellido" placeholder="Apellido">
    </div>


    <script src="js/app.js"></script>
  </div>
</body>
</html>
~~~

~~~css
* {
  padding: 0;
  margin: 0;
  font-family: "Franklin Gothic Medium", "Arial Narrow", Arial, sans-serif;
}

body {
  background: linear-gradient(to right, #00878b, #1c8df1);
}

h1 {
  background-color: #3c55bd;
  width: 550px;
  color: white;
  text-align: center;
  font-size: 35px;
  letter-spacing: 5px;
  padding: 15px;
  border-radius: 5px;
  margin: 0px auto;
  margin-top: 55px;
}

#nombres {
  background-color: white;
  width: 500px;
  margin: 0px auto;
  padding: 40px;
  border-radius: 5px;
  margin-top: 55px;
  height: auto;
}

#agregar {
  background-color: white;
  width: 580px;
  margin: 0px auto;
  border-radius: 5px;
  margin-top: 55px;
  height: 100px;
}

#boton_sumar {
  margin: 0px auto;
  text-align: center;
  border-radius: 5px;
}

#boton_sumar button {
  height: 50px;
  
  width: 50px;
  border-radius: 90px;
  border: 0px;
  background-color: #3c55bd;
  color: white;
  font-size: 35px;
  margin-top: 5px;
}

#boton_sumar button:hover {
  cursor: pointer;
  background-color: #00878b;
}

#campos{
  display: flex;
  justify-content: space-around;
  margin-top: 15px;
}

input[type=text]{
  border: 0px;
  font-size: 20px;
  text-align: center;
}

~~~

~~~javaScript
let botonAgregarNombre= document.getElementById('agregar_nombre');
botonAgregarNombre.addEventListener('click',agregarNombre);
let lista = document.getElementById('listaNombres');
let nombre = document.getElementById('nombre');
let apellido = document.getElementById('apellido');



function agregarNombre(){
  let listItem = document.createElement("li");
  let nombreCompleto = nombre.value + " " + apellido.value;
  listItem.textContent = nombreCompleto;
  lista.appendChild(listItem);
  nombre.value = "";
  apellido.value = "";
}
~~~

### 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787.-
index.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="styles/style.css">
  <title>Document</title>
</head>
<body>

  <header>
    <h3>Presupuesto Disponible:</h3>

    <h1 id="presupuestoValor">$800.00</h1>

    <div id="ingresosEgresosHeader">

      <div id="ingresosTotalesBox" class="totales">
        <div class="ingresosEgresosHeaderText">Ingresos</div>
        <div id="ingresoGeneral">$ 2,100.00 <div class="porcentajeVacio"></div></div>
      </div>

      <div id="egresosTotalesBox" class="totales">
        <div class="ingresosEgresosHeaderText">Egresos</div>
        <div id="egresoGeneral">- $ 1,300.00<div class="porcentaje">61.90%</div></div>
      </div>

    </div>
    
  </header>

  <div id="agregar">

    <select id="sumaResta" name="iOe" class="elementoAgregar">
      <option value="ingreso">+</option>
      <option value="egreso">-</option>
    </select>

    <input id="conceptoAgregar" type="text" class="elementoAgregar" placeholder="Nuevo Concepto">

    <input id="valorNumero" type="number" class="elementoAgregar" name="valorNumero" placeholder="100">

    <button id="botonAgregar" class="elementoAgregar textoVerde"><ion-icon name="checkmark-circle-outline"></ion-icon></button>
  
  </div>

  <div id="cajaIngresoEgreso">

    <div class="cuerpo">
      <h3 id="cajaIngresoText" class="textoVerde">INGRESOS</h3>
      <div id="listaIngresos">

        <!--aqui van los elementos que se ponen atraves de javascript
        de tipo ingreso-->

      </div>
    </div>

    <div class="cuerpo">
      <h3 id="cajaEgresoText" class="textoRojo">EGRESOS</h3>
      <div id="listaEgresos">

        <!--aqui van los elementos que se ponen atraves de javascript
        de tipo egreso-->

      </div>
  </div>


  <!--los datos que vamos a usar-->
  <script src="js/Dato.js"></script>
  <script src="js/Ingeso.js"></script>
  <script src="js/Egreso.js"></script>
  <!--main de la pagina-->
  <script src="js/app.js"></script>
  <!--haciendo el link para que funcionen los iconos-->
  <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
</body>
</html>
~~~

style.css
~~~css
*{
  padding: 0;
  margin: 0;
}

.textoRojo{
  color: #D18576;
}

.textoVerde{
  color: #70B6C0;
}

button:hover{
  cursor: pointer;
}

header{
  background: linear-gradient(to right, #EB342E, #6A5191);
  color: white;
  text-align: center;
  font-family: Arial, Helvetica, sans-serif;
  padding: .1px;
}

header h1,h3{
  font-weight: normal;
}

header h3{
  font-size: 30px;
  letter-spacing: 2px;
  margin-top: 20px;
}

header h1{
  margin: 30px;
  font-size: 70px;
}

#ingresosEgresosHeader{
  width: 450px;
  margin: 0px auto;
}

#ingresosTotalesBox{
  background-color: #1CAAB7;
}

#egresosTotalesBox{
  background-color: #FF6046;
}

.totales{
  display: flex;
  justify-content: space-between;
  padding: 15px;
  margin-bottom: 15px;
}

.ingresosEgresosHeaderText{
  text-transform: uppercase;
}

.porcentaje, .porcentajeVacio, .porcentajeEgreso{
  width: 60px;
  height: 20px;
  float: right;
  margin-left: 10px;
  line-height: 20px;
}
.porcentaje, .porcentajeEgreso{
  background-color: #FF816F;
  font-size: 12px;
  border-radius: 11px;;
}

.porcentajeEgreso{
  background-color: #FFDED9;
  text-align: center;
}



#agregar{
  display: flex;
  background-color: #F7F7F7;
  height: 60px;
  justify-content: center;
}

.elementoAgregar{
  margin: 11px 8px;
  border: 2px solid #f1f1f1a1;
  border-radius: 5px;
}

#sumaResta{
  width: 50px;
  padding-left: 8px;
}

#conceptoAgregar{
  width: 450px;
}

#valorNumero{
  width: 100px;
  
}

#botonAgregar{
  background-color: transparent;
  font-size: 30px;
  margin-top: 16px;
  border: none;
}

#cajaIngresoEgreso{
  display: flex;
  justify-content: center;
}

.cuerpo{
  margin: 32px;
  margin-top: 50px;
}

#cajaIngresoText, #cajaEgresoText{
  border-bottom: 1px solid #e7dfdf;;
  padding-bottom: 10px;
}

.elemento {
  display: flex;
  position: relative;
  padding: 12px;
  border-bottom: 1px solid #e7dfdf;;
  font-size: 19px;
  color: #848488;
  width: 400px;
  justify-content: space-between;
  transition: all .3s;
}

.valor{
  transition: all .3s;
}



.eliminar{
  position: absolute;
  border: none;
  background-color: transparent;
  font-size: 22px;
  font-weight: bolder;
  right: 10px;
  display: inline-block;
  opacity: 0;
  transition: all .3s;
}

.elemento:hover .eliminar{opacity: 1;}
.elemento:hover .valor{
  transform: translateX(-25px);
}
~~~

app.js
~~~javaScript
"use strict"

let listaDeIngresosArray = [new Ingreso("Salario", 2100),
                      new Ingreso("Venta cohe", 1500)
];
let listaDeEgresosArray = [new Egreso("Renta departamento", 900),
                      new Egreso("Reyes de reyezs", 1200),
                      new Egreso("Reyes", 200)
];

//datos necesarios 
let ingresos=0;
let egresos=0;
let presupuesto=0;

//lista de ingresos DOM
let listaDeIngresosDOM = document.getElementById('listaIngresos');
//lista de egresos DOM
let listaDeEgresosDOM = document.getElementById('listaEgresos');
//ingresos generales DOM
let ingresosGeneralesDOM = document.getElementById('ingresoGeneral');
//egresos generales DOM
let egresosGeneralesDOM = document.getElementById('egresoGeneral');
//presupuesto disponible DOM
let presupuestoDisponibleDOM = document.getElementById('presupuestoValor');
//boton para capturar los datos
let botonAgregar = document.getElementById('botonAgregar');
//campos que se van a agregar
let signo = document.getElementById('sumaResta');
let conceptoText = document.getElementById('conceptoAgregar');
let valorText = document.getElementById('valorNumero');

calculaYEnsenaParametros();

botonAgregar.addEventListener('click',()=>{
  if(conceptoText.value === "" || isNaN(parseInt(valorText.value))){
    alert('Comprube los datos de entrada');
  }else{
    if(signo.value==="ingreso"){
      let ingreso = new Ingreso(conceptoText.value, parseInt(valorText.value));
      listaDeIngresosArray.push(ingreso);
    }else{
      let egreso = new Egreso(conceptoText.value, parseInt(valorText.value));
      listaDeEgresosArray.push(egreso);
    }
    calculaYEnsenaParametros();
  }
});

function calculaYEnsenaParametros(){
  calcularIngresosYEgresos();
  construirListaDeIngresos();
  construirListaDeEgresos();
}

function calcularIngresosYEgresos(){
  ingresos=0;
  egresos=0;
  presupuesto=0;

  let porcentajeEgreso=0.0;

  listaDeIngresosArray.forEach(ingreso => {
    ingresos += ingreso.valor;
  });

  listaDeEgresosArray.forEach(egreso => {
    egresos += egreso.valor;
  });
  presupuesto = ingresos - egresos;

  porcentajeEgreso = (egresos*100)/ingresos;

  console.log(porcentajeEgreso);
  ingresosGeneralesDOM.innerHTML = `${formatoDinero(ingresos)} <div class="porcentajeVacio"></div>`;
  egresosGeneralesDOM.innerHTML = `-${formatoDinero(egresos)}<div class="porcentaje">${porcentajeEgreso.toFixed(2)}%</div>`;
  presupuestoDisponibleDOM.textContent = formatoDinero(presupuesto);
}

//construyendo la lista de ingresos
function construirListaDeIngresos(){
  let codigo = '';
  listaDeIngresosArray.forEach(ingreso => {
    codigo += hacerElementoDeListaIngresos(ingreso);
  });
  listaDeIngresosDOM.innerHTML = codigo;
}

function hacerElementoDeListaIngresos(ingreso){
  let elemento = `<div class="elemento">
                    <div class="concepto">${ingreso.concepto}</div>
                    <div class="valor textoVerde">+ ${formatoDinero(ingreso.valor)}</div>
                   <button class="eliminar textoVerde" onclick="eliminarIngreso(${ingreso.idIngreso})">
                      <ion-icon name="close-circle-outline"></ion-icon>
                    </button>
                  </div>`
  return elemento;
}

function eliminarIngreso(index){
  let indiceAEliminar = listaDeIngresosArray.findIndex(ingreso => ingreso.idIngreso === index);
  listaDeIngresosArray.splice(indiceAEliminar,1);
  calculaYEnsenaParametros();
}

//construiyendo la lista de egresos
function construirListaDeEgresos(){
  let codigo = '';
  listaDeEgresosArray.forEach(egreso => {
    codigo += hacerElementoDeListaEgresos(egreso);
  });
  listaDeEgresosDOM.innerHTML = codigo;
}

function hacerElementoDeListaEgresos(egreso){
  let porcentajeEgresoLocal = (egreso.valor * 100) / egresos;

  let elemento = `<div class="elemento">
                    <div class="concepto">${egreso.concepto}</div>
                    <div class="valor textoRojo">-${formatoDinero(egreso.valor)}<div class="porcentajeEgreso">${porcentajeEgresoLocal.toFixed(2)}%</div></div>
                    <button class="eliminar textoRojo" onclick="eliminarEgreso(${egreso.idEgreso})">
                      <ion-icon name="close-circle-outline"></ion-icon>
                    </button>
                  </div>`
  return elemento;
}

function eliminarEgreso(index){
  let indiceAEliminar = listaDeEgresosArray.findIndex(egreso => egreso.idEgreso === index);
  listaDeEgresosArray.splice(indiceAEliminar,1);
  calculaYEnsenaParametros();
}

function formatoDinero(cantidad){
  let miles = parseInt( cantidad / 1000);
  let cientos = cantidad - (miles*1000);
  let dinero;
  if(miles != 0){
    dinero = ' $'+miles+','+cientos+'.00';
  }else{
    dinero = ' $'+cientos+'.00';
  }
  
  return dinero;
}
~~~

Dato.js
~~~javaScript
class Dato{
  constructor(concepto, valor){
    this._concepto = concepto;
    this._valor = valor;
  }

  get concepto(){
    return this._concepto;
  }

  set concepto(concepto){
    this.concepto = concepto;
  }

  get valor(){
    return this._valor;
  }

  set valor(valor){
    this.valor = valor;
  }
  
}
~~~

Ingreso.js
~~~javaScript
class Ingreso extends Dato{
  static contadorIngresos = 0;
  constructor(concepto, valor){
    super(concepto, valor)
    this._idIngreso = ++Ingreso.contadorIngresos;
  }

  get idIngreso(){
    return this._idIngreso;
  }
}
~~~

Egreso.js
~~~javaScript
class Egreso extends Dato{
  static contadorEgresos = 0;
  constructor(concepto, valor){
    super(concepto, valor)
    this._idEgreso = ++Egreso.contadorEgresos;
  }

  get idEgreso(){
    return this._idEgreso;
  }
}
~~~