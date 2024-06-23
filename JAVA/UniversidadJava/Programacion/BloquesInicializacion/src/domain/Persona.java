package domain;

public class Persona {
  //tenemos bloques estaticos y no estaticos 
    private final int idPersona; //no estatica
    private static int contadorPersonas; //estatico

    //bloque de inicializacion estatico
    //este corre antes que el constructor
    //y antes de cualquier bloque no estatico
    static{ 
      System.out.println("ejecucion bloque estatico");
      ++Persona.contadorPersonas;
      //en los bloques estaticos solo se pueden inicializar estaticos

      //este solo se corre una sola vez para todas las clases
    }

    //los {} vacios es un bloque de inicializacion no estatico
    //y se ejecuta antes que nuestro constructor pero despues de 
    //los bloques estaticos 
    {
      //tambien se le conoce como contexto dinamico
      System.out.println("ejecucion de bloque no estatico");
      //aqui si podemos usar el this
      this.idPersona = contadorPersonas++;

      //este bloque siempre se corre cuando creamos una de estas clases
    }

    public Persona(){
      System.out.println("ejecucion en el constructor");
    }

    public int getIdPersona() {
      return idPersona;
    }
}
