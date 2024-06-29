import { Component, EventEmitter, Input, OnInit, Output, output } from '@angular/core';

@Component({
  selector: 'app-calcular-promedio-salario',
  standalone: true,
  imports: [],
  templateUrl: './calcular-promedio-salario.component.html',
  styleUrl: './calcular-promedio-salario.component.scss'
})
export class CalcularPromedioSalarioComponent{
  //decimos que lo que viene son inputs
  @Input()
  //salarios! = es necesaria esta informacion
  //salarios? = es opcional esta informacion
  // o salarios : number [] = [] valor vacio
  salarios: number [] = [];
  promedio = 0;

  //el onInit al ser implementado debemos ponerlo en algun lugar
  //y esto hace que lo que haya dentro de este se ejecute inmediatamente 
  //despues de que se crea este elemento
  /*ngOnInit(): void {
      this.calcularPromedio();
  }*/

  //indicamos que voy a tener una salida
  @Output()
  promedioSalario = new EventEmitter<number>();


  calcularPromedio(){
    this.promedio = this.salarios.reduce((suma,salario) => suma+salario)/this.salarios.length
    this.promedioSalario.emit(this.promedio);
  }
}
