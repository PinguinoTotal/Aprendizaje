//DOM

//evento load (se ejecuta despues de que todo el dom ha sido cargado)

//esto se pone cuando los scripts son cargados en la parte superior del html
window.addEventListener("load", () => { });

//obteniendo la referencia de los objetos por id
var mi_caja = document.getElementById("mi_caja");
//esto seria lo mejor, ya que por clase se deben dar el css

//obteniendo refrencia por clase
var cajitas = document.getElementsByClassName("cajita");

//obteniendo la referencia por etiqueta
var misCajas = document.getElementsByTagName("div");
//esto nos da un array de elementos misCajas[0]

//tomando la caja por querySelector (más elegante)
//se toman como si fueran css
var caja = document.querySelector("#mi_caja");

//tomando la clase caja con querySelector
var cajita = document.querySelectorAll(".cajita");

//crear elementos del dom
var seccion = document.createElement("section");
var parrafo = document.createElement("p");
//var texto = document.createTextNode();//"creando una caja de texto";

//añadiendo el texto en el parrafo
parrafo.append(texto);
seccion.append(parrafo);

mi_caja.innerHTML = "Poner texto desde javascript";
//cambiar estilos desde javascript
mi_caja.style.background = "red";
mi_caja.style.padding = "20px";
mi_caja.style.color = "white";

//agregandole una clase a mi componente caja
mi_caja.className = "hola";

//BOM Browser Object Model

//saber el alto de la ventana
console.log(window.innerHeight);

//saber el ancho de la ventana
console.log(window.innerWidth);

//saber el ancho de la pantalla
console.log(screen.width);

//saber el alto d ela pantalla
console.log(screen.height);

function cambiarColor() {
    alert("se ha cambiado de color, no es cierto");
}

//Eventos
var miBoton = document.querySelector("#miBoton");

miBoton.addEventListener("click", function () {
    cambiarColor();
});

//mouse over ('mouseover')
//mouse out ('mouseout')

var formularioNombre = document.querySelector("#campo_nombre");

//focus ('focus') ("hacer foco en el input, osease seleccionar el input")
//blur ('blur') es salir de el input
//Keydown ('heydown')
//keypress ('keypress')
//keyup ('keyup')

//Temporizadores

var tiempo = setInterval(function () {
    console.log("set interval ejecutado");
}, 3000); //se imprime set interval ejecutado cada 3000 ms

//iniciar el timer
//pues llamar a la funcion que da el set intervalk como variable, se puede hacer un return de esta variable

//parando los timers
clearInterval(tiempo);

//JSON

//esto e sun objeto json
var pelicula = {
    titulo: "Batman vs Superman",
    year: 2017,
    pais: "Estados Unidos",
};

//usando las variables de un json
pelicula.titulo = "Superman Begins";

//array de JSONs
var peliculas = [
    { titulo: "amar te duele", year: 2016, pais: "Francia" },
    pelicula,
];

console.log(peliculas);

//Local Storage (memoria del navegador)
//guardar informacion en html

//saber si tenemos local storage

if (typeof Storage != "undefined") {
    console.log("localStorage disponible");
} else {
    console.log("incompatibilidad con LocalStorage");
}

//Guardar datos
//(key, valor)
localStorage.setItem("titulo", "curso de Symfony de Victor Robles");

//recuperar elemento
localStorage.getItem("titulo");

//guardar objetos
var usuario = {
    nombre: "victor",
    email: "victor@victor.com",
    web: "victor.es",
};

//para hacer la conexion con el local storage y las peticiones debe ser un string
//los objetos json por eso debemos usar JSON.stringify

localStorage.setItem("usuario", JSON.stringify(usuario));

//recuperar objeto
//tambien deben ser convertidos de string (que es como llega)
//a Json usando el JSON.parse
var userjs = JSON.parse(localStorage.getItem("usuario"));

//eliminar cosas de local storage
localStorage.removeItem("usuario");

//eliminar todo el local storage
localStorage.clear();

//peticiones fetch y ajax

//fetch es para hacer peticiones ajax a un back
//usamos apiPlaceHolder

//tambien podemos usar data.josn() para pasar el objeto data a json

var div_usuarios = document.querySelector("#fetcher");
var div_jannet = document.querySelector("#jannet");

var usuarios = [];

//esto es para minimizar el callback hell encadenando promesas
getUsuarios()
    .then((data) => data.json())
    .then((users) => {
        listadoUsuarios(users.data);

        return getJannet(); //como es fetch podemos seguir encadenando thens
    })
    .then(data => data.json())
    .then(user => {
        mostrarJannet(user.data);

        return getInfo();
    })
    .then(data => {
        console.log(data);
    })
    //capturtando errores en las promesas
    .catch(error => {
        console.log(error);
    });

function getUsuarios() {
    //hacemos la promesa
    // el metodo fetch devuelbe promesas
    return fetch("https://reqres.in/api/users?page=2")
}

function getJannet() {
    //hacemos la promesa
    // el metodo fetch devuelbe promesas
    return fetch("https://reqres.in/api/users/2")
}

//creando una promesa propia
function getInfo(){
    var profesor = {
        nombre: "victor",
        apellido: "Robles",
        url: "victor es"
    };

    return new Promise((resolve, reject) => {
        var profesor_string = JSON.stringify(profesor);

        //podemos hacer que la promesa tarde unos segundos con setTimeOut

        //obtenemos un error 
        if(typeof profesor_string != 'string') return reject('error');

        //si no tenbemos erroes regresamos la promesa 
        return resolve(profesor_string);
    });
}

function listadoUsuarios(usuarios) {
    usuarios.map((user, i) => {
        let nombre = document.createElement("h3");

        nombre.innerHTML = `${i} ${user.first_name} ${user.last_name}`;
        
        div_usuarios.appendChild(nombre);
    });
}

function mostrarJannet(user) {
    console.log(user);
    let nombre = document.createElement("h3");

    nombre.innerHTML = `${user.first_name} ${user.last_name}`;

    div_jannet.appendChild(nombre);

}
//capturando cualquier error 

try {
    var year = 2019;
    alert(yea);    
} catch (error) {
    console.log("ha ocurrido un error " + error)
}

//fechas, matematicas y más
var fecha = new Date();

var year = fecha.getFullYear();
var mes = fecha.getMonth(); //el mes 0 es enero
var dia = fecha.getDay();
var hora = fecha.getHours();
