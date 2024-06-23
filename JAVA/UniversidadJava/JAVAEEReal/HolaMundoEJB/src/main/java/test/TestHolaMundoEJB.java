package test;

import javax.naming.*;
import beans.HolaMundoEjbRemote;

public class TestHolaMundoEJB {
    public static void main(String[] args) {
      System.out.println("iniciando llamada al EJB desde el cliente \n");
      try {
        //lo conectamos con el jndi
        Context jndi = new InitialContext();
        //lollamamos con el nombre que se nos dio para llamarlo desde el servidor que ya esta colgado
        HolaMundoEjbRemote holaMundoEJB =(HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMudnoEjbImpl!beans.HolaMundoEjbRemote");
        
        //es importante hacer que el servidor ya este arriba para que se pueda acceder al EJB
        //y ya se puedan usar sus metodos (visto en clase 301)
        int resultado = holaMundoEJB.sumar(5, 3);
        System.out.println("Resultado EJB suma 5+3: " + resultado);

        
        //hacemos un try catch porque puede generarnos un error de NamingException
      } catch (NamingException e) {
        e.printStackTrace(System.out);
      }
    }
}
