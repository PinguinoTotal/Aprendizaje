import { Component } from '@angular/core';
import { FlowComponent } from '../../subComponents/flow/flow.component';

@Component({
  selector: 'app-work-flow',
  standalone: true,
  imports: [FlowComponent],
  templateUrl: './work-flow.component.html',
  styleUrl: './work-flow.component.css'
})
export class WorkFlowComponent {

}
