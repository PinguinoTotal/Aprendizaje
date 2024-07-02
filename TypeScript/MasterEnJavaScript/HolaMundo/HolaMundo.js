var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//tipos de datos
var cadena = "variable string";
var numero = 12;
var boleano = true;
var any; //cualquier valor
//datos trampa
//puede ser o string o numero
var trampa = 5;
//usando tipos de datos personalizados
var trampa2;
//arrays
var lenguajes = ["tengo", "que cuidar", "a mi casimerito"];
//let y var son lo mismo
function getNumero(numero) {
    if (numero === void 0) { numero = 12; }
    return "el numero es: " + numero;
}
//Decoradores 
//les da una funcion extra a lo que queramos
function estampar(logo) {
    return function (target) {
        target.prototype.estampacion = function () {
            console.log("camiseta estampada con el logo de: " + logo);
        };
    };
}
//POO
//Clase(molde del objeto)
//se le pone export para que pueda ser importada por otro script
//export class Camiseta{
//el implements es que implementa una interface 
var Camiseta = /** @class */ (function () {
    function Camiseta(color, modelo, precio) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
    }
    //Metodos
    Camiseta.prototype.setColor = function (color) {
        this.color = color;
    };
    Camiseta.prototype.getColor = function () {
        return this.color;
    };
    Camiseta.prototype.setModelo = function (modelo) {
        this.modelo = modelo;
    };
    Camiseta.prototype.getModelo = function () {
        return this.modelo;
    };
    Camiseta.prototype.setPrecio = function (precio) {
        this.precio = precio;
    };
    Camiseta.prototype.getPrecio = function () {
        return this.precio;
    };
    return Camiseta;
}());
var Sudadera = /** @class */ (function (_super) {
    __extends(Sudadera, _super);
    function Sudadera(color, modelo, precio, talla) {
        //con super pasamos los valores del padre
        var _this = _super.call(this, color, modelo, precio) || this;
        _this.talla = talla;
        return _this;
    }
    Sudadera.prototype.setTalla = function (talla) {
        this.talla = talla;
    };
    Sudadera.prototype.getTalla = function () {
        return this.talla;
    };
    return Sudadera;
}(Camiseta));
