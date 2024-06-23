package domain;

//la clase debe ser abstact aunque sea que uno solo de sus metodos sea abstracto
public abstract class FiguraGeometrica {
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura){
      this.tipoFigura = tipoFigura;
    }

    //los metodos abstactos no necesitan definir los metodos 
    //solo los crean para que sus hijos los usen y los hijos
    //son los que implementan los metodos en sus propios codigos
    public abstract void dibujar();
}
