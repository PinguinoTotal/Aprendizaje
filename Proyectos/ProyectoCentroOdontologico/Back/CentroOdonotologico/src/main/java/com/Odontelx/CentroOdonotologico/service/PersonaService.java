package com.Odontelx.CentroOdonotologico.service;

import com.Odontelx.CentroOdonotologico.model.Persona;
import com.Odontelx.CentroOdonotologico.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private IPersonaRepository perRepo;
    
    @Override
    public void savePersona(Persona per) {
        perRepo.save(per);
    }

    @Override
    public List<Persona> getPersonas() {
        return perRepo.findAll();
    }

    @Override
    public Persona findPersona(Long id) {
        return perRepo.findById(id).orElse(null);
    }

    @Override
    public void editPersona(Persona per) {
        this.savePersona(per);
    }

    @Override
    public void deletePersona(Long id) {
        perRepo.deleteById(id);
    }
    
}
