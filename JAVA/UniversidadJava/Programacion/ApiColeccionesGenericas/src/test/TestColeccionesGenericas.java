package test;

import java.util.*;

public class TestColeccionesGenericas {
  public static void main(String[] args) {
    List<String> miLista = new ArrayList<>(); //lo mejor es poner que sea tipo string
    miLista.add("Lunes");
    miLista.add("Martes");
    miLista.add("Miercoles");
    miLista.add("Jueves");
    miLista.add("Viernes");

    for (Object elemento : miLista) {
      System.out.println(elemento);
    }

    miLista.forEach(elemento -> {
      System.out.println("elemento: " + elemento);
    });

    Set<String> miSet = new HashSet<>();
    miSet.add("Lunes");
    miSet.add("Martes");
    miSet.add("Miercoles");
    miSet.add("Jueves");
    miSet.add("Viernes");

    imprimir(miSet);

    Map<String, String> miMapa = new HashMap<>();

    miMapa.put("valor1", "Juan");
    miMapa.put("valor2", "Karla");
    miMapa.put("valor3", "Rosario");
    
    String elemento = miMapa.get("valor1");
    System.out.println(elemento);
 
    imprimir(miMapa.keySet()); 
    imprimir(miMapa.values()); 

  }

  //se le pone string para que no sea tan dificl hacer la conversion de
  //objeto a string 
  public static void imprimir(Collection<String> coleccion) {
    for (Object elemento : coleccion) {
      System.out.println(elemento);
    }
  }
}
