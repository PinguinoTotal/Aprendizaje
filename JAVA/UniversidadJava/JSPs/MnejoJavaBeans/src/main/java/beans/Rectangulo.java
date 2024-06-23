//los java beans son clases de java echas beans 
//tiene varios requerimientos minimos que se veran ahora
package beans;

public class Rectangulo {
    //debe tener propiedades privadas
    private int base;
    private int altura;

    //debe teenr un constructor vacio siempre, pero como 
    //no estamos agregando una sobrecarga al constructor entonces 
    //se agrega el constructor vacio por dedault

    //se necesitan metodos seteres y geters para cada una de las propiedades
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //hasta aqui ya se considera un java bean

    public int getArea(){
      return this.base * this.altura;
    }

}
