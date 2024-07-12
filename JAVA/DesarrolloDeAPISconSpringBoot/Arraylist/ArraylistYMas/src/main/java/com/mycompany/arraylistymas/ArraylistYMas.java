package com.mycompany.arraylistymas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistYMas {

    public static void main(String[] args) {
        //arayslists 
        
        //existen 2 tipos los fifo y los lifo
        //fifo = first in first out
        //lifo = last in first out
        
        //las arraylist son fifo 
        
        //los arrays tienen una amnipulacion lenta 
        
        
        //haciendo un arraylist 
        List<Persona> lista = new ArrayList<Persona>();
        //añadiendo un elemento al arraylist
        lista.add(new Persona(1,"luisina",30));
        lista.add(new Persona(2,"Gabriel",30));
        lista.add(new Persona(3,"Ibra",3));
        lista.add(new Persona(4,"TodoCode",2));
        
        //recorer por indice
        //i
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("prueba: " + lista.get(i).getNombre());
        }
        
        //foreach
        for (Persona persona : lista) {
            System.out.println("prueba 2: " + persona.getNombre());
        }
        
        //LinkedList
        //listas doblemente enlazadas(ida y vuelta)
        //fifo
        //lista tambien vista como pila o cola 
        //podemos agregar registros al inicio y al final
        
        //haciendo linkedList
        List<Persona> lista2 = new LinkedList<Persona>();
        
        lista2.add(new Persona(1,"luisina",30));
        lista2.add(new Persona(2,"Gabriel",30));
        lista2.add(new Persona(3,"Ibra",3));
        lista2.add(new Persona(4,"TodoCode",2));
        
        //agregar al prinicpio (solo pniendole el 0)
        lista2.add(0,new Persona(4,"Probando",98));
        
        //no funciona por indice, sino que por registro, por ende se usa el foreach
        for (Persona persona : lista2) {
            System.out.println("prueba 4: " + persona.getNombre());
        }
    }
}
