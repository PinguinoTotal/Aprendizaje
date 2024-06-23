package domain;

public class Rectangulo extends FiguraGeometrica{
    
  public Rectangulo(String tipoFigura){
    super(tipoFigura);
  }

  //no lo estamos sobreescribiendo, lo implementamos por primera vez
  //porque el padre lo pone, pero no lo define
  @Override 
  public void dibujar(){
    System.out.println("se imprime un: " + this.getClass().getSimpleName());
  }
}
