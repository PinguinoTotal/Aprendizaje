import { Component, Input } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-vinculos',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './vinculos.component.html',
  styleUrl: './vinculos.component.css'
})
export class VinculosComponent {
@Input()
href: string = "/";
@Input()
caracter:string = "fa-solid fa-border-none";
@Input()
texto:string = "texto no encontrado";
}
