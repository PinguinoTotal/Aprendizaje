package Tareas;
import java.util.Scanner;

public class Tarea4 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Proporciona el alto");
    int alto = Integer.parseInt(consola.nextLine());

    System.out.println("Proporciona el ancho");
    int ancho = Integer.parseInt(consola.nextLine());

    System.out.println("Area: " + (alto*ancho));
    System.out.println("Perimetro: " + (alto+ancho)*2);
    consola.close();
  }
}
