package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//este es el nombre con el cual sera llamado el servlet
//esto es puesto en el action por parte del form 
@WebServlet("/Servlet")
//para que esta clase realmente sea un servlet, forzosamente 
//debe extender de HttpServlet
public class Sevlet extends HttpServlet {
    
    @Override
    //debeos sobreescribir el metodo doPost de esta manera porque estas son las 
    //cosas que se necesitan para hacer la peticion, pero tambien sobreescribimos
    //el metodo doPost porque es el que estamos llamando en el formulario
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //ahora porcesamos los parametros que nos manda el formulario y le mandamos una respuesta

        //LEER LOS PARAMETROS DEL FORMUARIO HTML
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        //esto lo va a imprimir dentro de la consola de glasfish
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);

        PrintWriter out = response.getWriter();
        //se puede manejar codigo html, pero no es lo mejor 
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: " + usuario);
        out.print("<br>");
        out.print("El parametro password es: " + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
