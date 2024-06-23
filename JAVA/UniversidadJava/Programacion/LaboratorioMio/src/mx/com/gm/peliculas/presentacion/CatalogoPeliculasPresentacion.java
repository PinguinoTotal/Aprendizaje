package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;

import mx.com.gm.peliculas.servivicio.*;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
      int opcion = -1;
      Scanner scanner = new Scanner(System.in);

      ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
      //la implementacion de bajo acomplamiento y alta cuercion es que nosotros 
      //ya no necesitamos toca la parte donde se utiliza acceso de datos, sino 
      //solamente la capa de servicio que es la que solo debe ver el cliente final, 
      //por ende se intenta reducir los errores en la ejecucion

      while (opcion != 0) {
        System.out.println("elige una opcion: \n" 
                    +"1. Iniciar catalogo peliculas \n"
                    +"2. Agregar pelicula \n"
                    +"3. Lista pelicula \n"
                    +"4. Buscar pelicula \n"
                    +"0. Salir \n" 
                    );
        opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
          case 1:
            catalogo.iniciarArchivo();
            break;

          case 2:
            System.out.println("Introduce el nombre de la pelicula: \n");
            String nombrePeliculaString = scanner.nextLine().toString(); 
            catalogo.agregarPelicula(nombrePeliculaString);
            break;

          case 3:
            catalogo.listarPeliculas();
            break;

          case 4:
            System.out.println("Introduce una pelicula a buscar: \n");
            String buscar = scanner.nextLine().toString(); 
            catalogo.buscarPelicula(buscar);
            break;

          case 0:
            System.out.println("hasta pronto");;
            break;
        
          default:
            System.out.println("opcion no reconodica");
            break;
        }

      }
    }
}
