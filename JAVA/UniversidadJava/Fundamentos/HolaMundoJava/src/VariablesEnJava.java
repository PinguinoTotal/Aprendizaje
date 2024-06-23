public class VariablesEnJava {
  public static void main(String[] args) {
    //ciclo while
    var contador = 0;
    while (contador<3) {
      System.out.println("contador = "+contador);
      contador++;
    }

    //el ciclo do while primero hace algo y luego ya sigue iterando
    //ciclo do while 
    contador = 0;
    do {
      System.out.println("contador2 = "+contador);
      contador++;
    } while (contador<3);

    //ciclo for
    //inicalizacion de la variable, sentencia de corte y suma
    //ya no se puede usar i despues  
    for (int i = 0; i < 3; i++) {
      System.out.println("contador con for = " + i);
    }
  }
}
