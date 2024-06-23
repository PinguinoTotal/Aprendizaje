package accesodatos;

public interface IAccesoDatos {
  //las clases son las que integran las interfaces 

  //las interfaecs no tienen constructores y los metodos deben 
  //ser publicos y abstractos
    int MAX_REDISTRO = 10;

    void insertar();

    void listar();

    void actualizar();

    void analizar();
}
