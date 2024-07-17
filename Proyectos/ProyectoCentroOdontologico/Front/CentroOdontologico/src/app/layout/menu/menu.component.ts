import { Component, inject } from '@angular/core';
import { PhoneMenuPressedService } from '../../services/phone-menu-pressed.service';

@Component({
  selector: 'app-menu',
  standalone: true,
  imports: [],
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent {
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
