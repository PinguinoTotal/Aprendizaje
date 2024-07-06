import { Component } from '@angular/core';
import { MetasComponent } from '../../design/metas/metas.component';

@Component({
  selector: 'app-listar-metas',
  standalone: true,
  imports: [MetasComponent],
  templateUrl: './listar-metas.component.html',
  styleUrl: './listar-metas.component.css'
})
export class ListarMetasComponent {
  meta = {
    "id":"2",
    "detalles": "Backend",
    "periodo": "año",
    "eventos": 6,
    "icono": "📚",
    "meta": 12,
    "plazo": "2030-01-01",
    "completado":0,
  }
}
