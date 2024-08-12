import { Component } from '@angular/core';
import { FlowComponent } from "../../subComponents/flow/flow.component";
import { AgregarProspectoComponent } from "../../subComponents/buttons/agregar-prospecto/agregar-prospecto.component";

@Component({
  selector: 'app-work-flow-fase0',
  standalone: true,
  imports: [FlowComponent, AgregarProspectoComponent],
  templateUrl: './work-flow-fase0.component.html',
  styleUrl: './work-flow-fase0.component.css'
})
export class WorkFlowFase0Component {

}
