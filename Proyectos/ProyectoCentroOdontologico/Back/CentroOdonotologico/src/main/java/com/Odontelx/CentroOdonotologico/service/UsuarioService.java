package com.Odontelx.CentroOdonotologico.service;

import com.Odontelx.CentroOdonotologico.model.Usuario;
import com.Odontelx.CentroOdonotologico.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private IUsuarioRepository userRepo;

    @Override
    public void saveUsuario(Usuario user) {
        userRepo.save(user);
    }

    @Override
    public List<Usuario> getUsuarios() {
        return userRepo.findAll();
    }

    @Override
    public Usuario findUsuario(Long id) {
        return userRepo.findById(id).orElse(null);
    }

    @Override
    public void editUsuario(Usuario user) {
        this.saveUsuario(user);
    }

    @Override
    public void deleteUsuario(Long id) {
        userRepo.deleteById(id);
    }
    
}
