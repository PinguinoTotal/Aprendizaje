package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GenereacionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
      //aqui se le pone con que tipo de archivo s ele va a responder
      response.setContentType("application/vnd.ms-excel");
      //con esto le damos a entender que cuando pulsemos el link este 
      //va a descargar el archivo excel
      response.setHeader("Content-Disposition", "arratchment/filename=excelEjemplo.xls");
      //pasa uso más profesional de excel poi.apache org

      //hacer que no guarde informacion previa, que no se guarde cache en el navegador
      response.setHeader("Pragma", "no-cache");
      response.setHeader("Chache-Control", "no-store");
      //hacer que expire inmediatamante
      response.setDateHeader("Expires", -1);

      //desplegamos la informacion al cliente
      PrintWriter out = response.getWriter();
      //los \t son tabuladroes
      //en una celda ponemos el valor = "Valores"
      out.println("\tValores");
      //en otra celda ponemos el valor = "1"
      out.println("\t6");
      out.println("\t12");
      //para tener un poco más de 3explicacion ver la clase 212 ya que ahi se 
      //explica muy bien como se "veria" en excel
      out.println("Total\t=SUMA(B2:B3)");
      out.close();
    }
}
