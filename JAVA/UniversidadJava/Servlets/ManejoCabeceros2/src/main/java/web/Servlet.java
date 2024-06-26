package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SerletHeaders")
public class Servlet extends HttpServlet{
    
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String metodoHttp = request.getMethod();

    out.print("<html>");
    out.print("<head>");
    out.print("<title>Headers http</title>");
    out.print("</head>");

    out.print("<body>");
    out.print("<h1>Headers http</h1>");

    out.print("Metodo http: " + metodoHttp);

    out.print("<br>");
    String uri = request.getRequestURI();
    out.print("Uri solicitada: " + uri);

    //imprimir todos los cabeceros
    out.print("<br>");
    out.print("<br>");
    out.print("<h2>Todos los cabeceros</h2>");
    Enumeration cabeceros = request.getHeaderNames();
    while (cabeceros.hasMoreElements()) {
      String nombreCabecero =(String) cabeceros.nextElement();
      out.print("<b>" + nombreCabecero + "</b>");
      out.print(request.getHeader(nombreCabecero));
      out.print("<br>");
    }

    out.print("</body>");
    out.print("</html>");
    out.close();
  }
}
