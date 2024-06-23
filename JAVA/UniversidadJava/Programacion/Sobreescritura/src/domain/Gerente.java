package domain;

public class Gerente extends Empleado {

  private String departamento;

  public Gerente(String nombre, double sueldo, String departamento) {
    super(nombre, sueldo);
    this.departamento = departamento;
  }

  //sobreescribiendo un metodo que se pueda usar solo en este tipo de clases
  //al ser llamado desde el padre dara otro resultado
  @Override
  public String obetenerDetalles(){
    return super.obetenerDetalles() + ", departamento: " + departamento;
  }
}
