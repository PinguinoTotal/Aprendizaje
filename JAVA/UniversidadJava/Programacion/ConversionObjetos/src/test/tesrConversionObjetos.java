package test;

import domain.*;

public class tesrConversionObjetos {
    public static void main(String[] args) {
      Empleado empleado;

      empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);

      //por el polimorfismo como apunta a un espacio en memoria que e shijo ejecuta 
      //el metodo de hijo ya que es lo mas exterior posible
      System.out.println(empleado.obetenerDetalles());

      //pero como empezamos partiendo de un objeto padre no podemos hacer uso de 
      //los metodos especiales del hijo, por ende debemos castearlo para que los pueda usar 
      //DOWNCASTING
      //asi:
      //((Escritor)empleado).getTipoEscritura();
      //o asi haciendo una variable de tipo escritor
      Escritor escritor = (Escritor)empleado;
      escritor.getTipoEscritura();

      //aqui la variable de tipo Empleado la apuntamos a un tipo hijo sin problemas
      //y podemos hace uso de los metodos del padre
      //UPCASTING
      Empleado empleado2 = escritor;
      System.out.println(empleado2.obetenerDetalles());
      
    }
}
