class Egreso extends Dato{
  static contadorEgresos = 0;
  constructor(concepto, valor){
    super(concepto, valor)
    this._idEgreso = ++Egreso.contadorEgresos;
  }

  get idEgreso(){
    return this._idEgreso;
  }
}