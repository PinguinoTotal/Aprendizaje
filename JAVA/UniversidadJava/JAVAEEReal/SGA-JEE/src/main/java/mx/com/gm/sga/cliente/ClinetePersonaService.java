package mx.com.gm.sga.cliente;

import java.util.List;

import javax.naming.*;

import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClinetePersonaService {
  public static void main(String[] args) {
    System.out.println("iniciando llamada al EJB desde el cliente\n");
    try {
      Context jndi = new InitialContext();
      PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/SGA-JEE/PersobaServiceImpl");

      List<Persona> personas = personaService.listarPersonas();

      System.out.println("las personas que estan en la lista son:");

      for (Persona persona : personas) {
        System.out.println(persona);
      }
    } catch (NamingException e) {
      e.printStackTrace(System.out);
    }
    
  }
}
