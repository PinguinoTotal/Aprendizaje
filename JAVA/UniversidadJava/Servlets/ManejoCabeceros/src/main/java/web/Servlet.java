package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//le ponemos nombre a la ruta del servlet
@WebServlet("ServletHeaders")
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
    
    out.print("</body>");
    out.print("</html>");
    out.close();
  }
}
