package test;

import javax.persistence.*;

import org.apache.logging.log4j.*;

import mx.com.gm.sga.domain.Persona;

public class ClienteEntidadTest {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args){
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
      EntityManager em = emf.createEntityManager();
      EntityTransaction tx = em.getTransaction();

      //Inicia la transaccion 
      tx.begin();
      //no se debe especificar el ID de la bas de datos
      Persona persona1 = new Persona("Maria", "Gutierrez", "gmaria@mail.com", "5577779999");
      log.debug("objeto a persistir" + persona1);
      //persistimos el objeto
      em.persist(persona1);
      //terminamos la transaccion 
      //esto lo hacemos para que si se guarden los datos 
      tx.commit();
      log.debug("objeto persistido" + persona1);
      em.close();
    }
}
