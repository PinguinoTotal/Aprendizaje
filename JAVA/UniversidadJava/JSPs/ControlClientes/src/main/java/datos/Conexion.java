package datos;

import java.sql.*;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/control_clientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";

    private static BasicDataSource dataSource;

    public static DataSource getDataSource(){
      if (dataSource == null) {
        dataSource = new BasicDataSource();
        dataSource.setUrl(JDBC_URL);
        dataSource.setUsername(JDBC_USER);
        dataSource.setPassword(JDBC_PASSWORD);
        //le damos 50 hilos por los cuales conectarse 
        dataSource.setInitialSize(50);
      }
      
      return dataSource;
    }

    //para mejorar este codigo ponemos esto: OPTIMIZACION
    //ya que siempre que poniamos getDataSource se crea un data source nuevamente 
    //y solicitamos 50 conexiones por cada conexion que creamos

    public static Connection getConnection() throws SQLException{
      return getDataSource().getConnection();
    }

    public static void close(ResultSet rs){
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace(System.out);
      }
    }

    public static void close(PreparedStatement stmt){
      try {
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace(System.out);
      }
    }

    public static void close(Connection conn){
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace(System.out);
      }
    }
}
