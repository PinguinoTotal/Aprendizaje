package test;

import java.sql.Connection;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.SQLException;

public class TestUsuario {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = Conexion.getConection();
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
        UsuarioDAO usuarioDAO = new UsuarioDAO(conn);

        Usuario updateUsuario = new Usuario(2, "bebe", "pass");
        usuarioDAO.actualizar(updateUsuario);

        Usuario nuevoUsuario = new Usuario("warTurtle", "terror");
        usuarioDAO.insertar(nuevoUsuario);

        conn.commit();

        System.out.println("commit realizado con exito");
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
      System.out.println("error en la transaccion, haciendo rollback");
        try {
            conn.rollback();
        } catch (SQLException ex1) {
            ex1.printStackTrace(System.out);
        }
    }
  }
}
