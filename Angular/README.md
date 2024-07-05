# Clase Mestra de Angular (Prograamdor x)

## Creando un nuevo proyecto

para hacer un proyecto en angular primero lanzamos la consola en donde querramos hacer el proyecto y luego ejecutamos el comnado 
~~~ html
ng new 
~~~

esto nos sacara un menu en donde podremos darle nombre y como seran procesados nuestros componentes

## Lanzar o levantar un pryecto

no solo se puede abir un archivo y lanzar el proyecto, sino que tambien debemos levantar un server para que podamos ver los cambios en el proyecto y esto se hace entrando en la carpeta que tiene el proyecto y tecleando 
~~~ html
ng server 
~~~

## Crear un componente 
 para crear un componente es necesario poner en la consola 
 ~~~ html
ng generate component nombreDelComponente
~~~

o

~~~ html
ng g c nombreDelComponente
~~~

## estryctura dentro de los componente 

~~~ ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-hola-componente',
  standalone: true,
  imports: [],
  templateUrl: './hola-componente.component.html',
  styleUrl: './hola-componente.component.scss'
})
export class HolaComponenteComponent {
  edad = 17;
}
~~~

el selector es la etiqueta que usaremos en html para llamar al elemento:
~~~ html
<app-hola-component>
~~~

edad es la variable que sera insertada en el html haciendo la llamda:

~~~ html
<h3>Estoy aprendiendo Angular de manera muy sencilla</h3>
<p>hola-componente works!</p>
<p>tu edad es : {{edad}}</p>
@if (edad>=18) {
    <h3>Eres mayor de edad</h3>
}@else {
    <h3>Eres menor de edad</h3>
}
~~~


## Añadir un componente 
es importante añadir los elementos que vamos a ocupar para poder hacer usos de sus etiquetas por ende lo agregamos en el html.ts en el que lo vamos a ocupar

~~~ ts
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HolaComponenteComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
~~~


ok... angular parece funcionar haciendo "Piezas de lego", que despues pueden ser alteradas por codigo poniendo atributos de javascript en el html poniendo {{}} dentro de el html y despues dando las variables en el component .ts 

## Control If

~~~ html
@if (edad>=18) {
    <h3>Eres mayor de edad</h3>
}@else {
    <h3>Eres menor de edad</h3>
}

~~~

## Control for
~~~ ts
@Component({
  selector: 'app-hola-componente',
  standalone: true,
  imports: [],
  templateUrl: './hola-componente.component.html',
  styleUrl: './hola-componente.component.scss'
})
export class HolaComponenteComponent {
  edad = 17;
  cursos = [
    {vide: 58, name: "React", id: 0},
    {vide: 52, name: "Angular", id: 1},
    {vide: 60, name: "Python", id: 2}
  ];
}
~~~

~~~ html
@for (curso of cursos; track curso.id) {
    <h2>Nombre curso: {{curso.name}}</h2>
    <h3>Cantidad de video: {{curso.vide}}</h3>
}
~~~

## Mapear una propiedad
~~~ html
<img [src]="imgUrl">
~~~

~~~ ts
imgUrl = "assets/img/angular-logo.png"
~~~

## Eventos
~~~ html
<div class="card">
    <h2>Eventos locales</h2>
    <!--cuando se le da el evento click pasa algo-->
    <button (click)="accionBtn()">Ejecutar</button>
    <h3>Cantidad de ejecuciones: {{cantidadDeEjecuciones}}</h3>
    <h2>Cantidad de pasos</h2>
    <h3>Pasos dados: {{cantidadPasosDeMouse}}</h3>
    <div (mouseover)="aumentarPasos()" class="cardEditable">
        <h2>Dar un paso</h2>
    </div>
</div>

~~~

~~~ ts
import { Component } from '@angular/core';

@Component({
  selector: 'app-hola-componente',
  standalone: true,
  imports: [],
  templateUrl: './hola-componente.component.html',
  styleUrl: './hola-componente.component.scss'
})
export class HolaComponenteComponent {
  edad = 17;
  cantidadPasosDeMouse = 0;
  cantidadDeEjecuciones = 0;
  cursos = [
    {vide: 58, name: "React", id: 0},
    {vide: 52, name: "Angular", id: 1},
    {vide: 60, name: "Python", id: 2}
  ];

  //asi se hacen las funciones 
  accionBtn():void{
    this.cantidadDeEjecuciones += 1;
    console.log("he sido ejecuado");
    console.log(this.cantidadDeEjecuciones);
  }

  aumentarPasos(): void{
    this.cantidadPasosDeMouse += 1;
    console.log(this.cantidadPasosDeMouse);
    console.log("han pasado sobre mi");
  }
}
~~~

## Comunicacion con Inputs y Outputs
esta seccion la hizo muy rapido y no logre entender con Academia x, encontre unos video que parecen más utiles en esta seccion 
[@input](https://www.youtube.com/watch?v=1z6cYIYqypk&list=PLZ2ovOgdI-kWDh3jDh-GvgToRlVfwIUFw&index=20)

primero dare la expliacion porque si me costo un poco entenderle, hice un peuqño proyecto para poder entender esta seccion:

1.- tenemos los componentes hijos que van a tener un @Input que puede o no tener un valor que se le mande desde el componente padre a traves de html

2.- cada hijo tendra un evento personalizado (que de echo son el mismo evento, osease cada componente puede lanzar el mismo evento pero con diferentes valores dependiendo la funcion) todo esto con el @Output 

3.- cada hijo tiene un boton que cuando sea presionado lanzara el evento click que nos llevara a su respectivo funcion, esta funcion lanzara el evento personalizado con la informacion del hijo

4.- los eventos de los hijos son lanzados o son visualizados en el html del componente padre para que el pueda escucharlos y hacer su propia funcion para ver que hace con los valores que traen los eventos

5.- dentro del componente padre tienen una funcion que cambia el valor de una variable que esta siendo interpolada en el html del componente padre

6.- se muestra el valor de lo que el hijo mando

componenteHijoTs.ts
~~~ ts
import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-children',
  standalone: true,
  imports: [],
  templateUrl: './children.component.html',
  styleUrl: './children.component.css'
})
export class ChildrenComponent {
  //este elemento es para decir que nos van a pasar elementos del padre al hijo 
  //salarios! = es necesaria esta informacion
  //salarios? = es opcional esta informacion
  // o salarios : number [] = [] valor vacio
  @Input()
  //con esto damos a entender que tenemos una variable opcional que se llama 
  //title que nos pueden pasar como un atributo a traves de html asl:
  //<app-children title="Texto de prueba"></app-children>
  valor?: string = "valor asignado por el hijo"

  //creamos un evento personalizado desde el hijo
  //con esto decimos que va a salir del elemento hijo al elemento padre
  @Output()
  valorAlPadre = new EventEmitter<String>();

  mandarValorAlPadre(): void{
    //funcion que tienen todos los botones para enviarle informacion al padre
    this.valorAlPadre.emit(this.valor);
  }
}

~~~

componenteHijoHTML.html
~~~ html
<div class="hijo__container">
    <h2 class="hijo__header">Componente hijo</h2>
    <p class="hijo__valor">{{valor}}</p>
    <button class="hijo__btn" (click)="mandarValorAlPadre()">Mandar valor</button>
</div>

~~~

componentePadreTs.ts
~~~ ts
import { Component, Input } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ChildrenComponent } from './children/children.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ChildrenComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  //las variables estan encapsuladas, por ende solo se puede interpolar
  // el valor de esta variable al html que le corresponde
  valorDadoPorPadre = "valor dado por variable por el padre";
  valorCambiante:String = "valorCambiante";

  asignarValorMandadoPorElHijo(valorDelHijo:String){
    this.valorCambiante = valorDelHijo;
  }
}

~~~

componentePadreHTML.html
~~~ html
<div class="container">
  <div class="header__data">
    <h2 class="data__header">Componente padre</h2>
    <p class="data__info">Esto debe cambiar dependiendo de lo que manden los hijos</p>
    <!--escuchamos el evento que vamos a lanzar desde los hijos-->
    <p class="data__change">{{valorCambiante}}</p>
  </div>
  

  <div class="hijos__container">
    <app-children [valor]="valorDadoPorPadre" (valorAlPadre)="asignarValorMandadoPorElHijo($event)"></app-children>
    <app-children valor="valor dado por html por el padre" (valorAlPadre)="asignarValorMandadoPorElHijo($event)"></app-children>
    <app-children (valorAlPadre)="asignarValorMandadoPorElHijo($event)"></app-children>
  </div>
</div>
~~~

## Ciclo de vida de un componente 
componentePadreHTML.html
~~~ ts
export class CicloDeVidaComponent implements OnInit, OnChanges, DoCheck,
    AfterContentInit, AfterContentChecked, AfterViewInit, AfterViewChecked, OnDestroy {

    mostrar: boolean = false;

    constructor() {
        console.log('**constructor** - Se ejecuta una sola vez al crear el componente.');
    }

    ngOnChanges(): void {
        console.log('**ngOnChanges** - Se ejecuta cuando se detecta un cambio en las entradas del componente.');
    }

    ngOnInit(): void {
        console.log('**ngOnInit** - Se ejecuta una vez después de que el componente se haya inicializado.');
    }

    ngDoCheck(): void {
        console.log('**ngDoCheck** - Se ejecuta después de cada detección de cambios.');
    }

    ngAfterContentInit(): void {
        console.log('**ngAfterContentInit** - Se ejecuta una vez después de que se haya proyectado el contenido del componente.');
    }

    ngAfterContentChecked(): void {
        console.log('**ngAfterContentChecked** - Se ejecuta después de cada comprobación de cambios en el contenido proyectado.');
    }

    ngAfterViewInit(): void {
        console.log('**ngAfterViewInit** - Se ejecuta una vez después de que la vista del componente se haya inicializado.');
    }

    ngAfterViewChecked(): void {
        console.log('**ngAfterViewChecked** - Se ejecuta después de cada comprobación de cambios en la vista del componente.');
    }

    ngOnDestroy(): void {
        console.log('**ngOnDestroy** - Se ejecuta justo antes de que el componente se destruya.');
    }

    mostrarMensaje(): void {
        this.mostrar = true;
    }
}

~~~

## Directivas

nos permiten cambiar comportamientos y estilos sobre las cuales estemos aplicando estas directivas 

crear directiva
~~~ 
ng g d directives/nombreDeLaDirectiva
~~~

~~~ ts
import { Directive, ElementRef, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[CambiarColor]',
  standalone: true
})
export class CambiarColorDirective implements OnInit{

  @Input()
  colorFondo?:string = '#f7f7';

  //tomando los elementos que hace referencia esta directiva
  constructor(private elementRef: ElementRef) { }
  ngOnInit(): void {
    //en el inicio de la aplicion se le cambia el color de fondo a los
    //elementos que tengo referencias
    this.elementRef.nativeElement.style.backgroundColor = this.colorFondo;
  }

}
~~~

~~~ html
<div class="card">
    <h2>Eventos locales</h2>
    <button (click)="accionBtn()">Ejecutar</button>
    <h3>Cantidad de ejecuciones: {{cantidadDeEjecuciones}}</h3>
    <h2>Cantidad de pasos</h2>
    <h3 CambiarColor>Pasos dados: {{cantidadPasosDeMouse}}</h3>
    <div (mouseover)="aumentarPasos()" class="cardEditable">
        <h2>Dar un paso</h2>
    </div>
</div>

<div class="card">
    <app-calcular-promedio-salario [salarios]="listaSalarios" (promedioSalario)="recivirPromedio($event)"></app-calcular-promedio-salario>
    <!--aplicamos cambiar color-->
    <h3 CambiarColor>{{promedioSalarios}}</h3>
</div>

<div class="directivas">
    <h1>Directivas</h1>
    <!--aplicamos cambiar color-->
    <h2 CambiarColor>Directiva 1</h2>
    <!--aplicamos cambiar color pero con una variable-->
    <h2 CambiarColor colorFondo="#a9a9a9">Directiva 2</h2>
    <h2>Directiva 3</h2>
</div>
~~~

## Rutas y navegacion 

para hacer la navegacion en angular solo se tiene que abrir el archivo **app.routes.ts** y se agregan los nombres de hacia donde se puede ir asi:
~~~ ts
import { Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AlbertEntreinComponent } from './albert-entrein/albert-entrein.component';
import { HomelanderComponent } from './homelander/homelander.component';
import { OmnimanComponent } from './omniman/omniman.component';

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
];
~~~

despues de haecr eso en el archivo main desde el cual se van a acceder a las rutas se incluye la libreria para las rutas **RouerLink**
~~~ ts
import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { AlbertEntreinComponent } from './albert-entrein/albert-entrein.component';
import { HomelanderComponent } from './homelander/homelander.component';
import { OmnimanComponent } from './omniman/omniman.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, AlbertEntreinComponent, HomelanderComponent, OmnimanComponent, RouterLink],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'RutasYNavegacion';
}
~~~

y al final en lugar de usar href se usa routerLink
~~~ html
<header>
  <nav>
    <ul>
      <li><a routerLink="/">Home</a></li>
      <li><a routerLink="/albert">Biografía de Albert Entrein</a></li>
      <li><a routerLink="/homelander">Biografía de Homelander</a></li>
      <li><a routerLink="/omniman">Biografía de Omniman</a></li>
    </ul>
  </nav>
</header>
<main>
</main>
  <router-outlet/>
<footer>
  <h2>Esto es un footersote</h2>
</footer>
~~~

## Formularios
~~~ html
<section>
    <h2>Ejemplo Forms</h2>
    <!--
    <label for="framework">
        Framework Favorito:
        el ng model hace que se vea al isntante el cambio
        ngModel esto es para fomrularios prqueños
        para formularios mas serios y sostenibles en el tiempo se utiliza fomrularios reactivos
        <input type="text" name="framework" id="framework" [(ngModel)] = "favoriteFramework"/>
    </label>
    -->
    <form [formGroup]="formularioUusario" (ngSubmit)="subirFormulario()">
        <!--con el formControlName le damos el nombre que tendra en en script
        de formularioUusario-->
        <input type="text" formControlName="nombre" placeholder="ingresa tu nomnbre">
        <input type="email" formControlName="correo" placeholder="ingresa tu correo">
        <!--apagamos el bton hasta que el formulario sea valido-->
        <button type="submit" [disabled]="!formularioUusario.valid">Enviar</button>
    </form>
    
    <div class="info__content">
        <h2>Información ingresada</h2>
        <!--y asi se accede a las variables que estamos tomando-->
        <p class="info__params info__name">Nombre: {{formularioUusario.value.nombre}}</p>
        <p class="info__params info__email">Correo: {{formularioUusario.value.correo}}</p>
    </div>
    
</section>
~~~

~~~ ts
import { Component } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-formulario',
  standalone: true,
  //importando el modulo para hecr fomrularios (esto es para ngModel)
  //para los formularios reactivos importamos (ReactiveFormsModule)
  imports: [ReactiveFormsModule],
  templateUrl: './formulario.component.html',
  styleUrl: './formulario.component.css'
})
export class FormularioComponent {
  //esto lo tenia para mapear el valor que se obtenia con ngModel a favoriteFramework
  favoriteFramework = '';

  formularioUusario = new FormGroup(
    {
      nombre: new FormControl('',[Validators.required]),//le decimos que va a ser un string asi
      //los validatos son las formas que tendremos de validar los datos,
      //required es que el campo es requerido 
      correo: new FormControl('',[Validators.required, Validators.email])
    }
    
  )

  subirFormulario(){
    alert('formulario enviado con la siguiente informacion: ' + this.formularioUusario.value.nombre + "/" + this.formularioUusario.value.correo );
  }
}
~~~

## Servicios y consumo de API

para crear un servicio se hace asi:

~~~
ng g s servivios/nombreDelServicio
~~~

codigo del servicio para que peuda llegar a ser inyectable
~~~ ts
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})


export class CursosService {

  constructor() { }

  cursos = ['Angular', 'Flutter', 'React']

  getCursos(): string[]{
    return this.cursos;
  }

  getCursosPorId(id : number = 0){
    return this.cursos[id];
  }
}
~~~
codigo del servicio que ocuparemos para hacer una peticion HTTP
~~~ts
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AlbumServiceService {

  //esto es para hacer peticiones http
  constructor(private http: HttpClient) { }

  url:string = 'https://jsonplaceholder.typicode.com/albums/';

  obtenerAlbums(){
    return this.http.get(this.url);
  }
}
~~~

pequeño codigo de config para que pueda hacer las peticiones 
~~~ts
import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideHttpClient, withFetch } from '@angular/common/http';

//provideHttpClient(withFetch()) con esto le damos el proveedor para hacer las peticiones http
export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideRouter(routes), provideHttpClient(withFetch())]
};

~~~

codigo del componente al cual le inyectamos la dependencia
~~~ts
import { Component, inject, OnInit } from '@angular/core';
import { CursosService } from '../services/cursos.service';
import { FormsModule } from '@angular/forms';
import { AlbumServiceService } from '../services/album-service.service';

@Component({
  selector: 'app-servicios',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './servicios.component.html',
  styleUrl: './servicios.component.css'
})
export class ServiciosComponent implements OnInit{
  //inyectando la dependencia esto tambien se puede hacer en el constructor
  /*
  servicioCursos = inject(CursosService)
  */

  almacenarCursos!: string[];
  referenciaAlServicio!: CursosService;
  cursoId:number = 0;
  listaAlbums:any;

  //inyectando la dependencia desde el contsructor
  constructor(private servicioCursos: CursosService, private albumService: AlbumServiceService){
    //se necesitara un provedor para hacer las peticiones http por ende tenemos que ponerlo en el config 
    this.almacenarCursos = this.servicioCursos.getCursos();
    this.referenciaAlServicio = servicioCursos;
  }

  ngOnInit(): void {
    //llamo al metoido obtener albumes y me suscribo para cuando me de el 
    //resultado
    this.albumService.obtenerAlbums().subscribe((albums) =>{
      this.listaAlbums = albums;
      console.log(this.listaAlbums);
    })
  }
}
~~~

codigo html en el cual usamos la dependencia que ya se le inyecto en el ts
~~~ html
<section>
    <h2>Cursos</h2>
    <ul>
        @for (curso of almacenarCursos; track curso) {
            <li>{{curso}}</li>
        }
    </ul>

    <!--haciendo uso de la dependencia que le inyectamos a el codigo-->
    <!-- este es usando el inyectable del servicio fuera del constructor haciendo que 
    el servicio Curso sea publico y no privado como si lo llamaramos en el 
    constructor
    <p>Mi curso favorito es: {{servicioCursos.getCursosPorId(cursoId)}}</p>
    
    <label for="curso">
        Ingrese un numero del 0 al 2
        <input type="number" id="curos" [(ngModel)] = "cursoId">
    </label>
    -->

    <!--mientras que aqui se llama a la referencia del servicio que ya fue construida en 
    el constructor-->
    <p>Mi curso favorito es: {{referenciaAlServicio.getCursosPorId(cursoId)}}</p>
    
    <label for="curso">
        Ingrese un numero del 0 al 2
        <input type="number" id="curos" [(ngModel)] = "cursoId">
    </label>

    <h3>Informacion obtenida del curso</h3>
    
    @for (album of listaAlbums; track album.id) {
        <h4>Este album se llama: {{album.title}}</h4>
    }
    
</section>


~~~

===========================
~~~ ts

~~~
