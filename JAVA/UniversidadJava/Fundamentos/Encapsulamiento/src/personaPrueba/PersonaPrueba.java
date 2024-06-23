package personaPrueba;

import dominio.Persona;
//import dominio.*; cargar toda la libreria

public class PersonaPrueba {
  public static void main(String[] args) {
    Persona persona1 = new Persona("Juan", 500.00, false);
    //como ya son privadas las variables y estan encapsuladas, debemos hacer 
    //uso de los seters y geters
    //usando el set que ya le pusimos
    persona1.setNombre("Juan Carlos");
    //usando los geters 
    //System.out.println("persona1 nombre: "+ persona1.getNombre());
    //System.out.println("persona1 sueldo: "+ persona1.getSueldo());
    //System.out.println("persona1 eliminado: "+ persona1.isEliminado());

    System.out.println(persona1.toString());
  }
  
}
