//DAO = DATA ACCES OBJECT
package datos;
//reasliza las operaciones de insert, update o delete 

//sobre la tabla de persona 

import java.sql.*;
import java.util.*;

import domain.Persona;
import java.sql.SQLException;

public class PersonaDAO {

  private Connection conexionTransaccional;

  private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
  private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
  private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
  private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?;";


  public PersonaDAO(){
  }

  //la unica diferencia es que esta conexion no se 
  //va a cerra al terminanr los metodos si no que se 
  //mantendra abierta y la transaccion sera por afuera de la clase
  //y la clase externa decide cuando terminar conexion, hacer commit y rollback
  public PersonaDAO(Connection conexionTransaccional){
    this.conexionTransaccional = conexionTransaccional;
  }

  //y reportamos que arroje una excepcion para que la procese
  //el script que ivoque esta clase, esta clase no debe procesar
  //las excepciones, si no que las propague 
  public List<Persona> seleccionar() throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Persona persona = null;
    List<Persona> personas = new ArrayList<>();
    try {
      //como abrimos y cerramos conecciones no es posible
      //hacer transacciones y hacer comits o rollbacks por dende
      //resivimos una conneccion externa
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idPersona = rs.getInt("id_persona");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");

        
        persona = new Persona(idPersona, nombre, apellido, email, telefono);

        personas.add(persona);
      }
    } //quitamos el bloque catch para que el error bote en 
      //la clase que llama a esta clase y se pueda crear el 
      //rollback 
     finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          // si la coneccion no fue de la transaccional 
          //hay que cerrarla despues de llamar al metodo
          Conexion.close(conn);
        }
        
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return personas;
  }

  public int insertar(Persona persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      //como abrimos y cerramos conecciones no es posible
      //hacer transacciones y hacer comits o rollbacks por dende
      //resivimos una conneccion externa
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      registros = stmt.executeUpdate();

    } //quitamos el bloque catch para que el error bote en 
    //la clase que llama a esta clase y se pueda crear el 
    //rollback 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          // si la coneccion no fue de la transaccional 
          //hay que cerrarla despues de llamar al metodo
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(Persona persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      //como abrimos y cerramos conecciones no es posible
      //hacer transacciones y hacer comits o rollbacks por dende
      //resivimos una conneccion externa
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      stmt.setInt(5, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } //quitamos el bloque catch para que el error bote en 
    //la clase que llama a esta clase y se pueda crear el 
    //rollback 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          // si la coneccion no fue de la transaccional 
          //hay que cerrarla despues de llamar al metodo
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(Persona persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      //como abrimos y cerramos conecciones no es posible
      //hacer transacciones y hacer comits o rollbacks por dende
      //resivimos una conneccion externa
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } 
    //quitamos el bloque catch para que el error bote en 
    //la clase que llama a esta clase y se pueda crear el 
    //rollback 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          // si la coneccion no fue de la transaccional 
          //hay que cerrarla despues de llamar al metodo
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
