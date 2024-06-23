package mx.com.gm.ventas;

public class Producto {
  //lo pone final porque una vez creada, ya no se va a 
  //volver a cambiar de valor 
  private final int idProducto;
  private String nombre;
  private double precio;
  private static int contadorProductos;

  private Producto() {
    idProducto = ++Producto.contadorProductos;
  }

  public Producto(String nombre, double precio) {
    this();
    this.nombre = nombre;
    this.precio = precio;
  }

  public int getIdProducto() {
      return idProducto;
  }

  public String getNombre() {
      return nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public double getPrecio() {
      return precio;
  }

  public void setPrecio(double precio) {
      this.precio = precio;
  }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Producto{");
      sb.append(", nombre=").append(nombre);
      sb.append(", precio=").append(precio);
      sb.append('}');
      return sb.toString();
  }
}
