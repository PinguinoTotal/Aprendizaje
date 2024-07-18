import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PhoneMenuPressedService {
  private pressed = false;

  public changeStatePressed(){
    this.pressed = !this.pressed;
  }

  public isPressed():boolean{
    return this.pressed;
  }

  public setPressed(state:boolean):void{
    this.pressed = state;
  }
}
