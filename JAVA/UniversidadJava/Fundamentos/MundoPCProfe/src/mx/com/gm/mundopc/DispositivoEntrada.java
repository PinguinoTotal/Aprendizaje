package mx.com.gm.mundopc;

public class DispositivoEntrada {
  private String entrada;
  private String marca;

  public DispositivoEntrada(String entrada, String marca) {
    this.entrada = entrada;
    this.marca = marca;
  }

  public String getEntrada() {
    return this.entrada;
  }

  public void setEntrada(String entrada) {
    this.entrada = entrada;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("DispositivoEntrada{");
    sb.append("entrada=").append(entrada);
    sb.append(", marca=").append(marca);
    sb.append('}');
    return sb.toString();
  }
}
