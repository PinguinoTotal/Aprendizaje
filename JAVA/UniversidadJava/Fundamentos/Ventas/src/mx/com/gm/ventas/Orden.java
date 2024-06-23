package mx.com.gm.ventas;

public class Orden {
  private int idOrden;
  //dando solo el espacio en memoria
  //esto hace que su valor sea null porque aun no esta siendo inicializada
  //ni tampoco se le pueden meter valores
  private Producto productos[];
  private static int contadorOrdenes;
  private int punteroOrden;   
  private final static int MAX_PRODUCTOS = 10;

  public Orden() {
    this.idOrden = ++contadorOrdenes;
    //inicializando el array
    this.productos = new Producto[Orden.MAX_PRODUCTOS];
    System.out.println("orden creada: "+idOrden);
  }
  
  public void agregarProducto(Producto producto){
    if (this.punteroOrden < Orden.MAX_PRODUCTOS) {
      this.productos[this.punteroOrden++] = producto;
    }else{
      System.out.println("se ha sueprado el maximo de productos: "+punteroOrden);
    }
  }

  public double calcularTotal(){
    double resultado = 0;
    for (int i = 0; i < this.punteroOrden; i++) {
      resultado += this.productos[i].getPrecio();
    }
    return resultado;
  }

  public void mostrarOrden(){
    System.out.println("Productos de la orden ");
    for (int i = 0; i < this.punteroOrden; i++) {
      System.out.println(this.productos[i].toString());
    }
    System.out.println("Total: "+this.calcularTotal());
  } 
}
