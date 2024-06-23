package PasoPorValor;

public class PasoPorValor {
  public static void main(String[] args) {
    //pasar por valor solo pasa una copia del valor, pero no la referencia
    var x = 10;
    System.out.println("x =" + x);
  }

  public static void cambioValor(int arg1){
    //sin poner x = algo;
    //no es posible que cambie el valor de x con arg1
  }

  
}