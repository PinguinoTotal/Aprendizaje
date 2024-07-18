import { Component, DoCheck, inject, OnInit } from '@angular/core';
import { MenuComponent } from '../../layout/menu/menu.component';
import { HeaderComponent } from "../../layout/header/header.component";
import { MainComponent } from "../../layout/main/main.component";
import { PhoneMenuPressedService } from '../../services/phone-menu-pressed.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [MenuComponent, HeaderComponent, MainComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements DoCheck, OnInit{
  pressedServise = inject(PhoneMenuPressedService);
  pressed:boolean = false;

  ngOnInit(): void {
    this.pressed = this.pressedServise.isPressed();
  }

  ngDoCheck(): void {
    this.pressed = this.pressedServise.isPressed();
  }
}
