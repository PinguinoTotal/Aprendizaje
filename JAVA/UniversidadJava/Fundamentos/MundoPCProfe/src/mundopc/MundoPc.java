package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPc {
  public static void main(String[] args) {
    Monitor monitoHP = new Monitor("HP", 13);
    Teclado tecladoHP = new Teclado("bluetooth", "HP");
    Raton ratonHP = new Raton("bluetooth", "Hp");
    Computadora computadoraHP = new Computadora("ComputadoraHP", monitoHP, tecladoHP, ratonHP);

    Monitor monitoGamer = new Monitor("Gamer", 13);
    Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
    Raton ratonGamer = new Raton("bluetooth", "Gamer");
    Computadora computadoraGamer = new Computadora("ComputadoraGamer", monitoGamer, tecladoGamer, ratonGamer);

    Orden orden1 = new Orden();
    orden1.agregarComputadora(computadoraHP);
    orden1.agregarComputadora(computadoraGamer);

    orden1.mostrarOrden();
  }
}
