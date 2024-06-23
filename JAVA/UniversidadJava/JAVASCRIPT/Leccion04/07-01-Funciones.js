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