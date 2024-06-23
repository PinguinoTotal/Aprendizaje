package beans;

import javax.ejb.Remote;

//con remote glasfish hace que se publique y el cliente pueda usarlo
@Remote
public interface HolaMundoEjbRemote {
   public int sumar(int a, int b);
}
