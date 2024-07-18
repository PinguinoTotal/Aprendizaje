import { Component, inject} from '@angular/core';
import { PhoneMenuPressedService } from '../../services/phone-menu-pressed.service';

@Component({
  selector: 'app-menu',
  standalone: true,
  imports: [],
  templateUrl: './menu.component.html',
  styleUrl: './menu.component.css'
})
export class MenuComponent {
  pressedService = inject(PhoneMenuPressedService);
  noPressed:boolean = false;

  ngDoCheck(): void {
    this.noPressed = !this.pressedService.isPressed();
  }

  ngOnInit(): void {
    this.noPressed = !this.pressedService.isPressed();
  }

  showMenu():void{
    this.pressedService.changeStatePressed();
  }

}
