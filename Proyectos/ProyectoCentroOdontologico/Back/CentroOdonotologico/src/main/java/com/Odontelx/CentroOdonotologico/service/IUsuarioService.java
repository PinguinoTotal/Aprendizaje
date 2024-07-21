package com.Odontelx.CentroOdonotologico.service;

import com.Odontelx.CentroOdonotologico.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    //crud
    //create 
    public void saveUsuario(Usuario user);
    //read
    //get all
    public List<Usuario> getUsuarios();
    //get one
    public Usuario findUsuario(Long id);
    //update
    public void editUsuario(Usuario user);
    //delete
    public void deleteUsuario(Long id);
    
}
        

    

