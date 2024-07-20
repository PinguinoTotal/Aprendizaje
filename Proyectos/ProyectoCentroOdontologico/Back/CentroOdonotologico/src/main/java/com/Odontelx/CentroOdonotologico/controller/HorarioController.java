package com.Odontelx.CentroOdonotologico.controller;

import com.Odontelx.CentroOdonotologico.model.Horario;
import com.Odontelx.CentroOdonotologico.service.IHorarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HorarioController {
    
    @Autowired
    IHorarioService horarioservice;
    
    @GetMapping("/horarios/traerTodos")
    public List<Horario> getHorarios(){
        return horarioservice.getHorarios();
    }
    
    @PostMapping("/horarios/crear")
    public String saveHorario(@RequestBody Horario hor){
        horarioservice.saveHorario(hor);
        return "hoario creado con exito";
    }
    
    @GetMapping("/horarios/traer")
    public Horario findHorario(Long id){
        return horarioservice.findHorario(id);
    }
    
    @PostMapping("/horarios/edit")
    public String editHorario(Horario hor){
        horarioservice.editHorario(hor);
        return "horario editado con exito";        
    }
    
    @PostMapping("/horarios/delete")
    public String deleteHorario(Long id){
        horarioservice.deleteHorario(id);
        return "horario eliminado con exito";
    }
}
