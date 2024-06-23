package accesodatos;

//obligamos a que las clases implementen los metodos que tienen 
//las interfaces 
public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void analizar() {
        System.out.println("Analizar desde Mysql");
    }
}
