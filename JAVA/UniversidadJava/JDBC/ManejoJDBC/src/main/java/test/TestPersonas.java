package test;

import java.util.List;

import datos.PersonaDAO;
import domain.Persona;

public class TestPersonas {
    public static void main(String[] args) {
      PersonaDAO personaDAO = new PersonaDAO();

      imprimeBaseDeDatos(personaDAO);

      //insertando un nuevo objeto persona en la base de datos
      Persona persona = new Persona("Carlos", "Esparza", "cesparza@mail.com", "5544565577");
      personaDAO.insertar(persona);
      imprimeBaseDeDatos(personaDAO);

      System.out.println("==============================");

      //modificaodo un registro que ya existe 
      Persona personaModificar = new Persona(4, "Juan Carlos", "Esparza", "jcesparza@mail.com", "5544565577");
      personaDAO.actualizar(personaModificar);

      imprimeBaseDeDatos(personaDAO);

      //eliminando un registro que ya existe 
      Persona personaEliminar = new Persona(5);
      personaDAO.eliminar(personaEliminar);

      imprimeBaseDeDatos(personaDAO);
    }

    public static void imprimeBaseDeDatos(PersonaDAO personaDAO){
      //aqui ya hacemos que la base de datos
      //nos regrese objetos persona que ya construyo 
      //en la clase PersonaDAO, que a su vez, resibe la 
      //conexion con la base de datos de la clase Conexion
      List<Persona> personas = personaDAO.seleccionar();
      for (Persona persona : personas) {
        System.out.println("persona = " + persona);
      }
    }
}
