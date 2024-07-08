import { AfterContentInit, Component, inject,} from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Metas } from '../../models/metas';
import { MetasService } from '../../services/metas.service';
import { Router } from '@angular/router';
import { EditMetaServiceService } from '../../services/edit-meta-service.service';

@Component({
  selector: 'app-nueva-meta',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './nueva-meta.component.html',
  styleUrl: './nueva-meta.component.css'
})
export class NuevaMetaComponent implements AfterContentInit {
  //haciendo inyeccion de dependencia a traves de varriable
  metasService = inject(MetasService);

  //haciendo inyeccion de dependencias de la comunicacion 
  comunication = inject(EditMetaServiceService);

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

  metasIng?: Metas;

  //dando los valores que puede tomar los evenetos
  frecuencia: string[] = ["día", "semana", "mes", "año"];
  iconos: string[] = ["🦞", "⚽", "🏃", "👨‍🚒", "🤺", "🅰", "️🆎", "🅱", "️🆑", "📨", "📖", "📆", "💳", "👨‍🌾"];

  //meta que va a recibir los valores del formulario
  metaEnviar?: Metas;

  //inyectamos la dependencia de route para poder 
  //hacer uso de esta
  constructor(private router: Router) { }
  ngAfterContentInit(): void {
    console.log(this.comunication.getMetaAEditar());
    console.log("hola desde el onmchange")

    if (this.comunication.isMetaAEditarAvailable()) {
      this.metasIng = this.comunication.getMetaAEditar();
      //danodele los valores a un formulario desde el codigo
      this.formularioMeta.setValue({
        id: this.metasIng?.id,
        detalles: this.metasIng?.detalles,
        periodo: this.metasIng?.periodo,
        eventos: this.metasIng?.eventos,
        icono: this.metasIng!.icono,
        meta: this.metasIng?.meta,
        plazo: this.metasIng?.plazo,
        completado: this.metasIng?.completado,
      });
    }

    this.comunication.clearMetaAEditar();
  }

  //
  subirFormulario(): void {
    this.metaEnviar = {
      "id": this.generarNumeroAleatorio(10,156483).toString(),
      "detalles": this.formularioMeta.value.detalles!,
      "periodo": this.formularioMeta.value.periodo!,
      "eventos": this.formularioMeta.value.eventos!,
      "icono": this.formularioMeta.value.icono!,
      "meta": this.formularioMeta.value.meta!,
      "plazo": this.formularioMeta.value.plazo!,
      "completado": this.formularioMeta.value.completado!,
    }

    this.metasService.actualizarMetas(this.metaEnviar);

    //esto es para hacer qeu se vaya de una pestaña a otra 
    this.router.navigate(['/'])
  }

  // Método para generar un número aleatorio entre un rango específico
  generarNumeroAleatorio(min: number, max: number): number {
    return Math.floor(Math.random() * (max - min + 1)) + min;
  }

}


