alert("Hola como estas");

//variables
let miVariable = "Hola";

//haciendo constantes
const altura = 175;

//concatenacion 
let concatenacion = miVariable + " " + altura;

let container_box = document.querySelector("#container");

container_box.innerHTML = `
<h1>Hola soy la caja de datos</h1>
<h2>Mi altura es: ${altura}</h2>`;

//condicionales if

if (altura <= 185) {
    console.log("eres una persona bajita");
}else{
    console.log("eres una persona alta");
}

//bucles
for (let index = 0; index < 200; index++) {
    console.log(index); 
}

//arrays
let nombre = ["victor", "pepe", "armando"];

//añadiendo 
nombre.push("martin");

nombre.forEach(nom => {
    console.log(nom);
});

//Funciones 
const miInformacion = (nombre, altura) =>{
    let misDatos = `
    <h1>Soy la caja de datos</h1>
    <h2>Mi nombre es: ${nombre}</h2>
    <h3>Mi altura es: ${altura}</h3>
    `

    return misDatos;
}

let caja2 = document.querySelector("#caja2");
caja2.innerHTML = miInformacion("ramon", 175);

//mostrar por consola
console.log(miVariable);
console.log(concatenacion);