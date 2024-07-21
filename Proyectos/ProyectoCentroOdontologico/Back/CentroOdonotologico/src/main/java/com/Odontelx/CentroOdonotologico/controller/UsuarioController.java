package com.Odontelx.CentroOdonotologico.controller;

import com.Odontelx.CentroOdonotologico.model.Usuario;
import com.Odontelx.CentroOdonotologico.service.IUsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @Autowired
    private IUsuarioService userServ;
    
    //create
    @PostMapping("/usuarios/crear")
    public String saveUsuario(@RequestBody Usuario user){
        userServ.saveUsuario(user);
        return "Usuario creado con exito";
    }
    //read
    //all
    @GetMapping("/usuarios/traerTodos")
    public List<Usuario> getUsuarios(){
        return userServ.getUsuarios();
    }
    //one
    @GetMapping("/usuarios/traer/{id}")
    public Usuario findUsuario(@PathVariable Long id){
        return userServ.findUsuario(id);
    }
    //update
    @PutMapping("/usuarios/edit")
    public String editUsuario(@RequestBody Usuario user){
        userServ.editUsuario(user);
        return "Usuario editado correctamente";
    }
    //delete
    @DeleteMapping("usuarios/delete/{id}")
    public String deleteUsuario(@PathVariable Long id){
        userServ.deleteUsuario(id);
        return "Usuario eliminado correctamente";
    }
}
