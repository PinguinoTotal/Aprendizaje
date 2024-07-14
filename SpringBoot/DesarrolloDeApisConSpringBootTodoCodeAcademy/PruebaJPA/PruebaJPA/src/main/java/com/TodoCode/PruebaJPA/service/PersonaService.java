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
        List<Persona> listaPersonas = persoRepo.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
    
    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        
        Persona perso = this.findPersona(idOriginal);
        
        perso.setId(idNueva);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);
        
        this.savePersona(perso);
    }

    //ese solo sirve si no se hacen cambios en el id
    @Override
    public void editPersona(Persona per) {
        this.savePersona(per);
    }
}
