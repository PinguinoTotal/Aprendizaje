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