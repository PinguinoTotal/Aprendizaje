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