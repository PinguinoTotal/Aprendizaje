import { Injectable } from '@angular/core';
import { Metas } from '../models/metas';

@Injectable({
  providedIn: 'root'
})
export class MetasService {
  metasMock: Metas[] = [
  {
    "id":"1",
    "detalles": "Correr por 30 minutos",
    "periodo": "día",
    "eventos": 1,
    "icono": "🏃‍♂️",
    "meta": 360,
    "plazo": "2030-01-01",
    "completado":5,
  },
  {
    "id":"2",
    "detalles": "Leer lirbos",
    "periodo": "año",
    "eventos": 6,
    "icono": "📚",
    "meta": 12,
    "plazo": "2030-01-01",
    "completado":0,
  },
  {
    "id":"3",
    "detalles": "Viajar a parques nacionales",
    "periodo": "mes",
    "eventos": 1,
    "icono": "🛫",
    "meta": 60,
    "plazo": "2030-01-01",
    "completado":40,
  },
  {
    "id":"4",
    "detalles": "Terminar angular",
    "periodo": "año",
    "eventos": 1,
    "icono": "🅰️",
    "meta": 50,
    "plazo": "2030-01-01",
    "completado":10,
  },
  {
    "id":"5",
    "detalles": "Aprender a programar",
    "periodo": "año",
    "eventos": 1,
    "icono": "🖥️",
    "meta": 100,
    "plazo": "2030-01-01",
    "completado":5,
  }
  ]
  constructor(){}

  obtenerMetas(): Metas[]{
    return this.metasMock;
  }
}
