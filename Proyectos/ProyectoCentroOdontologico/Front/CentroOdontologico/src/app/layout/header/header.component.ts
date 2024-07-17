import { Component, DoCheck, inject, OnInit } from '@angular/core';
import { PhoneMenuPressedService } from '../../services/phone-menu-pressed.service';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent implements OnInit, DoCheck{
  toggle = inject(PhoneMenuPressedService);
  pressed = this.toggle.isPressed();

  constructor(){}
  ngOnInit(): void {
    this.pressed = this.toggle.isPressed();
  }

  ngDoCheck(): void {
    this.pressed = this.toggle.isPressed();
  }

  toggleMenu():void{
    this.toggle.changeStatePressed();
  }
}
