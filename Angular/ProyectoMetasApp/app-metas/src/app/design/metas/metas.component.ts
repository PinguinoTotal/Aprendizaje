import { Component, ElementRef, inject, Input, OnInit, Renderer2, ViewChild } from '@angular/core';
import { Metas } from '../../models/metas';
import { Router } from '@angular/router';
import { EditMetaServiceService } from '../../services/edit-meta-service.service';

@Component({
  selector: 'app-metas',
  standalone: true,
  imports: [],
  templateUrl: './metas.component.html',
  styleUrl: './metas.component.css'
})
export class MetasComponent implements OnInit {

  @Input()
  meta!: Metas;
  alcanzado: number = 0;

  //inyecto el servicio que hara que se comuniquen 
  comunication = inject(EditMetaServiceService); 

  constructor(private router:Router){

  }

  ngOnInit(): void {
    this.alcanzado = (this.meta.completado/this.meta.meta) * 100;
  }

  editarMeta(){
    this.comunication.setMetaAEditar(this.meta);
    console.log(this.comunication.getMetaAEditar());
    this.router.navigate(['/editar'])
  }
}