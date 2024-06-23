package test;

import java.util.*;

public class TestColecciones {
  public static void main(String[] args) {
    // las listas pueden crecer dinamicamente
    // esta mantiene el orden de como van entrando los elementos
    // y se pueden duplicar los elementos que entran a la lista
    List<String> miLista = new ArrayList<>();
    miLista.add("Lunes");
    miLista.add("Martes");
    miLista.add("Miercoles");
    miLista.add("Jueves");
    miLista.add("Viernes");

    for (Object elemento : miLista) {
      System.out.println(elemento);
    }

    // tambien se pueden usar funciones lamda o funciones flecha
    miLista.forEach(elemento -> {
      System.out.println("elemento: " + elemento);
    });

    // los sets tambien se le puedne meter muchos elementos
    // y van creciendo de forma dinamica, pero este no guarda los
    // lugares en los que se fueron metiendo, pero es más rapido para guardar y
    // usar los elementos dentro de este y tambien este no acepta que se repitan
    // elementos
    // dentro de el
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
    
    //asi se recupera una llave 
    String elemento = miMapa.get("valor1");
    System.out.println(elemento);

    //imprimiendo todos los elementos del mapa 
    imprimir(miMapa.keySet()); //se imprimen las llaves
    imprimir(miMapa.values()); //se impirmen los valores 

  }

  public static void imprimir(Collection coleccion) {
    for (Object elemento : coleccion) {
      System.out.println(elemento);
    }
  }
}
