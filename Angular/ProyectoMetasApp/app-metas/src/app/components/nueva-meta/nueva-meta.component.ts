import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-nueva-meta',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './nueva-meta.component.html',
  styleUrl: './nueva-meta.component.css'
})
export class NuevaMetaComponent {
  formularioMeta = new FormGroup(
    {
    id: new FormControl(),
    detalles: new FormControl(),
    periodo: new FormControl(),
    eventos: new FormControl(),
    icono: new FormControl(),
    meta: new FormControl(),
    plazo: new FormControl(),
    completado: new FormControl(),
})


}
