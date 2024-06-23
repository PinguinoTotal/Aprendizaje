package test;

import java.sql.*;
import java.util.List;

import datos.Conexion;
import datos.IPersonaDAO;
import datos.PersonaDaoJDBC;
import domain.PersonaDTO;

public class TestPersonas {
  public static void main(String[] args) {
    Connection conn = null;
    try {
      conn = Conexion.getConection();
      if (conn.getAutoCommit()) {
        conn.setAutoCommit(false);

        //como es una interface y PersonaDaoJDBC lo implementa
        //podemos apuntar hacia ese sin problemas
        IPersonaDAO personaDao = new PersonaDaoJDBC(conn);

        List<PersonaDTO> personasDTO = personaDao.seleccionar();
        for (PersonaDTO personaDTO : personasDTO) {
          System.out.println("Persona DTO: " + personaDTO);
        }

        conn.commit();
        System.out.println("haciendo comit de la transaccion");
      }
    } catch (SQLException ex) {
      ex.printStackTrace(System.out);
      System.out.println("ha ocurrido un error, haciendo rollback");
      try {
        conn.rollback();
      } catch (SQLException ex1) {
        ex1.printStackTrace(System.out);
      }
    }
  }
}
