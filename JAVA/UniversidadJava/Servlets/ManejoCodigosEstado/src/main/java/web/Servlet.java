package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
      //simulando los valores correctos
      String usuarioOk = "Juan";
      String passwordOk = "123";

      String usuario = request.getParameter("usuarioVal");
      String password = request.getParameter("password");

      PrintWriter out = response.getWriter();

      if (usuarioOk.equals(usuario) && passwordOk.equals(password)) {
        
        out.print("<h1>Datos correctos</h1>");
        out.print("Usuario: " + usuario);
        out.print("<br>Password: " + password);
      }else{
        //si no es correcto el usuario y la contraseña el servidor le informara
        //que las credenciales no son cotrrectas
        response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        System.out.println(usuario);
        System.out.println(password);
      }
    }
}
