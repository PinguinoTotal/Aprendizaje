import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-vinculos',
  standalone: true,
  imports: [],
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
