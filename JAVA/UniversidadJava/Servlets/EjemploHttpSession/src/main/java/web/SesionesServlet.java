package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      response.setContentType("text/html;charset=UTF-8");

      //con esto pedimos la sesion del que pide el servlet, si esta no se encuentra 
      //este mismo codigo va a crear una sesion sin necesidad de verificar nada 
      //de otra manera 
      HttpSession sesion = request.getSession();

      String titulo = null;

      //pedir el atributo contadorVisitas a la sesion 
      Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
      //si es nulo es la priemra vez que accedemos a la aplicacion 
      if (contadorVisitas == null) {
        contadorVisitas = 1;
        titulo = "Bienvenido por primera vez";
      }else{
        contadorVisitas++;
        titulo = "Bienvenido nuevamente";

      }

      //agregamos el valor a la sesion 
      //si no existe crea este valor, si ya existe solo lo reemplaza
      sesion.setAttribute("contadorVisitas", contadorVisitas);

      //mandamos la respuesta al cliente
      PrintWriter out = response.getWriter();
      out.print(titulo);
      out.print("<br>");
      out.print("no. accesos al recurso: " + contadorVisitas);
      out.print("<br>");
      out.print("ID de la sesion: " + sesion.getId());
    }
}
