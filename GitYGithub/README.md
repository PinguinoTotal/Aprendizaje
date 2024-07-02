# Git y GitHub desde cero
todo el conocimiento mostrado aqui fue sacado de : 
[TodoCodeAcademy](https://todocodeacademy.com)


para hacer un nuevo repositorio:
~~~
git init 
~~~

identificarnos en el repositorio:
~~~
git config user.name "nombre"
~~~

~~~
git config user.email "email@emial"
~~~

conectamos el remoto con el local
~~~
git remote add origin http:ElHttpQueNosDaGithub
~~~

estado en el que esta git ahora:
~~~
git status
~~~

agregar cosas a un posible commit, el punto significa "todo" lo que no esta guardado, tambien se le puede poner un archivo en especifico 
~~~
git add .
~~~

haciendo un commit, que sera un "paquete" de archivos los cuales vamos a guardar
~~~
git commit -m "descripcion del commit"
~~~

subiendo los archivos, master es la rama que queremos afectar
~~~
git push -u origin master
~~~

es posible que nos pida un token(que no fue mi caso al momento de estar escribiendo este codigo), por ende es necesario hacerlo, dejo el video que explica como hacerlo:
[generarToken](https://www.youtube.com/watch?v=2nzOI-ynXF4)

para clonar un repositorio es: ir al repositorio que queremos clonar (el clone es copiar todo el repositorio para tenerlo desde 0) 
~~~
git clone "url del repositorio que queremos clonar"
~~~

cuando estemos trabajando con alguien más y este hace un cambio y nos avisa, para actualizar el repo se hace con pull, master es la rama en la que estamos 
~~~
git pull origin master
~~~

nos indica en que rama estamos parados justo ahora y las ramas que tenemos creadas
~~~
git branch
~~~

crear una nueva rama 
~~~
git branch nombreDeLaNuevaRama 
~~~

cambiar nombre de una rama
~~~
git branch -m ramaCambio ramaNueva
~~~

cambiar de rama en la cual estoy parado
~~~
git checkcout nombreDeLaNuevaRama
~~~

eliminar rama 
~~~
git branch -d ramaABorrar 
~~~

limpiar la terminal
~~~
clear 
~~~

crear un nuevo archivo porterminal
~~~
touch "texto.txt" 
~~~

ver las diferencias entre 2 ramas
~~~
git diff ramaComprara1 ramaComparar2 
~~~

unir las ramas a la rama master, siempre que hacemos merge debemos estar parados en la rama que va a recibir los cambios en ese momento
~~~
git merge ramaOrigen ramaDestino
~~~

eliminar una rama remota 
[video](https://www.youtube.com/watch?v=_1IgkSx4pjQ)

~~~
git push origin --delete RamaAEliminar
~~~

cuando aparezca (END) se puede salir con la tecla q

ver commits
~~~
git log
~~~

ver commits en solo una linea
~~~
git log --oneline
~~~
