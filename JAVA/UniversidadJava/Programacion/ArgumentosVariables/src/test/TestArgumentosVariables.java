package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
      imprimirNumeros(3,4,5,6);
      imprimirNumeros(2,4);
      imprimirNumeros(9,8,7,5,4,3,2,1,0);

      variosParametros("juan", 2,3,4,5,5,2,2);
    }

    //los argumentos variables siempre deben ser los ultimos 
    private static void variosParametros(String nombre, int... numeros){
      System.out.println("nombre: " + nombre);
      imprimirNumeros(numeros);
    }

    //con los "..." decimos que los datos de entrada seran variables
    //si se le pone un arreglo, ya se debe saber cuantos elementos se le 
    //mandaran
    //se dice que no tenemos argumentos definidos o argumentos variables
    private static void imprimirNumeros(int... numeros){
      for (int i = 0; i < numeros.length; i++) {
        System.out.println("elementos: "+numeros[i]);
      }
    }
}
