import { Injectable } from '@angular/core';
import { Metas } from '../models/metas';

@Injectable({
  providedIn: 'root'
})
export class EditMetaServiceService {
  
  metaAEditar?: Metas = undefined;
  constructor() { }

  public setMetaAEditar(meta:Metas){
    this.metaAEditar = meta
  }

  public isMetaAEditarAvailable():boolean{
    return this.metaAEditar==undefined? false : true;
  }

  public getMetaAEditar(){
    return this.metaAEditar;
  }

  public clearMetaAEditar(){
    this.metaAEditar = undefined;
  }
}
