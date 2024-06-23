package datos;

import java.sql.*;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
  private static final String JDBC_USER = "root";
  private static final String JDBC_PASSWORD = "admin";

  //inicialiazando el pool de conexiones 
  public static DataSource getDataSource(){
    BasicDataSource ds = new BasicDataSource();
    //inicialiazando los valores del pool
    ds.setUrl(JDBC_URL);
    ds.setUsername(JDBC_USER);
    ds.setPassword(JDBC_PASSWORD);
    //definimos el tamaño inicial del pool de conexiones
    //tenemos que tener cuidado con cuantos inicializamos
    //ya que esto consume mucha memoria 
    ds.setInitialSize(5);
    return ds;
  }


  public static Connection getConection() throws SQLException {
    return getDataSource().getConnection();
  }

  public static void close(ResultSet rs) throws SQLException {
    rs.close();
  }

  public static void close(Statement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(PreparedStatement smtn) throws SQLException {
    smtn.close();
  }

  public static void close(Connection conn) throws SQLException {
    conn.close();
  }

}
