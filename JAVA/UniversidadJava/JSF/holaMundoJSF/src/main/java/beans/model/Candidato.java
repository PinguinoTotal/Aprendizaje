package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//le ponemos esto para que peuda ser reconocido por java servlet faces
@Named
//dandole un alcance a este managed bean
@RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
