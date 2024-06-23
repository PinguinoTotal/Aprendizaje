package test;

import domain.Persona;

public class TestBloquesInicializacion {
    public static void main(String[] args) {
      Persona persona1 = new Persona();
      System.out.println(persona1);
      //primero se crea el bloque estatico, luego el bloque no estatico
      //luego el constructor

      Persona persona2 = new Persona();
      System.out.println(persona2);
      //ahora ya no se ejecuta el bloque estatico, ya que este solo se 
      //corre una sola vez por clase
    }
}
