package paquete1;

public class ClaseHija extends Clase1{
    public ClaseHija(){
      //ya no podemos hacer uso de nada de la clase 
      //porque es privado y aunque sea hija de esta clase1 
      super("argumento");
    }
}
