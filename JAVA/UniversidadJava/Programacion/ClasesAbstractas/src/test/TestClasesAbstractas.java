package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
      //no se pueden utilizar o crear las clases padre si son abstractas

      //aunque no se puede crear una variable de tipo Figura con el new
      //se puede usar la base para poder hacer polimorfismo
      FiguraGeometrica figura = new Rectangulo("Rectangulo");
      figura.dibujar();
    }
}
