package operaciones;

public class PruebaAritmetica {
  public static void main(String[] args) {
    //variables locales
    int a = 10;
    int b = 2;

    System.out.println(a);
    System.out.println(b);
    //como main es un metodo estatico solo puede llamar metodos estaticos 
    //miMetodo();

    Aritmetica aritmetica1 = new Aritmetica();
    System.out.println("aritmetica1 a: " + aritmetica1.a);
    System.out.println("aritmetica1 b: " + aritmetica1.b);

    Aritmetica aritmetica2 = new Aritmetica(5,8);
    System.out.println("aritmetica1 a: " + aritmetica2.a);
    System.out.println("aritmetica1 b: " + aritmetica2.b);
  }

  public static void miMetodo(){
    //aqui ya no podemos utilizar la variable a 
    //a
  }
}
