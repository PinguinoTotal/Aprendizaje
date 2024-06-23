package test;

import java.sql.*;

public class TestMySqlJDBC {
  public static void main(String[] args) {
    //con esta liena hacemos el link con la base de datos que ya tenemos echa
    String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrival=true";
      try {
          //hacemos la coneccion mediante la url que ya le pasamos anteriormente
          Connection conexion = DriverManager.getConnection(url, "root", "admin");
          //creamos un statement para darle ordenes a la base de datos
          Statement instruccion = conexion.createStatement();
          //la linea de "codigo" de sql que le vamos a pasar a la base de datos
          var sql = "SELECT id_persona, nombre,apellido, email, telefono FROM persona";
          //mandar la orden a la base de datos
          ResultSet resultado = instruccion.executeQuery(sql);
          //aqui vemos todos los resultados hasta que se termine la base de datos
          while (resultado.next()) {
            //con resultado.getInt se toma el valor de la base de datos, pero dentro de 
            //los parentesis puede ir su index (que puede cambiar en cualqueir momento)
            //por ende es mejor usar el nombre del campo
            System.out.println("--------------------------------------------------------------");
            System.out.println("Id persona : " + resultado.getInt("id_persona"));
            System.out.println("Nombre : " + resultado.getString("nombre"));
            System.out.println("Apellido : " + resultado.getString("apellido"));
            System.out.println("Email : " + resultado.getString("nombre"));
            System.out.println("Telefono : " + resultado.getString("telefono"));
          }
          //cerrando todos los parametros que abrimos
          resultado.close();
          instruccion.close();
          conexion.close();
      } catch (SQLException ex) {
        ex.printStackTrace(System.out);    
      }
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
      ex.printStackTrace(System.out);
    }
  }
}
