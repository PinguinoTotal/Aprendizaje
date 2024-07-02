class Producto{
  static contadorProductos = 0;
  constructor(nombre, precio){
    this._idProducto = ++Producto.contadorProductos;
    this._nombre = nombre;
    this._precio = precio;
  }

  get idProducto(){
    return this._idProducto;
  }

  get nombre(){
    return this._nombre;
  }

  set nombre(nombre){
    this._nombre = nombre;
  }

  get precio(){
    return this._precio;
  }

  set precio(precio){
    this._precio = precio;
  }

  toString(){
    return "idProducto: " + this._idProducto + " nombre: " + this._nombre + " precio: " + this._precio;
  }
}

class Orden{
  static contadorOrdenes = 0;
  constructor(){
    this._idOrden = ++Orden.contadorOrdenes;
    this._productos = [];
  }

  static get MAX_PRODUCTOS(){
    return 5;
  }

  agregarProductos(producto){
    if(this._productos.length < Orden.MAX_PRODUCTOS){
      this._productos.push(producto);
    }else{
      console.log("la orden a superado el numero maximo de productos");
    }
  }

  calcularTotal(){
    if(this._productos != 0){
      let total = 0;
      for (let i = 0; i < this._productos.length; i++) {
        total += this._productos[i].precio;
      }
      return "el total de la orden es: " + total;
    }else{
      console.log("la orden no tiene productos");
    }
  }

  toString(){
    return "idOrden " + this._idOrden+ " productos: " + this._productos;
  }
}

let orden1 = new Orden();

let producto1 = new Producto("chicles", 2);
console.log(producto1);
let producto2 = new Producto("mouse", 500);
console.log(producto2);
let producto3 = new Producto("rancheritos", 1441);
console.log(producto3);

orden1.agregarProductos(producto1);
orden1.agregarProductos(producto2);
orden1.agregarProductos(producto3);

console.log(orden1);

console.log(orden1.calcularTotal());

