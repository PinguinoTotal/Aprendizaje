import { Component } from '@angular/core';
import { CalcularPromedioSalarioComponent } from '../calcular-promedio-salario/calcular-promedio-salario.component';
import { CambiarColorDirective } from '../ditrctives/cambiar-color.directive';

@Component({
  selector: 'app-hola-componente',
  standalone: true,
  imports: [CalcularPromedioSalarioComponent,CambiarColorDirective],
  templateUrl: './hola-componente.component.html',
  styleUrl: './hola-componente.component.scss'
})
export class HolaComponenteComponent {
  edad = 17;
  cantidadPasosDeMouse = 0;
  cantidadDeEjecuciones = 0;
  listaSalarios = [213123,324235423,324231432,1324432];
  promedioSalarios = 0;
  cursos = [
    {vide: 58, name: "React", id: 0},
    {vide: 52, name: "Angular", id: 1},
    {vide: 60, name: "Python", id: 2}
  ];

  //asi se hacen las funciones 
  accionBtn():void{
    this.cantidadDeEjecuciones += 1;
    console.log("he sido ejecuado");
    console.log(this.cantidadDeEjecuciones);
  }

  aumentarPasos(): void{
    this.cantidadPasosDeMouse += 1;
    console.log(this.cantidadPasosDeMouse);
    console.log("han pasado sobre mi");
  }

  recivirPromedio(valorPromediado:number): void{
    this.promedioSalarios = valorPromediado;
  }
}
