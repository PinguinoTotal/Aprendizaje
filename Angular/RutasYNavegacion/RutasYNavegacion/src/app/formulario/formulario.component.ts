import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-formulario',
  standalone: true,
  //importando el modulo para hecr fomrularios FormsModule (esto es para ngModel)
  //para los formularios reactivos importamos (ReactiveFormsModule)
  imports: [ReactiveFormsModule],
  templateUrl: './formulario.component.html',
  styleUrl: './formulario.component.css'
})
export class FormularioComponent {
  //esto lo tenia para mapear el valor que se obtenia con ngModel a favoriteFramework
  favoriteFramework = '';

  formularioUusario = new FormGroup(
    {
      nombre: new FormControl('',[Validators.required]),//le decimos que va a ser un string asi
      //los validatos son las formas que tendremos de validar los datos,
      //required es que el campo es requerido 
      correo: new FormControl('',[Validators.required, Validators.email])
    }
    
  )

  subirFormulario(){
    alert('formulario enviado con la siguiente informacion: ' + this.formularioUusario.value.nombre + "/" + this.formularioUusario.value.correo );
  }
}
