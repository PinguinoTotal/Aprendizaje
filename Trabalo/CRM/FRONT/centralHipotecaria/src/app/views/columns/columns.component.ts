import { Component } from '@angular/core';
import { HeaderComponent } from '../../components/header/header.component';
import { SideBarComponent } from '../../components/side-bar/side-bar.component';
import { WorkFlowComponent } from "../../components/work-flow/work-flow.component";

@Component({
  selector: 'app-columns',
  standalone: true,
  imports: [HeaderComponent, SideBarComponent, WorkFlowComponent],
  templateUrl: './columns.component.html',
  styleUrl: './columns.component.css'
})
export class ColumnsComponent {

}
