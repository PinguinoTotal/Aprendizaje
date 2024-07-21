import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ContactService {
  private http = inject(HttpClient);

  getContacts(){
    return this.http.get('http://localhost:8080/contacts');
  }

  findContact(id:number){
    return this.http.get(`http://localhost:8080/contacts/${id}`);
  }

  createContact(contact: any){
    return this.http.post('http://localhost:8080/contacts/create',contact);
  }

  editContact(contact:any){
    return this.http.put('http://localhost:8080/contacts/edit',contact);
  }

  deleteContact(id:number){
    return this.http.delete(`http://localhost:8080/contacts/delete/${id}`);
  }
}
