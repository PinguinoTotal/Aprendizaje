package mx.com.gm.peliculas.datos;

import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public interface IAccesoDatos {
  // puede arrojar una excepcion
  // este indica si el archivo con el que vamos a trabar existe o no
  public boolean existe(String nombreRecurso) throws AccesoDatosEx;

  public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

  public void escribir(Pelicula pelicula, String nombreArchivo, Boolean anexar) throws EscrituraDatosEx;

  public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

  public void crear(String nombreArchivo) throws AccesoDatosEx;

  public void borrar(String nombreArchivo) throws AccesoDatosEx;
}
