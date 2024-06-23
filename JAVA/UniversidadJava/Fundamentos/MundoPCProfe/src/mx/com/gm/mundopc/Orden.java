package mx.com.gm.mundopc;

public class Orden {
  private final int idOrden;
  private Computadora computadoras[];
  private static int contadorOrdenes;
  private static final int maxComputadoras = 10;
  private int contadorComputadoras;

  public Orden() {
    this.idOrden = ++Orden.contadorOrdenes;
    this.computadoras = new Computadora[Orden.maxComputadoras];
  }

  public void agregarComputadora(Computadora computadora) {
    if (this.contadorComputadoras < Orden.maxComputadoras) {
      this.computadoras[this.contadorComputadoras++] = computadora;
    }else{
      System.out.println("has superado el limite: " + Orden.maxComputadoras);
    }
  }

  public void mostrarOrden() {
    System.out.println("imprimiendo orden " + idOrden);
    for (int i = 0; i < this.contadorComputadoras; i++) {
      System.out.println(this.computadoras[i].toString());
    }
  }
}
