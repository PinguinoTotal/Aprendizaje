package com.TodoCode.PruebaJPA.controller;

import com.TodoCode.PruebaJPA.model.Mascota;
import com.TodoCode.PruebaJPA.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    //se puede tener mas de un controlador, por ende para tener todo más 
    //organizado le hacemos uno a mascota
    
    @Autowired
    private IMascotaService mascoServ;
    //hago regresar todas las mascotas por pura diversion 
    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascotas(){
        return mascoServ.getMascotas();
    }
    
    //para este ejemplo solo voy a hacer el alta para no tener que implemetar 
    //todos los metods 
    
    //agregando una mascota
    @PostMapping("/mascotas/crear")
    public String saveMascota(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
        return "mascota creada con exito";
    }
}
