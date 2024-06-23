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