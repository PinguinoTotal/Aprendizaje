import { Component, ElementRef, Input, OnInit, Renderer2, ViewChild } from '@angular/core';
import { Metas } from '../../models/metas';

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

  ngOnInit(): void {
    console.log(this.meta.completado);
    console.log(this.meta.meta);
    this.alcanzado = (this.meta.completado/this.meta.meta) * 100;

    console.log(this.alcanzado)
  }
}