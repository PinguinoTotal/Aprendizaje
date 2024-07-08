import { Routes } from '@angular/router';
import { ListarMetasComponent } from '../../components/listar-metas/listar-metas.component';
import { NuevaMetaComponent } from '../../components/nueva-meta/nueva-meta.component';

export const routes: Routes = [
    {
        path:'',
        component:ListarMetasComponent
    },
    {
        path:'crear',
        component:NuevaMetaComponent
    }
];
