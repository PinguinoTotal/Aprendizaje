package mx.com.gm.sga.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    //con esto le "inyectamos" la clase y una variable Persona Service
    @Inject
    PersonaService personaService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      List<Persona> personas = personaService.listarPersonas();
      System.out.println("Personas: " +personas);
      request.setAttribute("personas", personas);
      request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
    }
}
