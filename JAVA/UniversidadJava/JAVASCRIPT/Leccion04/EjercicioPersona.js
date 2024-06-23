//todo lo ponemos en el mismo archivo, pero se puede hacer en archivos separados, pero 
//como no tenemos servidor,esto aun no es posible 
class Persona{
  static contadorPersonas = 0;

  constructor(nombre, apellido, edad){
    this._nombre = nombre;
    this._apellido = apellido;
    this._edad = edad;
    this._idPersona = ++Persona.contadorPersonas;
  }

  get idPersona(){
    return this._idPersona;
  }

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get apellido(){
    return this._apellido;
  }

  set apellido(apellido){
    this._apellido = apellido;
  }

  get edad(){
    return this._edad;
  }

  set edad(edad){
    this._edad = edad;
  }

  toString(){
     return "idPersona: " + this._idPersona + " nombre: " + this._nombre + " apellido: " + this._apellido + " edad: " + this._edad;
  }
}

class Empleado extends Persona{
  static contadorEmpleados = 0;
  constructor(nombre, apellido, edad,sueldo){
    super(nombre, apellido, edad);
    this._sueldo = sueldo;
    this._idEmpleado = ++Empleado.contadorEmpleados;
  }

  get idEmpleado(){
    return this._idEmpleado;
  }

  get sueldo(){
    return this.sueldo;
  }

  set sueldo(sueldo){
    this._sueldo =sueldo;
  }

  toString(){
    return super.toString() + " idEmpleado: " + this._idEmpleado + " sueldo: " + this._sueldo;
  }
}

class Cliente extends Persona{
  static contadorClientes = 0;

  constructor(nombre, apellido, edad,fechaDeRegistro){
    super(nombre, apellido, edad);
    this._fechaDeRegistro = fechaDeRegistro;
    this._idCliente = ++Cliente.contadorClientes;
  }

  get idCliente(){
    return this._idCliente
  }

  get fechaDeRegistro(){
    return this._fechaDeRegistro
  }

  set fechaDeRegistro(fechaDeRegistro){
    this._fechaDeRegistro = fechaDeRegistro;
  }

  toString(){
    return super.toString() + " idCliente: " + this._idCliente + " fechaDeRegistro: " + this._fechaDeRegistro;
  }
}

let persona1 = new Persona("Ramiro","Perez",22);
console.log(persona1);

let empleado1 = new Empleado("Chucho", "Ramirez",22, 500);
console.log(empleado1);

let cliente1 = new Cliente("Johana", "Todd", 23, new Date());
console.log(cliente1);