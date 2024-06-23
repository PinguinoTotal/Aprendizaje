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

