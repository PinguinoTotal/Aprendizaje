//DAO = DATA ACCES OBJECT
package datos;
//reasliza las operaciones de insert, update o delete 

//sobre la tabla de persona 

import java.sql.*;
import java.util.*;

import domain.Persona;
import java.sql.SQLException;

public class PersonaDAO {
  private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
  private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
  private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
  private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?;";

  public List<Persona> seleccionar() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Persona persona = null;
    List<Persona> personas = new ArrayList<>();
    try {
      // creamos la conexion con la base de datos
      conn = Conexion.getConection();
      // creamos el statement para dar instrucciones y pasarle el comando
      stmt = conn.prepareStatement(SQL_SELECT);
      // aplicamos el comando y vemos que nos devuelve la base de datos
      // esto solo le dara a rs una pequeña base de datos que
      // tienen lineas de la base de datos
      // execute query es de tipo consulta
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idPersona = rs.getInt("id_persona");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");

        // con los datos que nos proporciona la base de datos inicializamos
        // objetos de la clase persona
        persona = new Persona(idPersona, nombre, apellido, email, telefono);

        personas.add(persona);
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return personas;
  }

  public int insertar(Persona persona) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      // hacemos la conexion
      conn = Conexion.getConection();
      // cargamos el comando que le mandaremos, pero
      // esta vez contiene variables que son las ?
      stmt = conn.prepareStatement(SQL_INSERT);
      // en el registro 1 donde esta la ? cambiamo el valor por:
      // es importante decir que en sql empiezan desde 1 y no desde 0
      // y los numeros de index a continuacion, son los numeros que se
      // pondran en la sentencia string SQL_INSERT como vienen en la
      // sentencia
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      // executeUpdate es de metodo sentencia, puede hacer
      // update, delete, insert
      registros = stmt.executeUpdate();

    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(Persona persona) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      // haciendo la conexion
      conn = Conexion.getConection();
      // cargando el comando
      stmt = conn.prepareStatement(SQL_UPDATE);
      // configurando el comando
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      stmt.setInt(5, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(Persona persona) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      // haciendo la conexion
      conn = Conexion.getConection();
      // cargando el comando
      stmt = conn.prepareStatement(SQL_DELETE);
      // configurando el comando
      stmt.setInt(1, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
    } finally {
      try {
        Conexion.close(stmt);
        Conexion.close(conn);
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
