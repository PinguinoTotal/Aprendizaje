package mx.com.gm.sga.domain;

import java.io.Serializable;

//implementa serializable ya que va a ser utilizada por el servidor 
public class Persona implements Serializable {
  // esto es una configuracion que pide el tipo de comunicacion
  private static final long serialVersionUID = 1L;

  private int idPersona;
  private String nombre;
  private String appellido;
  private String email;
  private String telefono;

  // agregamos un constructor vacio
  public Persona() {
  };

  public Persona(int idPersona, String nombre, String appellido, String email, String telefono) {
    this.idPersona = idPersona;
    this.nombre = nombre;
    this.appellido = appellido;
    this.email = email;
    this.telefono = telefono;
  }

  public int getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(int idPersona) {
    this.idPersona = idPersona;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAppellido() {
    return appellido;
  }

  public void setAppellido(String appellido) {
    this.appellido = appellido;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Persona{");
    sb.append("idPersona=").append(idPersona);
    sb.append(", nombre=").append(nombre);
    sb.append(", appellido=").append(appellido);
    sb.append(", email=").append(email);
    sb.append(", telefono=").append(telefono);
    sb.append('}');
    return sb.toString();
  }

}
