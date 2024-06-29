import { Directive, ElementRef, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[CambiarColor]',
  standalone: true
})
export class CambiarColorDirective implements OnInit{

  @Input()
  colorFondo?:string = '#f7f7';

  //tomando los elementos que hace referencia esta directiva
  constructor(private elementRef: ElementRef) { }
  ngOnInit(): void {
    //en el inicio de la aplicion se le cambia el color de fondo a los
    //elementos que tengo referencias
    this.elementRef.nativeElement.style.backgroundColor = this.colorFondo;
  }

}
