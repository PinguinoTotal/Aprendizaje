//arrays
//asi se hacia antes 
//let autos = new Array('BMW, Mercedes');
let autos = ['BRMW', 'Merceedes', 'ASKD'];

//agregando cosas a el array, hasta el final
autos.push("audi");

//tambien se puede agregar asi un nuevo valor
autos[autos.length] = "carro";

//saber si es un arreglo
Array.isArray(autos);

autos instanceof Array;