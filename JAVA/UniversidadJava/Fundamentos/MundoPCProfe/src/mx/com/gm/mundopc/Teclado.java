package mx.com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
  private final int idTeclado;
  private static int contadorTeclados;

  public Teclado(String entrada, String marca) {
    super(entrada, marca);
    this.idTeclado = ++Teclado.contadorTeclados;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Teclado{");
    sb.append("idTeclado=").append(idTeclado);
    sb.append(", ").append(super.toString());
    sb.append('}');
    return sb.toString();
  }
}
