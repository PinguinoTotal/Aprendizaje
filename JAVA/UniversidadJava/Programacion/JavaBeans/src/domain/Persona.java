package domain;

import java.io.Serializable;

//todo esto es necesario para que cumpla la norma de ser un "JavaBean"
//siendo lo primero que implemente Serializable s
public class Persona implements Serializable {
  // las variables deben ser privadas
  private String nombre;
  private String apellido;

  // se debe agregar un constructor vacio publico
  public Persona() {
  }

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  // tener get y set para cada atributo de la clase
  // JavaBeans trabaja con encapsulamiento entonces
  // atributos privados con seters y geters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  // equal, hashcode y to string ya es opcional

  @Override
  public String toString() {
    return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
  }
}
