package test;

import domain.Empleado;

public class TestClaseObject {
    public static void main(String[] args) {
      Empleado empleado1 = new Empleado("Juan", 500);
      Empleado empleado2 = new Empleado("Juan", 500);

      //esto dice que tienen diferente referencia en memoria
      if(empleado1 == empleado2){
        System.out.println("Tienen la misma referencia en memoria");
      }else{
        System.out.println("Tienen diferente referencia en memoria");
      }

      //usando equals
      if (empleado1.equals(empleado2)) {
        System.out.println("Los objetos sonn iguales en contenido");
      }else{
        System.out.println("Los objetos son iguales en contenido");
      }

      if (empleado1.hashCode() == empleado2.hashCode()) {
        System.out.println("El valor hashcode es igual"); 
      }else{
        System.out.println("El valor hashcode es distinto");
      }
    }
}
