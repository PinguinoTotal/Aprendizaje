'use strict';

class DispositivoEntrada{
  constructor(tipoEntrada, marca){
    this._tipoEntrada = tipoEntrada;
    this._marca = marca;
  }

  get tipoEntrada(){
    return this._tipoEntrada;
  }

  set tipoEntrada(tipoEntrada){
    return this._tipoEntrada = tipoEntrada;
  }

  get marca(){
    return this._marca;
  }

  set marca(marca){
    return this._marca = marca;
  }

  toString(){
    return "tipoEntrada: " + this._tipoEntrada + " marca: " + this._marca;
  }
}

class Raton extends DispositivoEntrada{
  static contadorRatones = 0;
  constructor(tipoEntrada, marca){
    super(tipoEntrada, marca);
    this.idRaton = ++Raton.contadorRatones;
  }

  toString(){
    return super.toString + " idRaton: " + this._idRaton;
  }
}

class Teclado extends DispositivoEntrada{
  static contadorTeclados = 0;
  constructor(tipoEntrada, marca){
    super(tipoEntrada, marca);
    this.idTeclado = ++Teclado.contadorTeclados;
  }

  toString(){
    return super.toString + " idTeclado: " + this._idTeclado;
  }
}

class Monitor{
  static contadorMonitores = 0;
  constructor(marca, tamano){
    this._marca = marca;
    this._tamano = tamano;
    this._idMonitor = ++Monitor.contadorMonitores;
  }

  get idMonitor(){
    return this._idMonitor;
  }

  get marca(){
    return this._marca;
  }

  set marca(marca){
    this._marca = marca;
  }

  get tamano(){
    return this._tamano;
  }

  set tamano(tamano){
    this._tamano = tamano;
  }

  toString(){
    return "idMonitor: " + this._idMonitor + " marca: " + this._marca + " tamaño: " + this._tamano;
  }
}

class Computadora{
  static contadorComputadoras = 0;
  constructor(nombre, monitor, teclado, raton){
    this._nombre = nombre;
    this._monitor = monitor;
    this._teclado = teclado;
    this._raton = raton;
    this._idComputadora = ++Computadora.contadorComputadoras;
  }

  get idComputadora(){
    return this._idComputadora;
  } 

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get monitor(){
    return this._monitor;
  }

  set monitor(monitor){
    this._monitor = monitor;
  }

  get teclado(){
    return this._teclado;
  }

  set teclado(teclado){
    this._teclado = teclado;
  }

  get raton(){
    return this._raton;
  }

  set raton(raton){
    this._raton = raton;
  }

  toString(){
    return "idComputadora: " +this.idComputadora
    + " nombre: "+this._nombre
    + " monitor: "+this._monitor
    + " teclado: "+this._teclado
    + " raton: "+this._raton; 
  }
}

class Orden{
  static contadorOrdenes = 0;
  constructor(){
    this._idOrden = ++Orden.contadorOrdenes;
    this._computadoras = [];
  }

  agregarComputadora(computadora){
    this._computadoras.push(computadora);
  }

  mostraOrden(){
    this._computadoras.forEach(computadora => {
      console.log(computadora);
    });
  }

  get idOrden(){
    return this._idOrden;
  }

  get computadoras(){
    return this._computadoras;
  }

  set computadoras(computadoras){
    this._computadoras = computadoras;
  }

  toString(){
    return "idOrden: " + this._idOrden + " computadoras: " + this._computadoras;
  }
}

let raton1 = new Raton("raton", "marcanius");
console.log(raton1);
let raton2 = new Raton("raton", "Razer");
console.log(raton2);

let teclado1 = new Teclado("teclado", "marcanius");
console.log(teclado1);
let teclado2 = new Teclado("teclado", "Razer");
console.log(teclado2);

let monitor1 = new Monitor("marcanius", "3 pulgadas");
console.log(monitor1);
let monitor2 = new Monitor("razer", "20 pulgadas");
console.log(monitor2);

let computadora1 = new Computadora("computadora1", monitor1, teclado1, raton1);
let computadora2 = new Computadora("computadora2", monitor1, teclado1, raton2);
let computadora3 = new Computadora("computadora3", monitor1, teclado2, raton1);
let computadora4 = new Computadora("computadora4", monitor1, teclado2, raton2);
let computadora5 = new Computadora("computadora5", monitor2, teclado1, raton1);
let computadora6 = new Computadora("computadora6", monitor2, teclado1, raton2);
let computadora7 = new Computadora("computadora7", monitor2, teclado2, raton1);
let computadora8 = new Computadora("computadora8", monitor2, teclado2, raton2);

let orden = new Orden();

orden.agregarComputadora(computadora1);
orden.agregarComputadora(computadora2);
orden.agregarComputadora(computadora3);
orden.agregarComputadora(computadora4);
orden.agregarComputadora(computadora5);
orden.agregarComputadora(computadora6);
orden.agregarComputadora(computadora7);
orden.agregarComputadora(computadora8);

orden.mostraOrden();