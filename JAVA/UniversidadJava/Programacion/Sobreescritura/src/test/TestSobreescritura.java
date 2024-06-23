package test;

import domain.*;

public class TestSobreescritura {
  public static void main(String[] args) {
    Empleado empleado = new Empleado("juan", 500);
    //System.out.println(empleado.obetenerDetalles());
    imprimir(empleado);

    Gerente gerente = new Gerente("karla", 1000, "Contabilidad");
    //System.out.println(gerente.obetenerDetalles());
    imprimir(gerente);
  }

  //esto es polimorfismo proque al entrar una clase empleado hace lo que se espera
  //pero al entrar un tipo gerente hace que se imprima obtener detalles, pero este no es 
  //de clase empleado, extiende de ella, pero no lo es, por ende podemos tener metodos 
  //sobreescritos que tendran diferentes comportamientos dependeiendo de si son hijos de 
  //una clase base 
  //mas tecnicamente depende de donde apunte en memoria y de que tipo sea este hara cosas
  //diferetes 
  public static void imprimir(Empleado empleado){
    System.out.println(empleado.obetenerDetalles());
  }
}
