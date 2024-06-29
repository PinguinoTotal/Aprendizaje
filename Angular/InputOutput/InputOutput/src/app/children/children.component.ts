import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-children',
  standalone: true,
  imports: [],
  templateUrl: './children.component.html',
  styleUrl: './children.component.css'
})
export class ChildrenComponent {
  //este elemento es para decir que nos van a pasar elementos del padre al hijo 
  //salarios! = es necesaria esta informacion
  //salarios? = es opcional esta informacion
  // o salarios : number [] = [] valor vacio
  @Input()
  //con esto damos a entender que tenemos una variable opcional que se llama 
  //title que nos pueden pasar como un atributo a traves de html asl:
  //<app-children title="Texto de prueba"></app-children>
  valor?: string = "valor asignado por el hijo"

  //creamos un evento personalizado desde el hijo
  //con esto decimos que va a salir del elemento hijo al elemento padre
  @Output()
  valorAlPadre = new EventEmitter<String>();

  mandarValorAlPadre(): void{
    //funcion que tienen todos los botones para enviarle informacion al padre
    this.valorAlPadre.emit(this.valor);
  }
}
