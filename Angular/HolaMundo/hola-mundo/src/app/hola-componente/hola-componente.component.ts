import { Component } from '@angular/core';

@Component({
  selector: 'app-hola-componente',
  standalone: true,
  imports: [],
  templateUrl: './hola-componente.component.html',
  styleUrl: './hola-componente.component.scss'
})
export class HolaComponenteComponent {
  edad = 17;
}
