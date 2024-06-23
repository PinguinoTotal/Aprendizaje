package orden;

public class Orden {
  private final static int MAX_PRODUCTOS = 10;
  private int idOrden;
  private Producto productos[] = new Producto[MAX_PRODUCTOS];
  private static int contadorOrdenes;
  private int punteroOrden;   

  public Orden() {
    idOrden = ++contadorOrdenes;
    System.out.println("orden creada: "+idOrden);
  }
  
  public void agregarProducto(Producto producto){
    productos[punteroOrden] = producto;
    punteroOrden++;
  }

  public double calcularTotal(){
    double resultado = 0;
    for (int i = 0; i < productos.length; i++) {
      if (productos[i]!= null) {
        resultado += productos[i].getPrecio();
      }
    }
    return resultado;
  }

  public void mostrarOrden(){
    System.out.println("Productos              Precio");
    System.out.println("_____________________________");
    for (int i = 0; i < productos.length; i++) {
      if (productos[i]!=null) {
        System.out.println(productos[i].getNombre()+"         "+productos[i].getPrecio());
      }
    }
    System.out.println("_____________________________");
    System.out.println("Total:          "+this.calcularTotal());
  } 
}
