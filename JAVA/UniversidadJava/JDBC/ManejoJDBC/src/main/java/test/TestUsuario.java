package test;

import java.util.List;

import datos.UsuarioDAO;
import domain.Usuario;

public class TestUsuario {
    public static void main(String[] args) {
      UsuarioDAO usuarioDAO = new UsuarioDAO();
      imprimeBaseDeDatos(usuarioDAO);

      //Usuario usuarioAInsertar = new Usuario("juanito", "1547");
      //usuarioDAO.insertar(usuarioAInsertar);
      //imprimeBaseDeDatos(usuarioDAO);

      Usuario usuarioAActualziar = new Usuario(5, "carmelo", "1746");
      usuarioDAO.actualizar(usuarioAActualziar);
      imprimeBaseDeDatos(usuarioDAO);

      Usuario usuarioABorrar = new Usuario(4);
      usuarioDAO.eliminar(usuarioABorrar);
      imprimeBaseDeDatos(usuarioDAO);
    }

    public static void imprimeBaseDeDatos(UsuarioDAO usuarioDAO){
      List<Usuario> usuarios;
      usuarios = usuarioDAO.seleccionar();

      for (Usuario usuario : usuarios) {
        System.out.println(usuario);
      }
      System.out.println("=================================");
    }
}
