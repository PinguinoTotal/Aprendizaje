package beans.backing;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import beans.model.Candidato;

@Named
@RequestScoped
public class VacanteForm {

  //hacemos la inyeccion del candidato
  @Inject
  private Candidato candidato;  

  public void setCandidato(Candidato candidato){
    this.candidato = candidato;
  }
    
  public String eviar(){
    if (this.candidato.getNombre().equals("Juan")) {
      //hacemos un redireccionamiento a 
      //exito.html pero no es necesario poner el html
      return "exito";
    }else{
      return "fallo";
    }
  }
}
