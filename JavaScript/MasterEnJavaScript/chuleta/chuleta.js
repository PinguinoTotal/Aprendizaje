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
