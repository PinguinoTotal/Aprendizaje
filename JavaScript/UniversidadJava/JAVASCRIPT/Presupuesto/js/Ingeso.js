class Ingreso extends Dato{
  static contadorIngresos = 0;
  constructor(concepto, valor){
    super(concepto, valor)
    this._idIngreso = ++Ingreso.contadorIngresos;
  }

  get idIngreso(){
    return this._idIngreso;
  }
}