package excepcion;

//creando nuestra propia excepcion 
public class OperacionExcepcion extends Exception{
    public OperacionExcepcion(String mensaje){
      super(mensaje);
    }
}
