import { Component, inject } from '@angular/core';
import { AppComponent } from "../../core/app-component/app.component";
import { PhoneMenuPressedService } from '../../services/phone-menu-pressed.service';

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [AppComponent],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
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
