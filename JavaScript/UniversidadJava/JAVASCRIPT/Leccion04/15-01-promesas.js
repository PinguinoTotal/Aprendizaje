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