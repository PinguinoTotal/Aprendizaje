import { Component, inject, OnInit } from '@angular/core';
import { ContactService } from '../services/contact/contact.service';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-contact-list',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './contact-list.component.html',
  styleUrl: './contact-list.component.css'
})
export class ContactListComponent implements OnInit{
  private contactService = inject(ContactService);

  contacts:any[] = [];

  ngOnInit(): void {
    this.contactService.getContacts()
    .subscribe((contacts:any)=> {
      this.contacts = contacts;
    })
  }
  
}
