//haciendo un objeto
let persona = {
  nombre: 'Juan',
  apellido: 'Perez',
  email: 'Jperez@mail.com',
  edad: 28,
  idioma: 'es',

  //agregar metodos a los objetos
  nombreCompleto: function(){
    //se puede usar this como en las clases de 
    //java 
    return this.nombre + " " + this.apellido;
  },

  get miFuncion(){
    return "otra funcion";
  }, 

  get lang(){
    return this.idioma.toUpperCase();
  },

  set lang(lang){
    this.idioma = lang.toUpperCase();
  }
};

//accediendo a los parametros del objeto
console.log(persona.nombre);
//llamando a la funcion que tenemos en el objeto
console.log(persona.nombreCompleto());

//tambien se puede acceder a las propiedades asi:
console.log(persona['apellido']);

//ciclo for in 
for (proipiedad in persona) {
  //en el ciclo for in obtenemos las claves de los objetos
  console.log(proipiedad);   
  console.log(persona[proipiedad])
}

//agregando nuevas propiedades dinamicamente
persona.tel = 462862;

//eliminando propiedades
delete persona.email;

//volvemos nuestro objeto a un array 
let personaArray = Object.values(persona);
console.log(personaArray)

//metodo get de un objeto 
//ya no es necesario poner ()
console.log(persona.miFuncion)

console.log(persona.lang)

//usando una funcion set
//aunque no se llame como funcion, se esta llamando
//internamente un set que tiene el objeto 
persona.lang ='en';

//otra manera de hacer objetos
let persona2 = new Object();
persona2.nombre = "carlos";
persona2.direccion = "saturno15";
persona2.tel = 46551652;

//funcion constructor
function Persona(nombre, apellido, email){
  //constructor de objetos de tipo persona 
  this.nombre = nombre;
  this.apellido = apellido;
  this.email = email;
  //agregando metodos
  this.nombreCompleto = function(){
    return this.nombre + " " + this.apellido;
  }
}

//usando prototipe para poner parametros dinamicamente
// y ahora ya podemos usar tel
Persona.prototype.tel = '415215354';

//creando objetos que son echos con el constructor, cuando
//ponemos new le damos un nuevo espacio en memoria 
//asi que se crean 
let padre= new Persona('Juan', 'Perez', 'Jperez@mial.com');
padre.tel = '45421385';
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona('Lupe', 'Escupe', 'Elupe@mail.com');
console.log(madre);
console.log(madre.nombreCompleto());

padre.nombre = "Jose";
console.log(padre);


//distintas formas de crear objetos ne JavaScript
let miObjeyto = new Object();
let miObjeto2 = {};

let persona3 = {
  nombre: 'Juan',
  apellido: 'Perez',

  nombreCompleto: function(){
    return this.nombre + " " + this.apellido;
  },

  nombreCompleto2: function(titulo, tel){
    return titulo+ ' ' + this.nombre + ' ' + this.apellido + ' ' + tel;
  }
}

let persona4 = {
  nombre: 'Carlos',
  apellido: 'Lara',
}

//uso del metodo nombre completo que esta en persona 3
//con la persona 4 para que ponga todo el nombre 
console.log(persona3.nombreCompleto.call(persona4));
//con call pasamos parametros a objetos que implementan
//un metodo que no implementa el objeto que trenemos pero funciona 

//usando call, pero con más parametros que le podemos pasar
console.log(persona3.nombreCompleto2.call(persona3, 'Ingeniero', 465182));


//el metodo apply es muy similar a call
//solo que al pasar los otros parametros, se pasan por array
let arreglo = ['Ing', '54132854'];
console.log(persona3.nombreCompleto2.apply(persona4, arreglo));