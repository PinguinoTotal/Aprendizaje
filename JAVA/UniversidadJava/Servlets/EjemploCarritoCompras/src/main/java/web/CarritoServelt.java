package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServelt extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html;charset=UTF-8");

    // creamos o recuepramos el objeto http sesion
    HttpSession sesion = request.getSession();

    // recuperamos la lista de articulos agregados anteriormente
    // si existe
    List<String> articulos = (List<String>) sesion.getAttribute("articulos");

    // verificamos si la lista de articulos existe
    if (articulos == null) {
      // inicialiazamos la lista
      articulos = new ArrayList<>();
      sesion.setAttribute("articulos", articulos);
    }

    // procesamos el articulo nuevo
    String articuloNuevo = request.getParameter("articulo");

    // verifiacmos is el articulo nuevo que llega no es null y si no tiene al valor
    // vacio
    if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
      articulos.add(articuloNuevo);
      sesion.setAttribute("articulos", articulos);
    }

    try (// imprimir la lista de articulos
        PrintWriter out = response.getWriter()) {
      out.print("Lista de Articulos");
      out.print("<br>");

      for (String articulo : articulos) {
        out.print("<li>" + articulo + "</li>");
      }
      // agregamos un link para regresar al inicio
      out.print("<br>");
      out.print("<<a href='/EjemploCarritoCompras'> Regresar al inicio</a>>");
    }
  }
}
