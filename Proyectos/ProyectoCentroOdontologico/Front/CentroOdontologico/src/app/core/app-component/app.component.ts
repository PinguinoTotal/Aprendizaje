import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MenuComponent } from '../../layout/menu/menu.component';
import { HeaderComponent } from "../../layout/header/header.component";
import { MainComponent } from "../../layout/main/main.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [MenuComponent, HeaderComponent, MainComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  presionado:boolean = false;

  abrirPresionado():void{
    this.presionado = !this.presionado;
  }
}
