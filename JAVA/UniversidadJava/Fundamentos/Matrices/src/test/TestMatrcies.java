package test;

import domain.Persona;

public class TestMatrcies {
    public static void main(String[] args) {
      //crando una matriz 
      //3 renglones, 2 columnas 
      int edades[][] = new int[3][2];
      //cuando lo imprimimos se imprime un objeto y sale el 
      //lugar que ocupa en memoria 

      edades[0][0] = 5;
      edades[0][1] = 7;
      edades[1][0] = 8;
      edades[1][1] = 4;

      //ciclo con matrices
      for (int ren = 0; ren < edades.length; ren++) {
        //asi se le dice que queremos el largo de los renglones
        for (int col = 0; col < edades[ren].length; col++) {
          System.out.println(edades[ren][col]);
        }
      }

      //sintaxis simplificada
      String frutas[][] = {{"naranja", "limon"}, {"fresa", "zarzamoara"}};
      for (int i = 0; i < frutas.length; i++) {
        for (int j = 0; j < frutas[i].length; j++) {
          System.out.println(frutas[i][j]);
        }
      }

      imprimir(frutas);

      Persona personas[][] = new Persona[2][3];
      personas[0][0] = new Persona("juan");
      personas[0][1] = new Persona("Karla");

      imprimir(personas);
    }

    public static void imprimir(Object matriz[][]){
      System.out.println("imprimiendo una nueva matriz");
      for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
          System.out.println("lugar: [" + i + "][" + i + "] = " + matriz[i][j]);
        }
      }
    }
}
