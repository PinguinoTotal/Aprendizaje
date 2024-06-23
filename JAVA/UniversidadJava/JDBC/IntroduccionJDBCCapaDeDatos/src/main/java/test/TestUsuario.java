package test;

import java.sql.Connection;

import datos.Conexion;
import datos.IUsuarioDAO;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;
import java.sql.SQLException;
import java.util.List;

public class TestUsuario {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = Conexion.getConection();
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);
        IUsuarioDAO  usuarioDAO = new UsuarioDaoJDBC(conn);

        List<UsuarioDTO> usuarios = usuarioDAO.seleccionar();
        for (UsuarioDTO usuario : usuarios) {
          System.out.println(usuario);
        } 

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
