package datos;

import java.sql.*;
import java.util.*;
import dominio.Cliente;

public class ClienteDaoJDBC {
  private static final String SQL_SELECT = "SELECT id_cliente, nombre, apellido, email, telefono, saldo "
      + "FROM cliente";

  private static final String SQL_SELECT_BY_ID = "SELECT id_cliente, nombre, apellido, email, telefono, saldo "
      + "FROM cliente WHERE id_cliente = ?";

  private static final String SQL_INSERT = "INSERT INTO cliente(nombre, apellido, email, telefono, saldo) "
      + "VALUES(?, ?, ?, ?, ?)";

  private static final String SQL_UPDATE = "UPDATE cliente "
      + "SET nombre=?, apellido=?, email=?, telefono=?, saldo=? WHERE id_cliente=?";

  private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente = ? ";

  public List<Cliente> listar() {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Cliente cliente = null;

    List<Cliente> clientes = new ArrayList<>();
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_SELECT);
      rs = stmt.executeQuery();
      while (rs.next()) {
        int idcliente = rs.getInt("id_cliente");
        String nombre = rs.getString("nombre");
        String apellido = rs.getString("apellido");
        String email = rs.getString("email");
        String telefono = rs.getString("telefono");
        double saldo = rs.getDouble("saldo");

        cliente = new Cliente(idcliente, nombre, apellido, email, telefono, saldo);
        clientes.add(cliente);
      }
    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(rs);
      Conexion.close(stmt);
      Conexion.close(conn);
    }

    return clientes;

  }

  public Cliente encontrar(Cliente cliente) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
      stmt.setInt(1, cliente.getIdCliente());
      rs = stmt.executeQuery();
      rs.next(); //entrar en la linea a usar

      String nombre = rs.getString("nombre");
      String apellido = rs.getString("apellido");
      String email = rs.getString("email");
      String telefono = rs.getString("telefono");
      double saldo = rs.getDouble("saldo");

      cliente.setNombre(nombre);
      cliente.setApellido(apellido);
      cliente.setEmail(email);
      cliente.setTelefono(telefono);
      cliente.setSaldo(saldo);

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(rs);
      Conexion.close(stmt);
      Conexion.close(conn);
    }

    return cliente;
      
  }

  public int insertar(Cliente cliente) {
    Connection conn = null;
    PreparedStatement stmt = null;
    //como no vamos a sacar info de la base de datos podemso quitar 
    //el result set

    int rows=0;
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_INSERT);
      stmt.setString(1, cliente.getNombre());
      stmt.setString(2, cliente.getApellido());
      stmt.setString(3, cliente.getEmail());
      stmt.setString(4, cliente.getTelefono());
      stmt.setDouble(5, cliente.getSaldo());

      //saber cuantos registros se han modificado
      rows = stmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(stmt);
      Conexion.close(conn);
    }
    return rows;
  }

  public int actualizar(Cliente cliente){
    Connection conn = null;
    PreparedStatement stmt = null;
    //como no vamos a sacar info de la base de datos podemso quitar 
    //el result set

    int rows=0;
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_UPDATE);
      stmt.setString(1, cliente.getNombre());
      stmt.setString(2, cliente.getApellido());
      stmt.setString(3, cliente.getEmail());
      stmt.setString(4, cliente.getTelefono());
      stmt.setDouble(5, cliente.getSaldo());
      stmt.setInt(6, cliente.getIdCliente());

      //saber cuantos registros se han modificado
      rows = stmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(stmt);
      Conexion.close(conn);
    }
    return rows;
  }

  public int eliminar(Cliente cliente){
    Connection conn = null;
    PreparedStatement stmt = null;
    //como no vamos a sacar info de la base de datos podemso quitar 
    //el result set

    int rows=0;
    try {
      conn = Conexion.getConnection();
      stmt = conn.prepareStatement(SQL_DELETE);
      stmt.setInt(1, cliente.getIdCliente());

      //saber cuantos registros se han modificado
      rows = stmt.executeUpdate();

    } catch (SQLException e) {
      e.printStackTrace(System.out);
    } finally {
      Conexion.close(stmt);
      Conexion.close(conn);
    }
    return rows;
  }
}
