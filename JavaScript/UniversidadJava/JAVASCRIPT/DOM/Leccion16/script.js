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