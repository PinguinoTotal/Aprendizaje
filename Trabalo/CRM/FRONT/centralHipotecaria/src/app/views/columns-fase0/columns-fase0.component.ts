import { Component } from '@angular/core';
import { HeaderComponent } from "../../components/header/header.component";
import { SideBarComponent } from "../../components/side-bar/side-bar.component";
import { WorkFlowFase0Component } from '../../components/work-flow-fase0/work-flow-fase0.component';
import { AgregarProspectoComponent } from "../../subComponents/buttons/agregar-prospecto/agregar-prospecto.component";
import { PerfilamientoFormComponent } from "../../subComponents/perfilamiento-form/perfilamiento-form.component";

@Component({
  selector: 'app-columns-fase0',
  standalone: true,
  imports: [HeaderComponent, SideBarComponent, WorkFlowFase0Component, AgregarProspectoComponent, PerfilamientoFormComponent],
  templateUrl: './columns-fase0.component.html',
  styleUrl: './columns-fase0.component.css'
})
export class ColumnsFase0Component {

}
