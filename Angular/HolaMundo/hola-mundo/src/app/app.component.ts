import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HolaComponenteComponent } from './hola-componente/hola-componente.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HolaComponenteComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'hola-mundo';
  nombre = "Daniel";
  
}
