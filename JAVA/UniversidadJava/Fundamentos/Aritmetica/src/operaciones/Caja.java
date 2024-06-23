package operaciones;

public class Caja {
  int ancho;
  int alto;
  int profundo;

  Caja(){
    System.out.println("inicializando vacio");
  }

  Caja(int ancho, int alto, int profundo){
    this.ancho = ancho;
    this.alto = alto;
    this.profundo = profundo;
  }

  public void calcularVolumen(){
    System.out.println("El ancho de la caja es: " +ancho);
    System.out.println("El alto de la caja es: " +alto);
    System.out.println("El profundo de la caja es: " +profundo);
    System.out.println("El volumen de la caja es: " + (ancho*alto*profundo));
  }
}
