package test;

import aritmetica.Aritmetica;
import excepcion.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
      int resultado = 0;

      //las excepciones se hacen para que el codigo no pare 
      //abrutamente si no que podemos "controlar" los errores que 
      //nos marca el codigo de una manera organizada 

      //y si OperacionExtencion extiende de RuntimeException no es necesario
      //poner el try catch
      try{
        resultado = Aritmetica.division(10, 0);
        //capturando la excepcion

        //se pueden obtener varios errores de una sentencia try catch 
      }catch(OperacionExcepcion e){
        System.out.println("Ocurrio un error de ripo OperacionExcepcion");
        System.out.println(e.getMessage());
      }
      catch(Exception e){
        //imprimiendo la pila de excepciones
        System.out.println("Ocurrio un error");
        e.printStackTrace(System.out);
      }
      finally{
        //el bloque finaly siempre se va a lanzar, haya una excepcion 
        //o no la haya 
        System.out.println("se reviso la divicion entre 0");
      }
      System.out.println("resultado = " + resultado);

      //lo mejor seria siempre extender de runtimeException, ya que queda más
      //limpio el codigo 
    }
}
