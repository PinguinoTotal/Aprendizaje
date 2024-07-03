//eccma script, estandar de programacion para javascript, se van adicionando cosas

//let, var y const siguen siendo los mismos, las let hacen un ahorro de memoria 

//eliminar un elemento de los JSON 
pelicula = {
    nombre: "amar te duele",
    anio: 2019
};

//elimina la propiedad del objeto json
delete pelicula.anio;

//buscar si hay una propiedad en el json 
console.log("anio" in pelicula); //true

//tambien es posible accesar a los valores de los Json con 
pelicula["anio"];

//for en jsons
for (let propiedad in pelicula) {
    //tambien es posible accesar a los valores de los Json con 
    console.log(pelicula[propiedad]);
}

//checar que un atributo dentro de un Json no sea una funcion 
//typeof(dato_actual) !== "funcrion"

//tipo de dato Symbol
let animal = Symbol("tigre");
let animal2 = Symbol("tigre");

console.log(animal == animal2)
//false, mo son lo mismo, porque symbol
//hace que este sea unico 

//operador ternario
let persona = ["victor robles", 70];

let edad = (persona[1] >= 18) ? "es mayor de edad" : "es menor de edad";

//Diferebncia entre == y === y != y !==

//== evalua el contenido "80" y 80 == iguales
//== evalua el contenido y el tipo de dato "80" y 80 === diferentes 
//lo mismo con != y !==


//bucles
let nombres = ["pedro", "pablo", "ramses"];

//for of
for (const nombre of nombres) {
    console.log(nombre);
}

//for in (por lo general se usa en JSONs)
for (const indice in nombres) {
    console.log(nombres[indice]);
}

//for each
nombres.forEach((nombre, indice) => {
    console.log(nombre, indice);
});

//iterables
const mi_iterable = nombres[Symbol.iterator]();
console.log(mi_iterable.next()); //avanzar en el array 

//funciones flecha

let multiplicacion = (numero1, numero2) => numero1 * numero2;
//dentro de los JSON no se pueden usar el this en las funciones flechas

//desestructuracion 
let frutas = ["manzana", "pera", "naranja", "sandia"];

/*
let manzana = frutas[0];
let pera = frutas[1];
*/

//si ponemos let [manzana, pera, sandia] = frutas;
//tendremos problemas porque sandia sera igual a naranja
//console.log(sandia)  naranja

let [manzana, pera, naranja, sandia] = frutas;
console.log(manzana) //manzana y asi

//desestructurar objetos

let persona1 = {
    nombre: "Victor",
    edad: 80,
    altura: 190,
    pais: "España"
};

//si aqui hacempos 
//let {nombre,edad1,pais} = persona1;
//console.log(pais) españa
//porque como tiene la misma etiqueta y como es un JSON puede detectarlo
let { nombre, edad1, altura, pais } = persona1;
console.log(nombre) //victor

//utilidad parametros funciones
function mostrarUsurio({ nombre, apellido = "desconocido", ciudad = "barcelona" }) {
    console.log(nombre, apellido, ciudad);
}

//asi "saltamos" los parametros de las funciones 
mostrarUsurio({ nombre: "victor", ciudad: "Valencia" });


//promesas
function getInfo() {
    var profesor = {
        nombre: "victor",
        apellido: "Robles",
        url: "victor es"
    };

    return new Promise((resolve, reject) => {
        var profesor_string = JSON.stringify(profesor);

        //podemos hacer que la promesa tarde unos segundos con setTimeOut
        setTimeout(() => {
            //obtenemos un error 
            if (typeof profesor_string != 'string') return reject('error');

            //si no tenbemos erroes regresamos la promesa 
            return resolve(profesor_string);
        }, 3500);

    });
}

getInfo()
//las promesas usan thens
.then(items => console.log(items))
//catch es para intentar capturar los errores de las promesas
.catch(error => console.error(error.message))
//finali siemrpe se utiliza al final de una promesa, lo ultimo que hace 
.finally(()=> console.log("Promesa finalizada"))

//el fetch es una peticion ajax  que devuelve promesas
let pokeapi = fetch("https://pokeapi.co/api/v2/pokemon/ditto")
.then(response => response.json)
.then(dito => console.log(dito));


// hacer que las peticiones sean sincronas, que necesites esperar para que se haga algo más
async function getMisInfos(){
    let misInfos = await getInfo();
    console.log(misInfos);
}
