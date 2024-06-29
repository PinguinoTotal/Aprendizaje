import { Component, Input } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ChildrenComponent } from './children/children.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ChildrenComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  //las variables estan encapsuladas, por ende solo se puede interpolar
  // el valor de esta variable al html que le corresponde
  valorDadoPorPadre = "valor dado por variable por el padre";
  valorCambiante:String = "valorCambiante";

  asignarValorMandadoPorElHijo(valorDelHijo:String){
    this.valorCambiante = valorDelHijo;
  }
}
