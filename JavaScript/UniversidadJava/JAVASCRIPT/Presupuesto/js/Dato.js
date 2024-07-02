class Dato{
  constructor(concepto, valor){
    this._concepto = concepto;
    this._valor = valor;
  }

  get concepto(){
    return this._concepto;
  }

  set concepto(concepto){
    this.concepto = concepto;
  }

  get valor(){
    return this._valor;
  }

  set valor(valor){
    this.valor = valor;
  }
  
}