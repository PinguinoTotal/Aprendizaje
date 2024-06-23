package clases;

public class PruebaPersona {
  public static void main(String[] args) {
    Persona persona1;
    //llamando al constructor para darles valores y darle espacio
    //en la memoria con el new 
    persona1 = new Persona();
    persona1.nombre = "Juan";
    persona1.apellido = "Gutierritos";
    persona1.desplegarInformacio();

    Persona persona2 = new Persona();
    persona2.nombre = "Karla";
    persona2.apellido = "Lara";
    persona2.desplegarInformacio();

    //si los imprimimos direcatmente nos da su localizacion en la memoria 
    System.out.println("espacio en memoria de persona 1 = " + persona1);
    System.out.println("espacio en memoria de persona 2 = " + persona2);
  }
}
