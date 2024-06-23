package test;

import java.sql.*;
import java.util.List;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;

public class TestPersonas {
  public static void main(String[] args) {
    // ponemos la conexion aqui para que pueda ser usada
    // por cualquier parte del codigo
    Connection conn = null;
    try {
      // creamos una conexion por fuera de la clase personaDAO
      conn = Conexion.getConection();
      if (conn.getAutoCommit()) {
        // si el autocomit de nuestra conexion es true, la pasamos
        // a false, porque no queremos que haga commit
        conn.setAutoCommit(false);
        // le pasamos la conexion que hicimos por fuera para que pueda
        // hacer uso de las transacciones de rollback y demas
        PersonaDAO personaDao = new PersonaDAO(conn);

        // vamos a hacer cambios en la base de datos que tiene
        // una conexion exterior que le proporcionamos
        Persona cambioPersona = new Persona(2, "karla ivon ", "Gomez", "KGomez@mail.com", "7713445678");
        personaDao.actualizar(cambioPersona);

        // para ver como no se hacen los cambios al hacer un rollback, vamos
        // a desboradar uno de los parametros para que no acepte tantos dijitos
        // y pues si funciono, hace rollback y no se guardan los registros en la
        // bas de datos
        // Persona nuevaPersona = new Persona("Carlos",
        // "Ramirez1111111111111111111111111111111111111111111111111111111111111111",
        // "CRamirez@mail.com", "5544778899");
        // ahora si con datos validos
        Persona nuevaPersona = new Persona("Carlos", "Ramirez", "CRamirez@mail.com", "5544778899");
        personaDao.insertar(nuevaPersona);

        // hasta este momento al hacer commit es cuando se van a hacer los
        // en la base de datos
        conn.commit();
        System.out.println("haciendo comit de la transaccion");
        // con este codigo anterios hacemos que se ejecute un update de manera correcta
        // pero un insert de manera incorrecta haciendo que esto genere un problema
        // y haciendo que nada de esto se aplique por el rollback

        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona : personas) {
          System.out.println(persona);
        }
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
      System.out.println("ha ocurrido un error, haciendo rollback");
      try {
        // hacemos el rollback porque algo ha fallado
        // entonces no guardamos nada de la informacion en
        // la base de datos
        conn.rollback();
        // para que el rollback funcione tenemos que hacer salte
        // el error en esta parte del codigo, por ende
        // debemos quitar las tentencias try catch
        // de las clases de personaDAO.insertar()
      } catch (SQLException ex1) {
        ex1.printStackTrace(System.out);
      }
    }
  }
}
