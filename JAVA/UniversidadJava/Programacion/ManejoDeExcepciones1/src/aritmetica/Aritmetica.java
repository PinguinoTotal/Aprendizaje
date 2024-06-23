package aritmetica;

import excepcion.OperacionExcepcion;

public class Aritmetica {
  //throws indica que este metodo puede arrojar una excepcion 
  //pero si OperacionExcepcion extiende de RuntimeExeption no es necesario
  //que se ponga el throws OperacionExcepcion 
   public static int division(int numerador, int denominador) throws OperacionExcepcion{
      if (denominador == 0) {
        //arrojar execpcion
        throw new OperacionExcepcion("Division entre cero");
      }

      return numerador/denominador;
   } 
}
