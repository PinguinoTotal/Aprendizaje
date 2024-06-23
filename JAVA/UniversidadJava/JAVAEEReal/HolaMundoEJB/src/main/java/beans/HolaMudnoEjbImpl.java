package beans;

import javax.ejb.Stateless;

//ponemos esto para que sea realmente un EJB
@Stateless
public class HolaMudnoEjbImpl implements HolaMundoEjbRemote{

  @Override
  public int sumar(int a, int b) {
    System.out.println("Ejecutando metodo suma en el servidor");
    return a+b;
  }
}
