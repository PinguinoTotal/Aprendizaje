package mx.com.gm.peliculas.servivicio;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.com.gm.peliculas.datos.AccesoDatosImpl;
import mx.com.gm.peliculas.datos.IAccesoDatos;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

  // como los servicios que van a utilizar los usuarios son
  // muy similares o iguales los de acceso datos, podemos
  // o debemos hacer uso de estos, ya que ya los tenemos echos
  // por ende creamos una clase interfaz y luego le damos el valor
  // de una clase que la implemente para poder usar los metodos
  private final IAccesoDatos datos;

  public CatalogoPeliculasImpl() {
    this.datos = new AccesoDatosImpl();
  }

  @Override
  public void agregarPelicula(String nombrePelicula){
    Pelicula pelicula = new Pelicula(nombrePelicula);
    boolean anexar = false;

    try {
      // podemos usar el de nombre curso porque es una constante en la interfaz
      // de catalogo de peliculas
      anexar = this.datos.existe(NOMBRE_RECURSO);
      this.datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
    } catch (AccesoDatosEx ex) {
      System.out.println("Error de acceso a los datos");
      ex.printStackTrace();
    }

  }

  @Override
  public void listarPeliculas(){
    List<Pelicula> peliculas;
      try {
          peliculas = this.datos.listar(NOMBRE_RECURSO);
          for (Pelicula pelicula : peliculas) {
            System.out.println("pelicula = " + pelicula);
          }
      } catch (LecturaDatosEx ex) {
          Logger.getLogger(CatalogoPeliculasImpl.class.getName()).log(Level.SEVERE, null, ex);
      }
    
  }

  @Override
  public void buscarPelicula(String buscar){
    String resultado = null;
    try {
      resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
      System.out.println(resultado);
    } catch (Exception e) {
      System.out.println("Error de acceso de datos");
      e.printStackTrace(System.out);
    }

  }

  @Override
  public void iniciarArchivo(){
    try {
      if (this.datos.existe(NOMBRE_RECURSO)) {
        datos.borrar(NOMBRE_RECURSO);
        datos.crear(NOMBRE_RECURSO);
      } else {
        datos.crear(NOMBRE_RECURSO);
      }
    } catch (Exception e) {
      System.out.println("Error al iniciar catalogo de peliculas");
      e.printStackTrace(System.out);
    }

  }

}
