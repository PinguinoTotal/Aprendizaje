package domain;

public class Escritor extends Empleado {
  final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
  
    @Override
    public String obetenerDetalles(){
      return super.obetenerDetalles() + ", tipoEscritura: " + this.tipoEscritura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escritor{");
        sb.append("tipoEscritura=").append(tipoEscritura);
        sb.append(", empleado=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    public TipoEscritura getTipoEscritura(){
      return this.tipoEscritura;
    }
    
    
}
