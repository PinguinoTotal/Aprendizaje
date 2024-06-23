package PasoPorReferencia;

import clases.Persona;

public class PasoPorReferencia {
  public static void main(String[] args) {
    Persona persona1 = new Persona();
    persona1.nombre = "juan";
    System.out.println(persona1.nombre);

    persona1 = cambioValor(persona1);

    System.out.println(persona1.nombre);
  }

  //tenemos que decirle que tipo de valor vamos a regresar
  //si la funcion fuera un void regresaria un return ;
  public static Persona cambioValor(Persona persona){
    persona.nombre = "karla";
    return persona;
    //despues de que se agrege el return ya no se puede psar nada más 
    //a menos que regrese a traves de un if 
  }
}
