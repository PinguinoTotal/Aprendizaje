import { Component, inject } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-contact-form',
  standalone: true,
  imports: [RouterLink, ReactiveFormsModule],
  templateUrl: './contact-form.component.html',
  styleUrl: './contact-form.component.css'
})
export class ContactFormComponent {

  contactForm = new FormGroup({
    name: new FormControl('',[Validators.required]),
    email: new FormControl('',[Validators.required])
  })

  create(){
    console.log(this.contactForm.value)
  }
}
