package test;

import manejoarchivos.ManejoArchivos;

public class TestManejoArchivos {
    public static void main(String[] args) {
      //el archivo se crea en la raiz de nuestro proyecto, ahi
      //aparece el archivo prueba.txt
      var nombreArchivo = "prueba.txt";
      //cuando hice el curso ajecute la linea que estaba abajoi una vez
      //y para despues de corre el progrma ya no 
      //ManejoArchivos.crearArchivo(nombreArchivo);

      //si llamamos a la misma linea nuestro texto se esta sobreescribiendo, pero si 
      //la llamamos una vez, hacemos que escriba en el archivo
      ManejoArchivos.escirbirArchivo(nombreArchivo, "Hola desde java");


      //esto hace un append a lo que ya teniamos escrito en nuestro archivo 
      ManejoArchivos.anexarArchivo(nombreArchivo, "adios");
      ManejoArchivos.anexarArchivo(nombreArchivo, "hola de nuevo");
      ManejoArchivos.anexarArchivo(nombreArchivo, "espero");
      ManejoArchivos.anexarArchivo(nombreArchivo, "que");
      ManejoArchivos.anexarArchivo(nombreArchivo, "estes");
      ManejoArchivos.anexarArchivo(nombreArchivo, "muy");
      ManejoArchivos.anexarArchivo(nombreArchivo, "bien");

      //vamos a leer linea por linea lo que tiene el archivo que creamos, 
      //metimos informacion y la concatenamos

      ManejoArchivos.leerArchivo(nombreArchivo);
    }
}
