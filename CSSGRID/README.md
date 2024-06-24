# CSS GRID LAYOUT 

DISCLAIMER:
DESPUES DE COMPLETAR ESTE MINI CURSO CREI QUE NO ESTABA COMPLETAMENTE LISTO PARA HACER PAGINAS RESPONSIVE, YA QUE ESTE MINI CURSO NO ESTABA ENFOCADO A ESTO Y COMO YA TENIA EL CURSO DE (Master en CSS3 Avanzado: Maqueta 3 sitios web profesionales) ENTONCES DECIDI HACERLO PARA TENER BUENAS BASES DE CSS Y RESPONSIVE YA QUE SIENTO QUE EL CURSO VA UN POCO MÁS ENFOCADO EN ESTE, POR ENDE TAMPOCO ESTARA LA CARPETA DE FLEXBOX, PORQUE EL CURSO YA LO CONTEMPLA EN ALGUNA SECCION

[css grid layout curso](https://www.youtube.com/watch?v=uMLNwUDag2o&list=PLnunbwZjHqMOyP4D8eTwuCmEXHIrM0Euf)

El sistema de CSS grid layout ofrece un sistema de diseño basado en una cuadricula, con filas y columnnas, lo que facilita el diseño de paginas web sin tener que usar flotantes y posicionamiento

## CLASE 1
Estructura basica de un grid layout

index.html
~~~ html
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Css Grid clase 1</title>
    <link rel="stylesheet" href="styles2.css">
</head>
<body>
    <!--para grid layout es necesario
    tener un div que sea nuestro container -->
    <div class="grid-container">
        <div class="item1">1</div>
        <div class="item2">2</div>
        <div class="item3">3</div>
        <div class="item4">4</div>
        <div class="item5">5</div>
        <div class="item6">6</div>
        <div class="item7">7</div>
        <div class="item8">8</div>
        <div class="item9">9</div>
    </div>
</body>
</html>
~~~

styles.css
~~~ css
 /*inicializado el contenedor grid*/
.grid-container{
    display: grid;
    /*height: 400px;*/
    background-color: cornsilk;
    /*haciendo 3 columnas automaticas*/
    grid-template-columns: auto auto auto;
    /*tambien es posible darles valores determinados a las columnas*/
    /*grid-template-columns: 30px auto 50px;*/
    /*añadiendo el valor de las filas*/
    /*grid-template-rows: 50px auto 100px;*/

    /*centrar el contenido dentro del container*/
    /*justify-content: space-evenly;*/

    /*centrando de manera vertical*/
    /*align-content: center;*/

}

.grid-container div{
    background-color: crimson;
    text-align: center;
    color: white;
    padding: 10px;
    border: 1px solid black;
}

.item1{
    /*decir cuantas columnas queremos que un hijo de grid 
    queremos que ocupe*/
    /*debemos decir donde inicie y donde termine*/
    /*la numeracion es un poco complicada porquw se cuenta desde 
    el inicio de la column a*

    1              2             3             4     
    |  elemento 1  |  elemento 2 |  elemento 3 |
    

    /*este elemento ocupa 2 columnas*/
    /*grid-column: 1 / 3;*/

    /*tambien es posible decirle que quemos que ocupe 2 columnas*/
    /*comienza en el 1 pero ocupa 2 columnas*/
    grid-column: 1 / span 2;

    /*diciendo que va desde una fila a otra */
    /*casi el mismo sintaxis que con colums*/
    grid-row: 1 / span 2;

    /*la grid area engloba a los 2*/
    /*1: inicia en la fila numero 1
    2: inicia en la columna numero 2
    5: en que fila finaliza
    5: en que columna finaliza*/
    grid-area: 1 / 2 / 5 / 5;
}
~~~

styles2.css
~~~ css
 .grid-container{
    /*tambine es posible definir areas*/

    display: grid;
    background-color: cornsilk;
    grid-template-areas: 
    'header header header header'
    'menu menu menu aside'
    'main main main aside'
    'footer footer footer footer';
    /*y ahora solo hay que decirle a cada item donde debe ir*/

}

.grid-container div{
    background-color: crimson;
    text-align: center;
    color: white;
    padding: 10px;
    border: 1px solid black;
}

.item1{
    grid-area: header;
}

.item2{
    grid-area: menu;
}
.item3{
    grid-area: aside;
}
.item4{
    grid-area: main;
}
.item5{
    grid-area: footer;
}
~~~

## Clase 2 
el espacio entre cada columna/ fila se le llama gaps (brecha).
~~~ css
 .grid-container{
    display: grid;
    /*20 px entre columnas y 100 entre filas*/
    grid-gap: 50px 100px;
 }
~~~

~~~ css
 .grid-container{
    display: grid;
    /*50 px entre columnas*/
    grid-column-gap: 50px;
 }
~~~

~~~ css
 .grid-container{
    display: grid;
    /*50 px entre filas*/
    grid-row-gap: 50px;
 }
~~~

~~~ css
 .grid-container{
    /*alinear los elementos de manera horizontal*/
    display: grid;
    /*se reparten de manera ordenada*/
    justify-content: space-evenly;
    /*se reparten un poco mas centrados*/
    justify-content: space-around;
    /*se reparten a los lados y un poco al centro*/
    justify-content: space-between;
    /*se centran*/
    justify-content: center;
    /*se van al principio*/
    justify-content: start;
    /*se van al final*/
    justify-content: end;

    /*alinear los elementos de manera vertical*/
    align-content: center;
    /*solo puse un ejemplo pero en este caso tiene todos los
    valores anteriores pero se aplica de manera vertical*/
 }
~~~

## Clase 3
index.html
~~~ html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Grid Layout</title>
</head>
<body>
    <div class="grid-container">
        <div>1</div>
        <div>2</div>
        <div>3</div>
        <div>4</div>
        <div>5</div>
        <div>6</div>
        <div>7</div>
        <div>8</div>
        <div>9</div>
    </div>
</body>
</html>
~~~

styles.css
~~~ css
.grid-container{
    display: grid;
    background-color: cadetblue;
    grid-template-columns: auto 40px auto;
    grid-template-rows: auto 100px;
    /*separar 10px entre columnas*/
    column-gap: 10px;
    /*separar 20px entre filas*/
    row-gap: 20px;
    
}

.grid-container div{
    background-color: chocolate;
    border: 1px solid black;
}
~~~

## Clase 4

el grid area puede ser puiesto con nomrbes, pero si no queremos poner el nombre de un area le podemos dejar vacio con ...
~~~ css
.item1{
    grid-area: myArea;
    
}

.grid-container{
    grid-template-areas: 'myArea myArea . . .'
    'main main main main main '
}
~~~

## Clase 5
Responsive querys

index.html
~~~ html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Grid Layout</title>
</head>
<body>
    <div class="grid-container">
        <header>HEADER</header>
        <aside class="left">Left</aside>
        <article>Artiuclo</article>
        <aside class="right">Right</aside>
        <footer>FOOTER</footer>
    </div>
</body>
</html>
~~~

style.css
~~~ css
.grid-container{
    display: grid;
    background-color: beige;
    grid-template-columns: 150px auto 150px;
    /*con el repeat repetimos la configuracion para el numero de 
    filas o columnas que estemos diciendo*/
    grid-template-rows: repeat(3, 100px);
    gap: 10px;
}

.grid-container > *{
    background-color: brown;
    border: 1px solid black;
    text-align: center;
    color: white;
    padding: 10px;
    display: flex;
    justify-content: center;
    align-items: center;
}

header, footer{
    grid-column: 1 / span 3;
}

/*haciendo un mediaquery para pantallas menores a 600*/
@media all and (max-width: 600px) {
    .grid-container{
        grid-template-rows: repeat(5, 200px);
    }

    aside,article{
        grid-column: 1/ span 3;
    }
    
}
~~~

## Clase 6 
"hack" para hacer más facil una pagina responsive 