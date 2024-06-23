package dominio;

public class Persona {
  private String nombre;
  private double sueldo;
  private boolean eliminado;

  public Persona(String nombre, Double sueldo, boolean eliminado){
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.eliminado = eliminado;
  }

  //haciendo los seters y geters del objeto
  public String getNombre(){
    return this.nombre;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public Double getSueldo(){
    return this.sueldo;
  }

  public void setSueldo(Double sueldo){
    this.sueldo = sueldo;
  }

  //se usa is porque es un boolean
  public boolean isEliminado(){
    return this.eliminado;
  }

  public void setEliminado(Boolean eliminado){
    this.eliminado = eliminado;
  }

  //se hace este para que se pueda ver la info que tiene el obejto
  public String toString(){
    return "Persona [nombre: " + this.nombre +
           ", sueldo: " + this.sueldo +
           ", eliminado: " + this.eliminado +"]";
  }

}
