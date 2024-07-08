import { Component, inject, OnChanges, SimpleChanges } from '@angular/core';
import { NuevaMetaComponent } from '../nueva-meta/nueva-meta.component';
import { EditMetaServiceService } from '../../services/edit-meta-service.service';

@Component({
  selector: 'app-modal',
  standalone: true,
  imports: [NuevaMetaComponent],
  templateUrl: './modal.component.html',
  styleUrl: './modal.component.css'
})
export class ModalComponent implements OnChanges{
  
  comunication = inject(EditMetaServiceService);

  ngOnChanges(changes: SimpleChanges): void {
    console.log(this.comunication.getMetaAEditar());
  }
}
