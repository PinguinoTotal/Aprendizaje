package enumeracion;

public enum Continentes {
  //puede tener más elementos que entran a los enumerados 
    AFRICA(53), //en los () van el numero paises que tienen
    EUROPA(46), 
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int paises;

    Continentes(int paises){
      this.paises = paises;
    }

    public int getPaises(){
      return this.paises;
    }
}
