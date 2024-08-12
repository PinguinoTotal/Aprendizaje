import { Routes } from '@angular/router';
import { ColumnsComponent } from './views/columns/columns.component';
import { ColumnsFase0Component } from './views/columns-fase0/columns-fase0.component';

export const routes: Routes = [
    {
        path: '',
        component: ColumnsFase0Component,
        title: 'columnas'
    }
];
