package datos;

import java.sql.*;
import java.util.*;

import domain.PersonaDTO;
import java.sql.SQLException;

//la clase implementa una interaface por si otra clase tambien quieran
//implementar la interface pero con otra tecnologia como jpa un api
public class PersonaDaoJDBC implements IPersonaDAO{


  private Connection conexionTransaccional;

  private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
  private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
  private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
  private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?;";


  public PersonaDaoJDBC(){
  }

  public PersonaDaoJDBC(Connection conexionTransaccional){
    this.conexionTransaccional = conexionTransaccional;
  }
  public List<PersonaDTO> seleccionar() throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    PersonaDTO persona = null;
    List<PersonaDTO> personas = new ArrayList<>();
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idPersona = rs.getInt("id_persona");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");

        
        persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono);

        personas.add(persona);
      }
    } 
     finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
        
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return personas;
  }

  public int insertar(PersonaDTO persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      registros = stmt.executeUpdate();

    } 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(PersonaDTO persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, persona.getNombre());
      stmt.setString(2, persona.getApellido());
      stmt.setString(3, persona.getEmail());
      stmt.setString(4, persona.getTelefono());
      stmt.setInt(5, persona.getIdPersona());
      registros = stmt.executeUpdate();
    }  
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(PersonaDTO persona) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, persona.getIdPersona());
      registros = stmt.executeUpdate();
    } 
     finally {
      try {
        Conexion.close(stmt);
        if ( this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
