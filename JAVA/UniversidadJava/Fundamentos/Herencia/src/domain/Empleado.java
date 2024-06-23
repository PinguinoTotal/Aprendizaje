package domain;

//con la palabra de extends decimos que es hijo de algo 
public class Empleado extends Persona {
  private int idEmpelado;
  private double sueldo;
  private static int contadorEmpleado;

  public Empleado(){
    Empleado.contadorEmpleado++;
  }

  public Empleado(String nombre, double sueldo) {
    /*con this(); podemos llamatr otros constructores dentro de 
     * este constructor, en este caso siempre queremos que se cuente 
     * uno más a el contador empleado por ende este llama al 
     * constructor vacio, es importante poner el this hasta el inicio del codigo 
     * pero para pasarle los atributos al padre se hace directamente sobre los
     * atributos, ya que estos son protected, ya que no podemos usar super 
     */
    this();
    this.nombre = nombre; //se puede hacer esto porque es protectted 
    this.idEmpelado = contadorEmpleado;
    this.sueldo = sueldo;
  }

  public int getIdEmpelado() {
    return this.idEmpelado;
  }

  public double getSueldo() {
    return this.sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Empleado{");
    sb.append("idEmpelado=").append(this.idEmpelado);
    sb.append(", sueldo=").append(this.sueldo);
    //puedo acceder a this.nombre porque en la clase padre esta en protected.
    //con super puedo acceder a los metodos del padre, por ende puedo usar el 
    //to string que se encuentra en el.
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }

}
