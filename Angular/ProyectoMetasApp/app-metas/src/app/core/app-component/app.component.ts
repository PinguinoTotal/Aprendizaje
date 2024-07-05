import { Component } from '@angular/core';
import { EncabezamientoComponent } from '../../layout/encabezamiento/encabezamiento.component';
import { PieComponent } from '../../layout/pie/pie.component';
import { PrincipalComponent } from '../../layout/principal/principal.component';

@Component({
  selector: 'app-root',
  standalone: true,
  //importando los componentes para usarlos
  imports: [EncabezamientoComponent, PieComponent, PrincipalComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'app-metas';
}
