import { Component, Input} from '@angular/core';

@Component({
  selector: 'app-flow',
  standalone: true,
  imports: [],
  templateUrl: './flow.component.html',
  styleUrl: './flow.component.css'
})
export class FlowComponent {
  @Input()
  title?: string = "titulo de la fase";
}
