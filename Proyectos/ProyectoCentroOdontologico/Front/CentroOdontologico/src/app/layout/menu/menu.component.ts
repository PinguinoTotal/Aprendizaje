import { Component, inject} from '@angular/core';
import { PhoneMenuPressedService } from '../../services/phone-menu-pressed.service';
import { DropdownComponent } from "../../components/dropdown/dropdown.component";

@Component({
  selector: 'app-menu',
  standalone: true,
  imports: [DropdownComponent],
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
