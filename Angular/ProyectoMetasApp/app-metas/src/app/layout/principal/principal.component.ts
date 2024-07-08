import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { VinculosComponent } from '../../design/vinculos/vinculos.component';

@Component({
  selector: 'app-principal',
  standalone: true,
  imports: [RouterOutlet, VinculosComponent, RouterLink],
  templateUrl: './principal.component.html',
  styleUrl: './principal.component.css'
})
export class PrincipalComponent {

}
