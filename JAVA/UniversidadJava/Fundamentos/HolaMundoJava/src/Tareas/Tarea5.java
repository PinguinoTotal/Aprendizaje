package Tareas;

import java.util.Scanner;

public class Tarea5 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("Proporciona el numero1:");
    var n1 = Float.parseFloat(consola.nextLine());

    System.out.println("Proporciona el numero2:");
    var n2 = Float.parseFloat(consola.nextLine());

    System.out.println("El numero mayor es:");
    if(n1 >= n2){
      System.out.println("numero 1 con valor: "+n1);
    }else{
      System.out.println("numero 2 con valor: "+n2);
    }

    consola.close();
  }
}
