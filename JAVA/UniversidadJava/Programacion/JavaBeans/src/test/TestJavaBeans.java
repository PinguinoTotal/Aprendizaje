package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
      Persona persona = new Persona();

      //como no se sabe cuantos constructores tiene pues
      //se crea un nuevo objeto vacio y lo inicializamos con sus seters
      persona.setNombre("Juan");
      persona.setApellido("Perez");

      System.out.println(persona);
    }
}
