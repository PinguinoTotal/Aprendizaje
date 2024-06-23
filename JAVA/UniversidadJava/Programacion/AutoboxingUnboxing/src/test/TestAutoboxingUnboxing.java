package test;

public class TestAutoboxingUnboxing {
  public static void main(String[] args) {
    //clases envolventes de tipos primitivos
    /*
     * int - Integer
     * long - Long
     * float - Float
     * double - Double
     * boolean - Boolean
     * byte - Byte
     * char - Character
     * short - Short
     */
    //los primitivos solo gaurdan valores mientras que los 
    //envolventes guardan metodos
    //si no se hacen tantos calculos se puede usar tipos objet (envolventes)

    Integer entero = 10; //auto boxing
    System.out.println("entero =" + entero); // esto es un valor int
    System.out.println("entero = " + entero.toString()); //y esto es un string
    //pero agarramos el string desde la clase objeto y asi con los demas valores
    System.out.println("entero = " + entero.doubleValue()); //metodo para cambiar a double

    int entero2 = entero; //unboxing porque ya no es un objeto
    System.out.println(entero2);
  }
}
