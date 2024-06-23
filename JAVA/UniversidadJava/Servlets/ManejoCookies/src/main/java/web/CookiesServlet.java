package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      //supoonemois que el usuario visita por primera vez nuestro sitio
      boolean nuevoUsuario = true;

      //obtenemos el arreglo de cookies
      //obtenemos todas las cookies que tenemos del lado del cliente
      Cookie[] cookies = request.getCookies();

      //buscamos si ya existe una cookie creada con anterioridad
      //llamada visitanteRecurrente

      if (cookies != null) {
        for (Cookie c : cookies) {
          if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
            //si ya existe la cookie es un usuario recurrente
            nuevoUsuario = false;
            break;
          }
        }
      }
      String mensaje = null;
      if (nuevoUsuario) {
        Cookie visitanteRecurrente = new Cookie("visitanteRecurrente", "si");
        response.addCookie(visitanteRecurrente);
        mensaje = "Gracias por visitar nuestro sitio por primera vez";
      }else{
        mensaje = "Gracias por visitar nuevamente nnuetsro sitio";
      }

      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = response.getWriter();

      out.print("Mensaje: " + mensaje);
      out.close();
    }
}
