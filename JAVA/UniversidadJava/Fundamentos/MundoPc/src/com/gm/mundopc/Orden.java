package com.gm.mundopc;

public class Orden {
  private int idOrden;
  private Computadora computadoras[];
  private int contadorComputadoras;
  private static int contadorOrdenes;
  private static final int maxComputadoras = 10;

  public Orden(){
    this.idOrden = ++Orden.contadorOrdenes;
    this.computadoras = new Computadora[maxComputadoras];
  }

  public void agregarComputadora(Computadora computadora){
    if (contadorComputadoras < maxComputadoras) {
      computadoras[contadorComputadoras++] = computadora;
    }
  }

  public void mostrarOrden(){
    System.out.println("imprimiendo orden " + idOrden);
    for (int i = 0; i < contadorComputadoras; i++) {
      System.out.println(computadoras[i].toString());
    }
  }

  public int getIdOrden() {
    return idOrden;
  }
}
