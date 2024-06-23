package test;

import java.time.LocalDate;

import domain.Cliente;
import domain.Empleado;

public class TestHerencia {
    public static void main(String[] args) {
      Empleado empleado1 = new Empleado("juan", 5000.0);
      System.out.println(empleado1.toString());

      Cliente cliente1 = new Cliente(LocalDate.now(),"juanito", 'm', 34 , "por ahi", false);
      System.out.println(cliente1.toString());

      Cliente cliente2 = new Cliente(LocalDate.now(), "juanita", 'f', 27 , "por ahi", true);
      System.out.println(cliente2.toString());
    }
}
