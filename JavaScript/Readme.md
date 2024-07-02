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

miFuncion(...frutilla);
//así el valor de fruta1 es manzana y fruta 2 es pera

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
