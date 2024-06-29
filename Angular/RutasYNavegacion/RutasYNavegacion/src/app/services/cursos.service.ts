import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})


export class CursosService {

  constructor() { }

  cursos = ['Angular', 'Flutter', 'React']

  getCursos(): string[]{
    return this.cursos;
  }

  getCursosPorId(id : number = 0){
    return this.cursos[id];
  }
}
