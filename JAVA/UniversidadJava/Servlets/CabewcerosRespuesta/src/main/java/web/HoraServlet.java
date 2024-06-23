package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      response.setContentType("text/html;charset=UTF-8");
      //con esto indicamos que se va a refrescar esto cada segundo
      response.setHeader("refresh", "1");
      Date fecha = new Date();
      SimpleDateFormat fomateador= new SimpleDateFormat("'Hola actualizada' HH:mm:ss");
      String horaConFormato = fomateador.format(fecha);
      PrintWriter out = response.getWriter();
      out.print("Hora actualizada: " + horaConFormato);
      out.close();
    }
}