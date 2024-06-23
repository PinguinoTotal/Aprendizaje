package paquete1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
      //ahora debemos usar el cosntructor publcio, porque el privado 
      //no podemos accedera a el 
      Clase1 clase1 = new Clase1("argumento");
      //y tampoco podemos modificar sus atributos, a menos que se haga por
      //seters o geters 

      System.out.println(clase1);
    }
}
