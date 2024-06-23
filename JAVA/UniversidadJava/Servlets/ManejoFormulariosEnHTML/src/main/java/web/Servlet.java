package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
  
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    //tomando los valores que fueron metidos por el usuario
    String usuario = request.getParameter("usuario");
    String password = request.getParameter("password");
    String tecnologias[] = request.getParameterValues("tecnologia");
    String genero = request.getParameter("genero");
    String ocupacion = request.getParameter("ocupacion");
    String musica[] = request.getParameterValues("musica");
    String comentario = request.getParameter("comentarios"); 

    out.print("<html>");
    out.print("<head>");
    out.print("<title>Resultado Servlet</title>");
    out.print("</head>");

    out.print("<body>");
    out.print("<h1>Parametro procesados por el Servlet</h1>");
    out.print("<table border='1'>");

    out.print("<tr>");
    out.print("<td>Usuario</td>");
    out.print("<td>");
    out.print(usuario);
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Password</td>");
    out.print("<td>");
    out.print(password);
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Tecnologias</td>");
    out.print("<td>");
    for (String tecnologia : tecnologias) {
      out.print(tecnologia);
      out.print(" / ");
    }
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Género</td>");
    out.print("<td>");
    out.print(genero);
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Ocupacion</td>");
    out.print("<td>");
    switch (Integer.parseInt(ocupacion)) {
      case 1:
        out.print("Profesor");
        break;
      
      case 2:
        out.print("Ingeniero");
        break;
      
      case 3:
        out.print("Jubilado");
        break;

      case 4:
        out.print("Otro");
        break;
    
      default:
        out.print("Dato no valido, revisar codigo");
        break;
    }
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Musica Favorita</td>");
    out.print("<td>");

    if (musica != null) {
      for (String musicaSola : musica) {
        out.print(musicaSola);
        out.print(" / ");
      }
    } else{
      out.print("musica favorita no proporcionada");
    }
    
    out.print("</td>");
    out.print("</tr>");

    out.print("<tr>");
    out.print("<td>Comentarios</td>");
    out.print("<td>");
    if (comentario!=null) {
      out.print(comentario);
    }else{
      out.print("no se ha dejado un comentario");
    }
    
    out.print("</td>");
    out.print("</tr>");
  
  
    out.print("</table>");
    out.print("</body>");
    out.print("</html>");
  }
}
