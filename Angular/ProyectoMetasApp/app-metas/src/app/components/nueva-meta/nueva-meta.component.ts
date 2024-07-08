import { Component, inject } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Metas } from '../../models/metas';
import { MetasService } from '../../services/metas.service';
import { Router} from '@angular/router';

@Component({
  selector: 'app-nueva-meta',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './nueva-meta.component.html',
  styleUrl: './nueva-meta.component.css'
})
export class NuevaMetaComponent {
  //haciendo inyeccion de dependencia a traves de varriable
  metasService = inject(MetasService);

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

//dando los valores que puede tomar los evenetos
frecuencia: string[] = ["día", "semana", "mes", "año"];
iconos: string[] = ["🦞","⚽","🏃","👨‍🚒","🤺","🅰","️🆎","🅱","️🆑","📨","📖","📆","💳","👨‍🌾"];

//meta que va a recibir los valores del formulario
metaEnviar?: Metas;

//inyectamos la dependencia de route para poder 
//hacer uso de esta
constructor(private router:Router){

}
subirFormulario():void{
  this.metaEnviar = {
    "id":"1",
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

}


