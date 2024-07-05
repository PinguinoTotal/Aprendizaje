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