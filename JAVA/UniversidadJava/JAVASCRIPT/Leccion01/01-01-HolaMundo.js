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