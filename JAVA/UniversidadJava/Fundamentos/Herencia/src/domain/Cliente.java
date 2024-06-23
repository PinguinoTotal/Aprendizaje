package domain;

import java.time.LocalDate;

public class Cliente extends Persona {
  private int idCliente;
  private static int contadorCliente;
  private LocalDate fechaRegistro;
  private boolean vip;

  public Cliente(LocalDate fechaRegistro, String nombre, char genero, int edad, String direccion, boolean vip) {
    /*
    es importante que la primer linea de un constructor que tiene padre pongamos
    "super" ya que siempre por detras del programa este corre super y si no lo
    definimos nosotros, se definira por default y generara conflicto en el 
    programa 
    */
    super(nombre, genero, edad, direccion);
    this.idCliente = contadorCliente;
    Cliente.contadorCliente++;
    this.fechaRegistro = fechaRegistro;
    this.vip = vip;
  }

  public int getIdCliente() {
    return idCliente;
  }

  public LocalDate getFechaRegistro() {
    return fechaRegistro;
  }

  public void setFechaRegistro(LocalDate fechaRegistro) {
    this.fechaRegistro = fechaRegistro;
  }

  public boolean isVip() {
    return this.vip;
  }

  public void setVip(boolean vip) {
    this.vip = vip;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Cliente{");
    sb.append("idCliente=").append(idCliente);
    sb.append(", fechaRegistro=").append(fechaRegistro);
    sb.append(", vip=").append(vip);
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }

}
