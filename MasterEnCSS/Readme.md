# Master en CSS3 Avanzado: Maqueta 3 sitios web profesionales
curso tomado en udemy 

## 1.- Itroduccion al curso

## 2, 3.- Repaso HTML
~~~ html
 <!DOCTYPE html>
<html lang="en">
<head>
    <!--se le pone utf para que reconozca bien las letras-->>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Html con Victor Robles Web</title>
</head>
<body>
    <h1>Encabezado</h1>
    <p>parrafo</p>
    <hr><!--linea-->
    <br><!--salto de linea-->

    <ul>
        <li>unordenated list</li>
    </ul>

    <ol>
        <li>ordenated list</li>
    </ol>

    <img src="aqui va la url del archivo" alt="texto alternativo"/> <br/>

    <a href="#">enlace</a>

    <table>
        <tr>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Telefono</th>
        </tr>

        <tr>
            <td>random</td>
            <td>random</td>
            <td>random</td>
        </tr>
    </table>

    <h1>Formulario</h1>
    <form action="">
        <p><label for="">Nombre: </label><input type="text" name="" id=""></p>
        <p><label for="">Apellido: </label><input type="text" name="" id=""></p>
        <p><label for="">Random: </label><input type="text" name="" id=""></p>
    </form>
</body>
</html>
~~~

## 4, 5.- Repaso CSS
index.html
~~~ html
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Repaso css</title>
</head>
<body>
    <div id="container">

        <header>
            <h1>CSS con Víctor Robles</h1>
        </header>

        <nav>
            <ul>
                <li><a href="index.html">Inicio</a></li>
                <li><a href="#">Página 1</a></li>
                <li><a href="#">Página 2</a></li>
                <li><a href="#">Blog</a></li>
                <li><a href="#">Contacto</a></li>
            </ul>
        </nav>

        <div class="clearfix"></div>

        <section id="content">

            <article class="article">
                <h2>Titulo del articulo</h2>
                <p>Texto del articulo</p>
            </article>

            <article class="article">
                <h2>Titulo del articulo</h2>
                <p>Texto del articulo</p>
            </article>


            <article class="article">
                <h2>Titulo del articulo</h2>
                <p>Texto del articulo</p>
            </article>


            <article class="article">
                <h2>Titulo del articulo</h2>
                <p>Texto del articulo</p>
            </article>
        </section>

        <aside>
            <h2>Barra lateral</h2>
            <form>
                <input type="text"/>
                <input type="submit" value="Buscar">
            </form>
        </aside>

        <div class="clearfix"></div>

        <footer>
            Victor Robles Web &copy; 
        </footer>
    </div>
</body>
</html>
~~~

style.css
~~~ css
 *{
    margin: 0px;
    padding: 0px;
}

body{
    background-color: lightgray;
    font-family: Arial, Helvetica, sans-serif;
}

#container{
    /*poniendo un comentario*/
    width: 80%;
    margin: 0px auto;
    border: 1px solid black;
}

header{
    background-color: red;
    height: 100px;
    width: 100%;
    text-align: center;
    line-height: 100px;
    color: white;
    border-bottom: 3px dashed black;
}

nav{
    background-color: lightblue;
    height: 50px;
    border-bottom: 1px solid black;
}

nav ul li{
    float: left;
    list-style: none;
    margin: 10px;
    line-height: 30px;
}

.clearfix{
    clear: both;
}

#content{
    float: left;
    background-color: green;
    width: calc(80% - 80px);
    padding: 40px;
    min-height: 500px;
}

.article{
    color: white;
    margin: 15px 0;
    padding-bottom: 10px;
    border-bottom: 1px solid #eee;
}

.article:first-child{
    border-top: 1px solid #eee;
    padding-top: 10px;
}

.article h2{
    font-size: 25px;
}

aside{
    float: left;
    background-color: orange;
    width: calc(20% - 20px);
    overflow: hidden;
    padding: 10px;
    min-height: 500px;
}

footer{
    background-color: black;
    color: white;
    text-align: center;
    height: 50px;
    line-height: 50px;

}
~~~
## 6.- Repado Flexbox
index.html
~~~html
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Aprendiendo Flexbox</title>
</head>
<body>
    <h1>Aprendiendo FLEXBOX con Victor Robles</h1>

    <section class="flex-container">

        <div class="caja c1">
            Caja 1
        </div>

        <div class="caja c2">
            Caja 2
        </div>

        <div class="caja c3">
            Caja 3
        </div>
    </section>
</body>
</html>
~~~

style.css
~~~css
 body{
    background-color: beige;
}

.flex-container{
    border: 1px solid gray;
    background-color: #ccc;
    padding: 20px;
    display: flex;
    /*alinear en columna o en fila dependiendo lo que se ponga
    tambien tiene row reverse que lo hace al reves y column 
    reverse que lo hace al reves pero en columna*/
    flex-direction: row;
    /*hacer que las cajas se acomoden dependiendo de su tamaño*/
    flex-wrap: wrap;
    /*el flex-grow es la union de flex-direction y de flex-wrap*/
    flex-grow: row wrap;
    /*el justify content es para alinear las cajas*/
    justify-content: center;
    /*justify-content: center; centra todas las cajas al centro*/ 
    /*justify-content: space-between; deja una a cada lado y reparte las demas al centro*/
    /*justify-content: space-around; deja el mismo espacio entre todas*/
    /*justify-content: start; inicia al inicio*/
    /*justify-content: end; inicia al final*/
    
    /*si se le da una altura determianda a el contenedor que comtiene las cajas
    las cajas van a ocupar todoe l alto de la caja, si no se les delimita un espacio*/
    width: 80%;
    height: 600px;
    
    /*el align-items nos ayuda a alinearlos de manera vertical*/
    align-items: center;

    /*el align-content es la distribucion que tiene entre los elementos */
    align-content: center;

    /*el align-content nos ayuda a acomodar las cajas*/
    margin: 0 auto;
    
}

.caja{
    border: 1px solid black;
    background-color: white;
    color: black;
    font-family: Arial, Helvetica, sans-serif;
    font-weight: bold;
    width: 200px;
    text-align: center;
    line-height: 200px;
    margin: 5px;
}

.c1{
    background-color: lightblue;
    /*dandole el orden a las cajas*/
    order: 2;
    /*con el flex-grow es la "priridad" que tienen los elementos
    de expandirse, por ende ocupan más espacio*/
    /*flex-grow: 5;*/

    /*con el flex basis determina el espacio que quermos que ocupe un elemento*/
    flex-basis: 50%;
}

.c2{
    background-color: lightcoral;
    order: 3;
}

.c3{
    background-color: lightgreen;
    order: 1;
}
~~~

## 7.-Repaso CSS Grid Layout
index.html
~~~html
 <!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Aprendiendo CSS Grid Layout</title>
</head>
<body>
    <h1>Aprendiendo CSS Grid Layout con Victor Robles WEB</h1>

    <div class="grid-layout">
        <div class="caja c1">
            Caja 1
        </div>

        <div class="caja c2">
            Caja 2
        </div>

        <div class="caja c3">
            Caja 3
        </div>

        <div class="caja c4">
            Caja 4
        </div>

        <div class="caja">
            Caja 5
        </div>

        <div class="caja">
            Caja 6
        </div>

        <div class="caja">
            Caja 7
        </div>

        <div class="caja">
            Caja 8
        </div>

        <div class="caja">
            Caja 9
        </div>

        <div class="caja">
            Caja 10
        </div>

        <div class="caja">
            Caja 11
        </div>

        <div class="caja">
            Caja 12
        </div>
    </div>
</body>
</html>
~~~

style.css
~~~css
 body{
    background-color:  antiquewhite;
    font-family: Arial, Helvetica, sans-serif;
}

.grid-layout{
    display: grid;
    grid-template-columns: auto auto auto;


    width: 80%;
    margin: 0 auto;
    background-color: aliceblue;
    padding: 20px;
    border: 1px solid blue;
}

.caja{
    border: 4px solid black;
    background-color: lightgray;
    text-align: center;
    line-height: 150px;
}

.c1{
    /*grid-column: 1/4;*/
    grid-column: 1 /span 2;
    grid-area: header;
}

.c2{
    grid-row: 2 / span 2;
}
~~~

## 8, 9.- Repaso Javascript
index.html
~~~ html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
</body>
    
    <div id="container">
        Hola
    </div>

    <div id="caja2">

    </div>

    <script src="main.js"></script>
</html>
~~~

style.css
~~~js
alert("Hola como estas");

//variables
let miVariable = "Hola";

//haciendo constantes
const altura = 175;

//concatenacion 
let concatenacion = miVariable + " " + altura;

let container_box = document.querySelector("#container");

container_box.innerHTML = `
<h1>Hola soy la caja de datos</h1>
<h2>Mi altura es: ${altura}</h2>`;

//condicionales if

if (altura <= 185) {
    console.log("eres una persona bajita");
}else{
    console.log("eres una persona alta");
}

//bucles
for (let index = 0; index < 200; index++) {
    console.log(index); 
}

//arrays
let nombre = ["victor", "pepe", "armando"];

//añadiendo 
nombre.push("martin");

nombre.forEach(nom => {
    console.log(nom);
});

//Funciones 
const miInformacion = (nombre, altura) =>{
    let misDatos = `
    <h1>Soy la caja de datos</h1>
    <h2>Mi nombre es: ${nombre}</h2>
    <h3>Mi altura es: ${altura}</h3>
    `

    return misDatos;
}

let caja2 = document.querySelector("#caja2");
caja2.innerHTML = miInformacion("ramon", 175);

//mostrar por consola
console.log(miVariable);
console.log(concatenacion);
~~~

## 11, 12.- Aprendiendo BEM en css
index.html
~~~html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>BEM en CSS</title>
</head>
<body>
    <h1>Metodologia BEM</h1>

    <section class="cards">
        <article class="cards__card">
            <h3 class="card__title">Tarjeta 1</h3>
            <p class="card_content">Contenido Tarjeta 1
                <!--Tiene más logica que lo llamemos card__readmore
                a llamarlo content_readmore porque no cambia demasiado 
                en donde se encuentra y es más entendible-->
                <span class="card__readmore">leer más</span>
            </p>
            <a href="#" class="card__link">victorRoblesweb.es</a>
        </article>

        <article class="cards__card">
            <h3 class="card__title">Tarjeta 2</h3>
            <p class="card_content">Contenido Tarjeta 2</p>
            <a href="#" class="card__link card__link--rojo">victorRoblesweb.es</a>
        </article>

        <article class="cards__card">
            <h3 class="card__title">Tarjeta 3</h3>
            <p class="card_content">Contenido Tarjeta 3</p>
            <a href="#" class="card__link">victorRoblesweb.es</a>
        </article>

        <article class="cards__card">
            <h3 class="card__title">Tarjeta 4</h3>
            <p class="card_content">Contenido Tarjeta 4</p>
            <a href="#" class="card__link">victorRoblesweb.es</a>
        </article>
    </section>
</body>
</html>
~~~

style.css
~~~ css
/*
BEM es una metodologia de trabajo de como nombrar elemenmtos
BEM = Bloque Elemento Modificador

se usa siempre CLASS no ID


CLASS= aplicar estilos
ID= aplicar funcionalidad (javascript)

.bloque 
.bloque__elemento
.bloque__elemento--modificador

1. No usar ID
2. No usar etiquetas
3. Que todo sea un key selector (seleccionar justo el elemento alk cual se le daran especificaciones) 
*/

.cards{
    /*orden de como poner los elementos*/
    /*tamaño*/
    width: 400px;
    /*margenes*/
    margin: 10px auto;
    padding: 10px;
    /*bordes*/
    border: 1px solid gray;
    box-shadow: 0px 0px 20px gray;
    border-radius: 5px;
}

.cards__card{
    font-family: 'Courier New', Courier, monospace;
    padding: 10px;
    margin: 5px;
    background-color: lightblue;
}

.card__title{
    font-size: 24px;
    font-weight: bold;
}

.card__link{
    padding: 10px;
    background-color: green;
    color: white;
    text-decoration: none;
}

.card__link--rojo{
    background-color: red;
}
~~~

## 13.-
style.css
~~~ css
/*aqui se deben poner las variables*/
/*representa la raiz del documento*/
:root{
    --mi-Variable: #ccc;
    --fuente: Arial, Verdana;
    --fuente-size: 45px;
}

h1{
    background-color: var(--mi-Variable);
}
~~~
## 14.- Que es boxSizing
index.html
~~~ html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>

    <h1>Box Sizing con Victor Robles</h1>
    
    <div class="caja">
        <h2>Soy una caja</h2>
        <p>Soy el contenido</p>
    </div>
</body>
</html>
~~~

style.css
~~~ css
.caja{
    font-family: 'Courier New', Courier, monospace;
    /*el border box nos sirve para que respete el height siempre
    aplicando los demas paddings sin alterar el tamaño de la caja*/
    box-sizing: border-box;
    width: 300px;
    height: 180px;
    margin: 30px auto;
    padding: 50px;
    border: 1px solid gray;
    border-radius: 10px;
    box-shadow: 0px 0px 10px gray;
    text-align: center;
    background-color: cadetblue;
    color: white;
}
~~~

## 15.- Unidades de medida
existen unidades de medida fijas y relativas, las relativas se adaptan a las pantallas y son las que se deberian ocupar

![medidas](/Readme_files/medidas.png "unidades de medida")

-los pixeles **px** siempre son fijas, no son lo me
~~~
 
~~~
## 16.-
~~~
 
~~~
## 17.-
~~~
 
~~~
## 18.-
~~~
 
~~~
## 19.-
~~~
 
~~~
## 20.-
~~~
 
~~~
## 21.-
~~~
 
~~~
## 22.-
~~~
 
~~~
## 23.-
~~~
 
~~~
## 24.-
~~~
 
~~~
## 25.-
~~~
 
~~~
## 26.-
~~~
 
~~~
## 27.-
~~~
 
~~~
## 28.-
~~~
 
~~~
## 29.-
~~~
 
~~~
## 30.-
~~~
 
~~~
## 31.-
~~~
 
~~~
## 32.-
~~~
 
~~~
## 33.-
~~~
 
~~~
## 34.-
~~~
 
~~~
## 35.-
~~~
 
~~~
## 36.-
~~~
 
~~~
## 37.-
~~~
 
~~~
## 38.-
~~~
 
~~~
## 39.-
~~~
 
~~~
## 40.-
~~~
 
~~~
## 41.-
~~~
 
~~~
## 42.-
~~~
 
~~~
## 43.-
~~~
 
~~~
## 44.-
~~~
 
~~~
## 45.-
~~~
 
~~~
## 46.-
~~~
 
~~~
## 47.-
~~~
 
~~~
## 48.-
~~~
 
~~~
## 49.-
~~~
 
~~~
## 50.-
~~~
 
~~~
## 51.-
~~~
 
~~~
## 52.-
~~~
 
~~~
## 53.-
~~~
 
~~~
## 54.-
~~~
 
~~~
## 55.-
~~~
 
~~~
## 56.-
~~~
 
~~~
## 57.-
~~~
 
~~~
## 58.-
~~~
 
~~~
## 59.-
~~~
 
~~~
## 60.-
~~~
 
~~~
## 61.-
~~~
 
~~~
## 62.-
~~~
 
~~~
## 63.-
~~~
 
~~~
## 64.-
~~~
 
~~~
## 65.-
~~~
 
~~~
## 66.-
~~~
 
~~~
## 67.-
~~~
 
~~~
## 68.-
~~~
 
~~~
## 69.-
~~~
 
~~~
## 70.-
~~~
 
~~~
## 71.-
~~~
 
~~~
## 72.-
~~~
 
~~~
## 73.-
~~~
 
~~~
## 74.-
~~~
 
~~~
## 75.-
~~~
 
~~~
## 76.-
~~~
 
~~~
## 77.-
~~~
 
~~~
## 78.-
~~~
 
~~~
## 79.-
~~~
 
~~~
## 80.-
~~~
 
~~~
## 81.-
~~~
 
~~~
## 82.-
~~~
 
~~~
## 83.-
~~~
 
~~~
## 84.-
~~~
 
~~~
## 85.-
~~~
 
~~~
## 86.-
~~~
 
~~~
## 87.-
~~~
 
~~~
## 88.-
~~~
 
~~~
## 89.-
~~~
 
~~~
## 90.-
~~~
 
~~~
## 91.-
~~~
 
~~~
## 92.-
~~~
 
~~~
## 93.-
~~~
 
~~~
## 94.-
~~~
 
~~~
## 95.-
~~~
 
~~~
## 96.-
~~~
 
~~~
## 97.-
~~~
 
~~~
## 98.-
~~~
 
~~~
## 99.-
~~~
 
~~~
## 100.-
~~~
 
~~~
## 101.-
~~~
 
~~~
## 102.-
~~~
 
~~~
## 103.-
~~~
 
~~~
## 104.-
~~~
 
~~~
## 105.-
~~~
 
~~~
## 106.-
~~~
 
~~~
## 107.-
~~~
 
~~~
## 108.-
~~~
 
~~~
## 109.-
~~~
 
~~~
## 110.-
~~~
 
~~~
## 111.-
~~~
 
~~~
## 112.-
~~~
 
~~~
## 113.-
~~~
 
~~~
## 114.-
~~~
 
~~~
## 115.-
~~~
 
~~~
## 116.-
~~~
 
~~~
## 117.-
~~~
 
~~~
## 118.-
~~~
 
~~~
## 119.-
~~~
 
~~~
## 120.-
~~~
 
~~~
## 121.-
~~~
 
~~~
## 122.-
~~~
 
~~~
## 123.-
~~~
 
~~~
## 124.-
~~~
 
~~~
## 125.-
~~~
 
~~~
## 126.-
~~~
 
~~~
## 127.-
~~~
 
~~~
## 128.-
~~~
 
~~~
## 129.-
~~~
 
~~~
## 130.-
~~~
 
~~~
## 131.-
~~~
 
~~~
## 132.-
~~~
 
~~~
## 133.-
~~~
 
~~~
## 134.-
~~~
 
~~~
## 135.-
~~~
 
~~~
## 136.-
~~~
 
~~~
## 137.-
~~~
 
~~~
## 138.-
~~~
 
~~~
## 139.-
~~~
 
~~~
## 140.-
~~~
 
~~~
## 141.-
~~~
 
~~~
## 142.-
~~~
 
~~~
## 143.-
~~~
 
~~~
## 144.-
~~~
 
~~~
## 145.-
~~~
 
~~~
## 146.-
~~~
 
~~~
## 147.-
~~~
 
~~~
## 148.-
~~~
 
~~~
## 149.-
~~~
 
~~~
## 150.-
~~~
 
~~~
## 151.-
~~~
 
~~~
## 152.-
~~~
 
~~~
## 153.-
~~~
 
~~~
## 154.-
~~~
 
~~~
## 155.-
~~~
 
~~~
## 156.-
~~~
 
~~~
## 157.-
~~~
 
~~~
## 158.-
~~~
 
~~~
## 159.-
~~~
 
~~~
## 160.-
~~~
 
~~~
## 161.-
~~~
 
~~~
## 162.-
~~~
 
~~~
## 163.-
~~~
 
~~~
## 164.-
~~~
 
~~~
## 165.-
~~~
 
~~~
## 166.-
~~~
 
~~~
## 167.-
~~~
 
~~~
## 168.-
~~~
 
~~~
## 169.-
~~~
 
~~~
## 170.-
~~~
 
~~~
## 171.-
~~~
 
~~~
## 172.-
~~~
 
~~~
## 173.-
~~~
 
~~~
## 174.-
~~~
 
~~~
## 175.-
~~~
 
~~~
## 176.-
~~~
 
~~~
## 177.-
~~~
 
~~~
## 178.-
~~~
 
~~~
## 179.-
~~~
 
~~~
## 180.-
~~~
 
~~~
## 181.-
~~~
 
~~~
## 182.-
~~~
 
~~~
## 183.-
~~~
 
~~~
## 184.-
~~~
 
~~~
## 185.-
~~~
 
~~~
## 186.-
~~~
 
~~~
## 187.-
~~~
 
~~~
## 188.-
~~~
 
~~~
## 189.-
~~~
 
~~~
## 190.-
~~~
 
~~~
## 191.-
~~~
 
~~~
## 192.-
~~~
 
~~~
## 193.-
~~~
 
~~~
## 194.-
~~~
 
~~~
## 195.-
~~~
 
~~~
## 196.-
~~~
 
~~~
## 197.-
~~~
 
~~~
## 198.-
~~~
 
~~~
## 199.-
~~~
 
~~~
## 200.-
~~~
 
~~~
## 201.-
~~~
 
~~~
## 202.-
~~~
 
~~~
## 203.-
~~~
 
~~~
## 204.-
~~~
 
~~~
## 205.-
~~~
 
~~~
## 206.-
~~~
 
~~~
## 207.-
~~~
 
~~~
## 208.-
~~~
 
~~~
## 209.-
~~~
 
~~~
## 210.-
~~~
 
~~~
## 211.-
~~~
 
~~~
## 212.-
~~~
 
~~~
## 213.-
~~~
 
~~~
## 214.-
~~~
 
~~~
## 215.-
~~~
 
~~~
## 216.-
~~~
 
~~~
## 217.-
~~~
 
~~~
## 218.-
~~~
 
~~~
## 219.-
~~~
 
~~~
## 220.-
~~~
 
~~~
## 221.-
~~~
 
~~~
## 222.-
~~~
 
~~~
## 223.-
~~~
 
~~~
## 224.-
~~~
 
~~~
## 225.-
~~~
 
~~~
## 226.-
~~~
 
~~~
## 227.-
~~~
 
~~~
## 228.-
~~~
 
~~~
## 229.-
~~~
 
~~~
## 230.-
~~~
 
~~~
## 231.-
~~~
 
~~~
## 232.-
~~~
 
~~~
## 233.-
~~~
 
~~~
## 234.-
~~~
 
~~~
## 235.-
~~~
 
~~~
## 236.-
~~~
 
~~~
## 237.-
~~~
 
~~~
## 238.-
~~~
 
~~~
## 239.-
~~~
 
~~~
## 240.-
~~~
 
~~~
## 241.-
~~~
 
~~~
## 242.-
~~~
 
~~~
## 243.-
~~~
 
~~~
## 244.-
~~~
 
~~~
## 245.-
~~~
 
~~~
## 246.-
~~~
 
~~~
## 247.-
~~~
 
~~~
## 248.-
~~~
 
~~~
## 249.-
~~~
 
~~~
## 250.-
~~~
 
~~~
## 251.-
~~~
 
~~~
## 252.-
~~~
 
~~~
## 253.-
~~~
 
~~~
## 254.-
~~~
 
~~~
## 255.-
~~~
 
~~~
## 256.-
~~~
 
~~~
## 257.-
~~~
 
~~~
## 258.-
~~~
 
~~~
## 259.-
~~~
 
~~~
## 260.-
~~~
 
~~~
## 261.-
~~~
 
~~~
## 262.-
~~~
 
~~~
## 263.-
~~~
 
~~~
## 264.-
~~~
 
~~~
## 265.-
~~~
 
~~~
## 266.-
~~~
 
~~~
## 267.-
~~~
 
~~~
## 268.-
~~~
 
~~~
## 269.-
~~~
 
~~~
## 270.-
~~~
 
~~~
## 271.-
~~~
 
~~~
## 272.-
~~~
 
~~~
## 273.-
~~~
 
~~~
## 274.-
~~~
 
~~~
## 275.-
~~~
 
~~~
## 276.-
~~~
 
~~~
## 277.-
~~~
 
~~~
## 278.-
~~~
 
~~~
## 279.-
~~~
 
~~~
## 280.-
~~~
 
~~~
## 281.-
~~~
 
~~~
## 282.-
~~~
 
~~~
## 283.-
~~~
 
~~~
## 284.-
~~~
 
~~~
## 285.-
~~~
 
~~~
## 286.-
~~~
 
~~~
## 287.-
~~~
 
~~~
## 288.-
~~~
 
~~~
## 289.-
~~~
 
~~~
## 290.-
~~~
 
~~~
## 291.-
~~~
 
~~~
## 292.-
~~~
 
~~~
## 293.-
~~~
 
~~~
## 294.-
~~~
 
~~~
## 295.-
~~~
 
~~~
## 296.-
~~~
 
~~~
## 297.-
~~~
 
~~~
## 298.-
~~~
 
~~~
## 299.-
~~~
 
~~~
## 300.-
~~~
 
~~~
## 301.-
~~~
 
~~~
## 302.-
~~~
 
~~~
## 303.-
~~~
 
~~~
## 304.-
~~~
 
~~~
## 305.-
~~~
 
~~~
## 306.-
~~~
 
~~~
## 307.-
~~~
 
~~~
## 308.-
~~~
 
~~~
## 309.-
~~~
 
~~~
## 310.-
~~~
 
~~~
## 311.-
~~~
 
~~~
## 312.-
~~~
 
~~~
## 313.-
~~~
 
~~~
## 314.-
~~~
 
~~~
## 315.-
~~~
 
~~~
## 316.-
~~~
 
~~~
## 317.-
~~~
 
~~~
## 318.-
~~~
 
~~~
## 319.-
~~~
 
~~~
## 320.-
~~~
 
~~~
## 321.-
~~~
 
~~~
## 322.-
~~~
 
~~~
## 323.-
~~~
 
~~~
## 324.-
~~~
 
~~~
## 325.-
~~~
 
~~~
## 326.-
~~~
 
~~~
## 327.-
~~~
 
~~~
## 328.-
~~~
 
~~~
## 329.-
~~~
 
~~~
## 330.-
~~~
 
~~~
## 331.-
~~~
 
~~~
## 332.-
~~~
 
~~~
## 333.-
~~~
 
~~~
## 334.-
~~~
 
~~~
## 335.-
~~~
 
~~~
## 336.-
~~~
 
~~~
## 337.-
~~~
 
~~~
## 338.-
~~~
 
~~~
## 339.-
~~~
 
~~~
## 340.-
~~~
 