package test;

import accesodatos.*;

public class TestInterface {
    public static void main(String[] args) {
      //podemos hacer una variable interface que apunta a una
      //clase que implementa esa interface 
      IAccesoDatos datos = new ImplementacionMySql();
      imprimir(datos);

      //y luego la variable interface de tipo IAccesoDatos puede apuntar
      //a un nuevo objeto que la implemente siendo asi que podemos darle 
      //ahora la ImpementacionOracle
      datos = new ImplementacionOracle();
      imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos){
      datos.listar();
      datos.actualizar();
      datos.analizar();
      datos.insertar();
    }
}
