package test;

import domain.*;

public class TestInstanceOf{
  public static void main(String[] args) {
    Empleado empleado = new Empleado("juan", 500);
    empleado = new Gerente("karla", 1000, "Contabilidad");
    determinarTipo(empleado);
  }

  public static void determinarTipo(Empleado empleado){
    //esta apuntando en memoria a un tipo gerente 
    if (empleado instanceof Gerente) {
      //hacemos instance of para saber si podemos hacer los cambios o casteos
      //de manera segura 
      System.out.println("Es de tipo gerente");
      //como nosotros metemos un tipo padre (empleado) lo volvemos hijo (gerente)
      Gerente gerente = (Gerente)empleado;
      System.out.println(gerente.getDepartamento());
      
    }else if (empleado instanceof Empleado) {
      System.out.println("Es de tipo empleado");
      //ya que si hacemos esto va a saltar error porque es un padre que se covierte hijo
      Gerente gerente = (Gerente)empleado;
      System.out.println(gerente.getDepartamento());
    }else if (empleado instanceof Object){
      System.out.println("Es de tipo Object");
    }
  }
}
