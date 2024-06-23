package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
      //la sobrecarga de metodos es importante ya que depende de los parameytros que le 
      //vamos a meter y java decide cual queda mejor paea usarlo 
      var resultado = Operaciones.sumar(5, 3);
      System.out.println(resultado);

      var resultado1 = Operaciones.sumar(5.0, 0);
      System.out.println(resultado1);

    }
}
