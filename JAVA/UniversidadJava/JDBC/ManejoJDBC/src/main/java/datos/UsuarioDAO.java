//DAO = DATA ACCES OBJECT
package datos;
//reasliza las operaciones de insert, update o delete 

//sobre la tabla de usuario 

import java.sql.*;
import java.util.*;

import domain.Usuario;

import java.sql.SQLException;

public class UsuarioDAO {
  private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
  private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
  private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?;";
  private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?;";

  public List<Usuario> seleccionar() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Usuario usuario = null;
    List<Usuario> usuarios = new ArrayList<>();
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
        int idUsuario = rs.getInt("id_usuario");
        String nombreUsuario = rs.getString("usuario");
        String password = rs.getString("password");

        // con los datos que nos proporciona la base de datos inicializamos
        // objetos de la clase usuario
        usuario = new Usuario(idUsuario, nombreUsuario, password);

        usuarios.add(usuario);
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
    return usuarios;
  }

  public int insertar(Usuario usuario) {
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
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
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

  public int actualizar(Usuario usuario) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      // haciendo la conexion
      conn = Conexion.getConection();
      // cargando el comando
      stmt = conn.prepareStatement(SQL_UPDATE);
      // configurando el comando
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      stmt.setInt(3, usuario.getIdUsuario());
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

  public int eliminar(Usuario usuario) {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      // haciendo la conexion
      conn = Conexion.getConection();
      // cargando el comando
      stmt = conn.prepareStatement(SQL_DELETE);
      // configurando el comando
      stmt.setInt(1, usuario.getIdUsuario());
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

