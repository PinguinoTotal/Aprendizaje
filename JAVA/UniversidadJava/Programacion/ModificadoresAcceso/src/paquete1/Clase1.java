package paquete1;

//no podemos poner una clase privada 
class Clase1 {
    private String atributoDefault = "atributo Privado";

    private Clase1(){
      System.out.println("constructor Privado");
    }


    //debemos hacer un cosntructor publcio, porque si no las clases hijas no pdoran 
    //instanciar el objeto padre que es lo quer le da toda la base 
    public Clase1(String argumento){
      this();
      System.out.println("Constructor publico");
    }

    //y el metodo privado solo podra ser usado en esta clase y por nadie más 
    private void metodoPrivado(){
      System.out.println("metodo Privado");
    }
}
