package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

import mx.com.gm.sga.domain.Persona;

@Stateless
public class PersobaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juan","Perez","JPerez@mail.com", "5511448866"));
        personas.add(new Persona(2,"Marta","Suarez","MSuarez@mail.com", "5511448855"));
        personas.add(new Persona(3,"Raul","Hernandez","RHernandez@mail.com", "5511448844"));

        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return null;
    }

    @Override
    public Persona encontarPersonaPorEmail(Persona persona) {
      return null;
    }

    @Override
    public void registratPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
}
