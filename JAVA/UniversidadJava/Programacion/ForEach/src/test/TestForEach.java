package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
      int edades[] = {5,6,8,4};
      //usando el cilco for each
      for (int edad : edades) {
        System.out.println(edad);
      }

      Persona personas[] = {new Persona("juan"), new Persona("Agustin"), new Persona("Karla")};
      for (Persona persona : personas) {
        System.out.println(persona.toString());
      }
    }
}
