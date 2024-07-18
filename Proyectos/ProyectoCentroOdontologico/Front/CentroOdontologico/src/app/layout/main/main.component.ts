import { Component} from '@angular/core';
import { AppComponent } from "../../core/app-component/app.component";

@Component({
  selector: 'app-main',
  standalone: true,
  imports: [AppComponent],
  templateUrl: './main.component.html',
  styleUrl: './main.component.css'
})
export class MainComponent {
  
}
