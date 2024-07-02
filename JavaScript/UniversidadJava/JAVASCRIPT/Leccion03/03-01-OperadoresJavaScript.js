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