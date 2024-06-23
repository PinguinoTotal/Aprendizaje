package controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      //1.procesamos los parametros

      //2.creamos los javaBeans
      Rectangulo rec = new Rectangulo(3,6);

      //3.agregamos el javabean a algun alcance
      //es la variable "mensaje" con el valor de "saludos desde el servlet"
      request.setAttribute("mensaje", "saludos desde el servlet");

      //obtenemos la sesion 
      HttpSession sesion = request.getSession();
      sesion.setAttribute("rectangulo", rec);

      //aqui ya tenemos compartido en el scope de sesion la variable rectangulo 

      //4.redireccionar a la vista seleccionada

      //obtenemos la vista a la cual vamos a redireccionar 
      RequestDispatcher rd = request.getRequestDispatcher("vista/desplegarVariables.jsp");

      //propagamos el request y response al dispatcher
      rd.forward(request, response);
    }
}
