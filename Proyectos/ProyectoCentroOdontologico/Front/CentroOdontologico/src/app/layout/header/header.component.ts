import { Component, DoCheck, ElementRef, HostListener, inject, OnInit, Renderer2} from '@angular/core';
import { BreakpointObserver, Breakpoints } from '@angular/cdk/layout';
import { PhoneMenuPressedService } from '../../services/phone-menu-pressed.service';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent implements OnInit, DoCheck{
  pressedService = inject(PhoneMenuPressedService);
  pressed:boolean = false;
  //antes de estos px son los valores que se deben tomar
  private phoneSize = 480;
  //desde 0 a 480 es tamaño phone size
  private verticalTabletSize = 768;
  private horizontalTabletSize = 1024;
  private laptopSize = 1200;
  //despues de este es una computadora de escritorio


  private nombre:String = "Raul";
  private apellidoP:String = "Mendoza";
  private apellidoM:String = "Sanchez";
  public nombreAMostrar:String = "";

  constructor(){
  }
  ngDoCheck(): void {
    this.pressed = this.pressedService.isPressed();
  }

  

  ngOnInit(): void {
    this.nombreAMostrar = this.nombre + " " + this.apellidoP + " " + this.apellidoM;
    this.pressed = this.pressedService.isPressed();
    this.checkScreenSize(window.innerWidth);
  }

  //======================================================
  //METODO DE TESTEO DEL TAMAÑO DE PANTALLA CONSTANTE
  //======================================================
  @HostListener('window:resize', ['$event'])
  onResize(event: UIEvent) {
    // Verificar que event.target no sea null antes de acceder a innerWidth
    if (event.target instanceof Window) {
      this.checkScreenSize(event.target.innerWidth);
    }
  }
  

  private checkScreenSize(width: number) {
    if(width< this.verticalTabletSize){
      this.nombreAMostrar = this.nombre[0] + "." + this.apellidoP[0] + "." + this.apellidoM[0]
    }else{
      this.nombreAMostrar = this.nombre + " " + this.apellidoP + " " + this.apellidoM;
      this.pressedService.setPressed(false)
    }
  }

  showMenu():void{
    this.pressedService.changeStatePressed();
  }
}
