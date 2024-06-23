package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
      //haciendo un array de objetos de tipo persona 
      Persona personas[] = new Persona[2];

      personas[0] = new Persona("juancho");
      personas[1] = new Persona("juanchita");

      //iterando en arrays de tipo object
      for (int i = 0; i < personas.length; i++) {
        System.out.println(personas[i].toString());
      }
    }
}
