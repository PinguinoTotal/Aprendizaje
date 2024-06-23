package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//aqui hacemos que podamos acceder a el servlet
@WebServlet("/HolaMundo")
//los servlets son clases de java solo que extienden de los HttpServlets
public class HolaMundo extends HttpServlet{
    
  /*
  cual es el metodo que vamos a procesar en el servlet?
  si lo llamamos directamente desde el navegador entonces la llamada se conoce como 
  peticion get

  si utilizamos un fopmulario, va a ser una peticion post, va a hacer una peticion 
  de tipo post a nuestro servlet 

  todo esto se puede hacer con el metodo doGet o doPost
  */

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    //le ponemos que tipo de respuesta es la que le vamos a dar
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    //se recominda no responder en html a traves de servlets 
    out.println("Hola Mundo desde Servlets");
  }

  //despues de darle clean and bulid nos genera un archivo .war
}
