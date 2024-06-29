import { Component, inject } from '@angular/core';
import { CursosService } from '../services/cursos.service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-servicios',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './servicios.component.html',
  styleUrl: './servicios.component.css'
})
export class ServiciosComponent {
  //inyectando la dependencia esto tambien se puede hacer en el constructor
  /*
  servicioCursos = inject(CursosService)
  */

  almacenarCursos!: string[];
  referenciaAlServicio!: CursosService;
  cursoId:number = 0;

  //inyectando la dependencia desde el contsructor
  constructor(private servicioCursos: CursosService){
    this.almacenarCursos = this.servicioCursos.getCursos();
    this.referenciaAlServicio = servicioCursos;
  }
}
