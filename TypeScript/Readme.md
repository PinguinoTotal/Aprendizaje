# Typescript 

typescript es un seperset de javascript para se trabajando con angular

como tal no podemos corre typescript en las paginas,. si no que necesitamos un transcripto que hara que nuestro typescript pase a ser javascript, nos ponemos en la carpeta donde esta el ts y corremos el comando 
~~~
 tsc archivo.ts
~~~

para hacerlo de manera automatica se hace: 

esto solo funciona en una consola de linux
~~~
 tsc -w *.ts
~~~
transcribe, ve todos los archivos ts

para windows es:
este solo esta al pendiente de un archivo ay que windows no reconoce el *
~~~
 tsc arhivo.ts -w
~~~

activar para todos los archivos 
~~~
 tsc -w
~~~

si no puede servir tambien el 
~~~
 tsc -p ./ -w
~~~
compilar todos los archivos que estan en este path 

# Master en Javascript: Aprende JS, JQuery, Angular, NodeJS
~~~typescript
//hacer un nuevo tipo
type alfanumerico = string|number;

//tipos de datos
let cadena: string = "variable string";

let numero: number = 12;

let boleano: boolean = true;

let any: any; //cualquier valor

//datos trampa
//puede ser o string o numero
let trampa: string|number = 5;

//usando tipos de datos personalizados
let trampa2 : alfanumerico;


//arrays
var lenguajes: Array<string> = ["tengo", "que cuidar", "a mi casimerito"];

//tambien pueden ser escrito asi
var lenguajes1:string[] = ["tengo", "que cuidar", "a mi casimerito"];

//let y var son lo mismo

function getNumero(numero: number = 12):string{
    return "el numero es: " + numero;
}

//Decoradores 
//les da una funcion extra a lo que queramos
function estampar(logo: string){
    return function(target: Function){
        target.prototype.estampacion = function(): void{
            console.log("camiseta estampada con el logo de: " + logo);
        }
    }
    
}

//POO

//Clase(molde del objeto)
//se le pone export para que pueda ser importada por otro script
//export class Camiseta{
//el implements es que implementa una interface 

class Camiseta implements CamisetaBase{
    //Propidades
    private color: string;
    private modelo: string;
    private precio: number;

    constructor(color,modelo,precio){
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Metodos
    public setColor(color){
        this.color = color;
    }

    public getColor():string{
        return this.color;
    }

    public setModelo(modelo){
        this.modelo = modelo;
    }

    public getModelo():string{
        return this.modelo;
    }

    public setPrecio(precio){
        this.precio = precio;
    }

    public getPrecio():number{
        return this.precio;
    }

}

//interfaces
//es un contrato que siempre deben tener estos metodos
interface CamisetaBase{
    setColor(color);
    getColor():string;
}

class Sudadera extends Camiseta implements SudaderaBase{
    private talla:string;

    constructor(color,modelo,precio, talla){
        //con super pasamos los valores del padre
        super(color,modelo,precio);
        this.talla = talla;
    }

    setTalla(talla) {
        this.talla = talla;
    }
    getTalla(): string {
        return this.talla;
    }


}

interface SudaderaBase{
    setTalla(talla);
    getTalla():string;
}
~~~

# Master en TypeScript, JavaScript Moderno
generar el finechero de configuracion de typescript
para ver un poco más a profundidad clase 66
donde esta el proyecto se hace:
~~~
tsc -init
~~~

~~~ typescript
//tuplas
//es un array mixto por ende puede resivir cualquier dato por push 
let tuplas = ["Batman begind", true, 1990]; 

//esto es una tupla 
let pelicula:[string, boolean, number] = ["Batman begind", true, 1990];
//es un array con los elementos ya definidos previamente 


//castear una variable 
let valor_desconocido: any = 1;
let frase_final:string = <string> valor_desconocido;

//tipos de variables en funciones
// "?" significa que el parametro es opcional, si no se le pone nada es undefined
function saludo(nombre?:string):string{
    return "un saludo para " + nombre;
}

//volver variable a string 
//variable.toString();

//tipo literal
// o hacer un tipo de dato personalizado con variables

type traje = "especial" | 1 | 2 | 3 | 4 |"comprado";
//el tipo literal dice que solo "atuendo" puede ser 1 2 3 4 o cutro, peros olo eso 
function tekken(personaje:string, atuendo: traje):string{
    return `El personaje es ${personaje} y lleva el atuendo ${atuendo}`
}

//JSON 
type empresas = {
    nombre: string,
    facturacion: number
}

let empresa:empresas = {
    nombre: "algo",
    facturacion: 1
};


//clases, se le da el tipo de variable en el construcot
class Camiseta{
    //Propidades
    private color: string;
    private modelo: string;
    private precio: number;

    constructor(color:string,modelo:string,precio:number){
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
    }
    
}
~~~