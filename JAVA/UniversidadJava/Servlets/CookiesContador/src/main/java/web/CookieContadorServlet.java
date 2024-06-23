package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookieContadorServlet")
public class CookieContadorServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      //suponemos que el usuario visita por primera vez nuestro sitio
      int contadorCookie = 0;

      //Obtenemos el arreglo de cookies
      Cookie[] cookies = request.getCookies();

      //buscamos si ya existe una cookie ccreada con anterioridad
      //llamada cookie contador
      
      if (cookies != null) {
        for (Cookie cookie : cookies) {
          if (cookie.getName().equals("contador")) {
            //este usuario ya es recurrente porque tiene una cookie
            contadorCookie = Integer.parseInt(cookie.getValue());
            break;
          }
        }
      }
      //incrementamos en uno el contador
      contadorCookie ++;
      //agregamos la respuesta al navegador
      Cookie c = new Cookie("contador",  Integer.toString(contadorCookie));
      //la cookie se almacenara en el cliente por una hora
      c.setMaxAge(3600);
      response.addCookie(c);

      //mandamos el mensaje al navegador
      response.setContentType("text/html;charset-UTF=8");
      PrintWriter out = response.getWriter();
      out.print("contador de visitas de cada cliente: " + contadorCookie);
      out.close();
    }
}
