package test;

import orden.Orden;
import orden.Producto;

public class VentasTest {
  public static void main(String[] args) {
    Orden orden1 = new Orden();
    orden1.agregarProducto(new Producto("Jeans rectos Lavado medio", 88));
    orden1.agregarProducto(new Producto("Joggers con aplicacion del logo", 84));
    orden1.agregarProducto(new Producto("Chandal con icono clásico", 74));
    orden1.agregarProducto(new Producto("Jeans Super Slim Lavado oscuro", 88));
    orden1.agregarProducto(new Producto("Calcetines casual a rallas", 16));
    orden1.agregarProducto(new Producto("Calcetines casual", 16));

    orden1.mostrarOrden();
  }
}
