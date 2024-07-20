package com.Odontelx.CentroOdonotologico.service;

import com.Odontelx.CentroOdonotologico.model.Horario;
import java.util.List;

public interface IHorarioService {
    //crud
    
    //traer todos los objetos horario
    public List<Horario> getHorarios();
    
    //crear un objeto horario
    public void saveHorario(Horario hor);
    
    //traer solo un objeto horario
    public Horario findHorario(Long id);
    
    //actualizar un objeto horario
    public void editHorario(Horario nuevHor);
    
    //eliminar un objeto horario
    public void deleteHorario(Long id);
}
