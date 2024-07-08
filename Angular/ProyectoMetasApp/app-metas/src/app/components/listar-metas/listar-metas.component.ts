import { Component, OnInit } from '@angular/core';
import { MetasComponent } from '../../design/metas/metas.component';
import { MetasService } from '../../services/metas.service';
import { Metas } from '../../models/metas';

@Component({
  selector: 'app-listar-metas',
  standalone: true,
  imports: [MetasComponent],
  templateUrl: './listar-metas.component.html',
  styleUrl: './listar-metas.component.css'
})
export class ListarMetasComponent implements OnInit{

  listaDeMetas!: Metas[];

  constructor(private metasRecibidas: MetasService){
  }

  ngOnInit(): void {
    this.listaDeMetas = this.metasRecibidas.obtenerMetas();
  }
}
