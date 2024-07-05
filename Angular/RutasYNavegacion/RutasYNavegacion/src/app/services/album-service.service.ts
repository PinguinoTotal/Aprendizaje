import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AlbumServiceService {

  //esto es para hacer peticiones http
  constructor(private http: HttpClient) { }

  url:string = 'https://jsonplaceholder.typicode.com/albums/';

  obtenerAlbums(){
    return this.http.get(this.url);
  }
}
