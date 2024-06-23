package datos;

import java.sql.*;
import java.util.*;

import domain.UsuarioDTO;

import java.sql.SQLException;

public class UsuarioDaoJDBC implements IUsuarioDAO{
  Connection conexionTransaccional = null;

  private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
  private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";
  private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?;";
  private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?;";

  public UsuarioDaoJDBC() {
  }

  public UsuarioDaoJDBC(Connection conexionTransaccional) {
    this.conexionTransaccional = conexionTransaccional;
  }

  public List<UsuarioDTO> seleccionar() throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    UsuarioDTO usuario = null;
    List<UsuarioDTO> usuarios = new ArrayList<>();
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();

      while (rs.next()) {
        int idUsuario = rs.getInt("id_usuario");
        String nombreUsuario = rs.getString("usuario");
        String password = rs.getString("password");
        usuario = new UsuarioDTO(idUsuario, nombreUsuario, password);
        usuarios.add(usuario);
      }
    } finally {
      try {
        Conexion.close(rs);
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return usuarios;
  }

  public int insertar(UsuarioDTO usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;
    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      registros = stmt.executeUpdate();

    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }
    }

    return registros;
  }

  public int actualizar(UsuarioDTO usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, usuario.getNombreUsuario());
      stmt.setString(2, usuario.getPassword());
      stmt.setInt(3, usuario.getIdUsuario());
      registros = stmt.executeUpdate();
    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;

  }

  public int eliminar(UsuarioDTO usuario) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    int registros = 0;

    try {
      conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, usuario.getIdUsuario());
      registros = stmt.executeUpdate();
    } finally {
      try {
        Conexion.close(stmt);
        if (this.conexionTransaccional == null) {
          Conexion.close(conn);
        }
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);
      }

    }
    return registros;
  }

}
