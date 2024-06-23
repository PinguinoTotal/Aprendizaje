package operaciones;

public class PruebaCaja {
  public static void main(String[] args) {
    Caja caja1 = new Caja();
    caja1.calcularVolumen();

    Caja caja2 = new Caja(3,2,6);
    caja2.calcularVolumen();
  }
}
