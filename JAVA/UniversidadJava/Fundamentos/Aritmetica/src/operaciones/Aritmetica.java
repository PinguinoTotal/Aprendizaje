package operaciones;

public class Aritmetica {
  int a;
  int b;

  //constructores
  //se pueden agregar 2 o más constructores y se le llama sobrecarga de constructores
  public Aritmetica(){
    //esto solo se llama una vez cuando se crea el objeto con el "new"
    //esto reserva un espacio en memoria y da valores a las variables 
    //que se inician  con el objeto
    System.out.println("Ejecutando constucto");
  }
  
  public Aritmetica(int a, int b){
    this.a = a;
    this.b = b;
    System.out.println("Ejecutando constructor con argumentos ");
  }

  public void sumar(){
    int resultado = a + b;
    System.out.println(resultado);
  }

  public int sumarConRetorno(){
    int resultado = a+b;
    return resultado;
  }

  
  public int SumarConArgumentos(int a, int b){
    this.a = a;
    this.b = b;
    return a+b;
  }
   
}