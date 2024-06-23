package mx.com.gm.mundopc;

public class Monitor {
  private final int idMonitor;
  private String marca;
  private double tamano;
  private static int contadorMonitores;

  private Monitor() {
    this.idMonitor = ++Monitor.contadorMonitores;
  }

  public Monitor(String marca, double tamano) {
    this();
    this.marca = marca;
    this.tamano = tamano;
  }

  public int getIdMonitor() {
    return idMonitor;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public double getTamano() {
    return tamano;
  }

  public void setTamano(double tamano) {
    this.tamano = tamano;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Monitor{");
    sb.append("idMonitor=").append(idMonitor);
    sb.append(", marca=").append(marca);
    sb.append(", tamaño=").append(tamano);
    sb.append('}');
    return sb.toString();
  }
}
