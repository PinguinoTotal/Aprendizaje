import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AlbertEntreinComponent } from './albert-entrein/albert-entrein.component';
import { HomelanderComponent } from './homelander/homelander.component';
import { OmnimanComponent } from './omniman/omniman.component';
import { FormularioComponent } from './formulario/formulario.component';
import { ServiciosComponent } from './servicios/servicios.component';

export const routes: Routes = [
    {
        //en el path vacio vamos a dibujar la primera pagina
        path:'',
        component: AppComponent,
        //esto es el title de lo que se ve en la pestaña 
        //al lado del favicon
        title: 'Pagina principal del root'
    },
    {
        path:'albert',
        component: AlbertEntreinComponent,
        title: 'Biografia de Albert Ainstain'
    },
    {
        path:'homelander',
        component: HomelanderComponent,
        title: 'Biografia de Homelander'
    },
    {
        path:'omniman',
        component: OmnimanComponent,
        title: 'Biografia de Omniman'
    },
    {
        path:'formulario',
        component: FormularioComponent,
        title: 'Formulario'
    },
    {
        path:'servicios',
        component: ServiciosComponent,
        title: 'Servicios'
    },
];
