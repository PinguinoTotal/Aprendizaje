package test;

public class TestArreglos {
  public static void main(String[] args) {
    //haciendo un array 
    int edades[] = new int[3];
    System.out.println(edades);

    //acceder a los elementos
    edades[0] = 4;

    //haciendo iteraciones 
    for (int i = 0; i < edades.length; i++) {
      System.out.println(edades[i]);
    }

    //como inicializar los lugares del array de una vez 
    String frutas[] = {"naranja", "platano", "uva"};
    for (int i = 0; i < frutas.length; i++) {
      System.out.println(frutas[i]);
    }
  }  
}
