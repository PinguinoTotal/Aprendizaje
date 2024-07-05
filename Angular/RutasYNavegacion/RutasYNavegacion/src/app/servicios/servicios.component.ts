import { Component, inject, OnInit } from '@angular/core';
import { CursosService } from '../services/cursos.service';
import { FormsModule } from '@angular/forms';
import { AlbumServiceService } from '../services/album-service.service';

@Component({
  selector: 'app-servicios',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './servicios.component.html',
  styleUrl: './servicios.component.css'
})
export class ServiciosComponent implements OnInit{
  //inyectando la dependencia esto tambien se puede hacer en el constructor
  /*
  servicioCursos = inject(CursosService)
  */

  almacenarCursos!: string[];
  referenciaAlServicio!: CursosService;
  cursoId:number = 0;
  listaAlbums:any;

  //inyectando la dependencia desde el contsructor
  constructor(private servicioCursos: CursosService, private albumService: AlbumServiceService){
    //se necesitara un provedor para hacer las peticiones http por ende tenemos que ponerlo en el config 
    this.almacenarCursos = this.servicioCursos.getCursos();
    this.referenciaAlServicio = servicioCursos;
  }

  ngOnInit(): void {
    //llamo al metoido obtener albumes y me suscribo para cuando me de el 
    //resultado
    this.albumService.obtenerAlbums().subscribe((albums) =>{
      this.listaAlbums = albums;
      console.log(this.listaAlbums);
    })
  }
}
