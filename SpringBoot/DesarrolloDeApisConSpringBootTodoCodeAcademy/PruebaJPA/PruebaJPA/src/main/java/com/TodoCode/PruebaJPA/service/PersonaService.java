package com.TodoCode.PruebaJPA.service;
import com.TodoCode.PruebaJPA.model.Persona;
import com.TodoCode.PruebaJPA.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersonas() {
        //el metodo find all ya lo implementa hibernate 
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        //el metodo save ya lo tiene Hibernate
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        //lo busca por id y si no lo encuntra regresa null
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
    
    //el id de un objeto nunca deberia cambiar ni crearse de forma manual,
    //pero es posible que esto suceda 

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        //buscar el objeto original
        Persona perso = this.findPersona(idOriginal);
        
        //proceso de modificacion a nivel logico
        perso.setId(idNueva);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);
        
        //hibernate necesita el metodo save para que sobreescribe sobre el objeto que ya teniamos 
        //guardar persona
        this.savePersona(perso);
        
        
    }
}
