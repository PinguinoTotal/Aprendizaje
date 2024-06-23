package Tareas;

import java.util.Scanner;

public class Tarea6 {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    System.out.println("Proporciona un valor entre el 0 y 10");

    var valor = Float.parseFloat(consola.nextLine());
    var valorTexto = "";
    valorTexto = "A";

    if (valor>=0 && valor<6) {
      valorTexto = "F";
    }else if(valor>=6 && valor <7){
      valorTexto = "D";
    }else if(valor>=7 && valor <8){
      valorTexto = "C";
    }else if(valor>=8 && valor <9){
      valorTexto = "B";
    }else if(valor>=9 && valor <=10){
      valorTexto = "A";
    }else{
      valorTexto = "Valor desconocido";
    }
    System.out.println(valorTexto);
    consola.close();
  }
}
