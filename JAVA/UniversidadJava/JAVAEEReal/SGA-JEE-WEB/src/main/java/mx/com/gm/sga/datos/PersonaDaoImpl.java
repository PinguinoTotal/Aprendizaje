package mx.com.gm.sga.datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import mx.com.gm.sga.domain.Persona;

//lo hacemos un ejb para que se le pueda inyectar el jpa
@Stateless
public class PersonaDaoImpl implements PersonaDao{

  //con esto ya podemos interactuar con nuestr base de datos
  //esto es el jpa que se le inyecta
  @PersistenceContext(unitName = "PersonaPU")  
  EntityManager em;

  @Override
  public List<Persona> findAllPersonas() {
    //usamos el query que ya teniamos declarado en Persona
    return em.createNamedQuery("Persona.findAll").getResultList();
  }

  @Override
  public Persona findPersonaById(Persona persona) {
    return em.find(Persona.class, persona.getIdPersona());
  }

  @Override
  public Persona findPersonaBYEmail(Persona persona) {
    //creamos un query directam,ente en la clase
    Query query = em.createQuery("from Persona p where p.emial =: email");
    //le damos valores a nuestro query
    query.setParameter("email", persona.getEmail());
    return (Persona) query.getSingleResult();
  }

  @Override
  public void insertPersona(Persona persona) {
    em.persist(persona);
  }

  @Override
  public void updatePersona(Persona persona) {
    em.merge(persona);
  }

  @Override
  public void deletePersona(Persona persona) {
    //para quitarlo primero tenemos que ahcer un update 
    em.remove(em.merge(persona));
  }
}
