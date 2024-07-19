import { Component, inject, Input, OnInit } from '@angular/core';
import { PhoneMenuPressedService } from '../../services/phone-menu-pressed.service';
import { timer } from 'rxjs';

@Component({
  selector: 'app-dropdown',
  standalone: true,
  imports: [],
  templateUrl: './dropdown.component.html',
  styleUrl: './dropdown.component.css'
})
export class DropdownComponent implements OnInit{
  @Input()
  icon: String = "fa-solid fa-hospital-user";
  @Input()
  title: String = "Sin titulo"
  @Input()
  minusculas:String = "faltantes"
  @Input()
  unidad:String = "faltante"
  @Input()
  showLink:String ="/"
  @Input()
  createLink:String ="/"

  eleccionMinusculas!:String;
  eleccionUnidad!:String;

  open:boolean = false;
  noOpen:boolean = true;

  ngOnInit(): void {
    this.eleccionMinusculas = "Mostrar los " + this.minusculas;
    this.eleccionUnidad = "Agregar " + this.unidad;
  }

  openDropdown():void{
    this.open = !this.open;
    this.noOpen = !this.noOpen;
  }
}
