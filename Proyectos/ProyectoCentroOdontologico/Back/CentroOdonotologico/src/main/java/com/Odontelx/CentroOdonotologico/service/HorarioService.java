package com.Odontelx.CentroOdonotologico.service;

import com.Odontelx.CentroOdonotologico.model.Horario;
import com.Odontelx.CentroOdonotologico.repository.IHorarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioService implements IHorarioService{

    @Autowired
    private IHorarioRepository horarioRepo;
    
    @Override
    public List<Horario> getHorarios() {
        return horarioRepo.findAll();
    }
    
    @Override
    public void saveHorario(Horario hor){
        horarioRepo.save(hor);
    }

    @Override
    public Horario findHorario(Long id) {
        return horarioRepo.findById(id).orElse(null);
    }

    @Override
    public void editHorario(Horario nuevHor) {
        this.saveHorario(nuevHor);
    }

    @Override
    public void deleteHorario(Long id) {
        horarioRepo.deleteById(id);
    }
}
