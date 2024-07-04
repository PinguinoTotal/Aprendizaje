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
    .finally(() => console.log("Promesa finalizada"))

//el fetch es una peticion ajax  que devuelve promesas
let pokeapi = fetch("https://pokeapi.co/api/v2/pokemon/ditto")
    .then(response => response.json)
    .then(dito => console.log(dito));


// hacer que las peticiones sean sincronas, que necesites esperar para que se haga algo más
async function getMisInfos() {
    let misInfos = await getInfo();
    console.log(misInfos);
}


//clases con propiedades privadas
class Carro {
    //haciendo una propiedad privada
    //con el # se hace privada
    #_nPuertas = 0;
    #_modelo = "";
    #_nllantas = 0;
    //si es con _ es protegida
    _plazas = 0;
    constructor(modelo, nllantas, npuertas) {
        this.#_modelo = modelo;
        this.#_nllantas = nllantas;
        this.#_nPuertas = npuertas;
    }

    get modelo() {
        return this.#_modelo;
    }

    set modelo(modelo){
        this.#_modelo = modelo;
    }

    get nllantas(){
        return this.#_nllantas;
    }

    set nllantas(nllantas){
        this.#_nllantas = nllantas;
    }

    get nPuertas(){
        return this.#_nPuertas
    }

    set nPuertas(nPuertas){
        this.#_nPuertas = nPuertas;
    }
}

var carro = new Carro("nisan", 4,4);
console.log("el carro es: " + carro.modelo);

//sets, estructura que almacena valores unicos de cualquier tipo
//en este no puede haber valores duplicados
let gadgets = new Set(["movil", "tablet", "portatil"]);
console.log(gadgets);

//metodos de los sets
//agregar elementos
gadgets.add(12);

//tamaño del set 
gadgets.size;

//se recorre con un for in o foreach

//eliminarlos
gadgets.delete(12);

//comprobar existencia
gadgets.has("movil") //true;

//eliminar todos los elementos del set
gadgets.clear();

//maps
//estos siempre tienen clave y valor
const gadgets1 = new Map();
//en este se pueden repetir valores, pero no claves
/*
gadgets1.set(1,"PC");
gadgets1.set(2,"TV");
gadgets1.set(3,"TABLET");
gadgets1.set("cuatro","Movil");
gadgets1.set("cinco","Laptop");*/

//tambien se pueed hacer esto:
gadgets1.set(1,"PC")
        .set(2,"TV")
        .set(3,"TABLET")
        .set("cuatro","Movil")
        .set("cinco","Laptop");

//sacar una variable
console.log(gadgets.get("cinco"));

const antiguos_gadgets = {
    seis: "radiocaset",
    siete: "compact dico",
    ocho: "telefono sobremesa"
};

//volviendo un Json a un map 

const gadgets2 = new Map(Object.entries(antiguos_gadgets));

//nuevos metodos de array 

let personas = ["victror", "paco", "pepe", "juan", "antonio"];

//find 
let busqueda = personas.find((persona) => persona === "pepe"); //regresa pepe

//find index
let busqueda1 = personas.findIndex(persona => persona === "juan"); //regresa el indice 
//de donde encontro a juan 

//crear array basandome en un obejto iterable 
let array_leytras = Array.from("ahsjdlasjdlas");
console.log(array_leytras)// a , h, s, j, ...

//comprobar su existe un elemento dentro de un array 
console.log(persona.includes("paco")); //true

//filtarr array 
let nuevas_personas = personas.filter(persona => persona.includes("a"));
//solo guarda los nombre que tienen una a en el nombre 

//objetos literales
let titulo = "el señor de los anillos";
let genero = "accion";
let duracion = "2 horas";


//esto e sun JSON 
const pelicula = {
    titulo,
    genero,
    duracion,
    [genero+"2022"]: "hola",
    //ahora se pueden hacer asi las funciones 
    mostrar(){
        return this.titulo + " " + this.genero;
    }
};

Object.values(pelicula) //regresa un array con los valores que tiene el JSOn

//novedades Ecmascript

//Nullish ??
function multiplicacion(numero1, numero2){
    //numero1 existe o es diferente de null? si si, dale el valor de numero1, si no es 1 
    numero1 = numero1 ?? 1;
    //numero2 existe o es diferente de null? si si, dale el valor de numero2, si no es 1 
    numero2 = numero2 ?? 1;

    return numero1 * numero2
}

function mostrarUsuario(id, nombre){
    // si (id+" "+nombre) existe o es diferente de null? si si
    // dale el valor de (id+" "+nombre) , si no es "usuario desconocido"
    let mi_usuario = (id+" "+nombre) ?? "usuario desconocido";
    return mi_usuario;
}

//separadores numericos 
let numero4 = 4_000_000_000; //esto sigue siendo un numero 
//pero se lee mejor 

//replace replace all
let frase = "voy en mi moto contentento por la carreterea y veo otra moto";
//esto solo remplaza la priemra vez que se encuentra la palabra moto
let nueva_frase = frase.replace("moto", "coche");
//esto remplaza todo
let nueva_frase1 = frase.replaceAll("moto", "coche");

//asignadores logicos 
let nombre5 = "pedro";
let id = 80;

nombre5 ||= id;
//si nombre5 no vale nada, entonces nombre5 se cargara con el valord e ir;
//si let nombre5;
//y nombre ||= id;
//entonces nombre5 = id;
console.log(nombre5);