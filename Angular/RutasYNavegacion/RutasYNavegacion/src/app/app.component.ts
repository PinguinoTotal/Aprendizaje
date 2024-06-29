import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { AlbertEntreinComponent } from './albert-entrein/albert-entrein.component';
import { HomelanderComponent } from './homelander/homelander.component';
import { OmnimanComponent } from './omniman/omniman.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, AlbertEntreinComponent, HomelanderComponent, OmnimanComponent, RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'RutasYNavegacion';
}
