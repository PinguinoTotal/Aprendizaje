package com.TodoCode.PruebaJPA.service;

import com.TodoCode.PruebaJPA.model.Mascota;
import com.TodoCode.PruebaJPA.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository repoMasco;
    
    @Override
    public List<Mascota> getMascotas() {
        return repoMasco.findAll();
    }

    @Override
    public void saveMascota(Mascota masc) {
        repoMasco.save(masc);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        repoMasco.deleteById(id_mascota);
    }

    @Override
    public Mascota findMascota(Long id_mascota) {
        return repoMasco.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        //busco la mascota original
        Mascota masco = this.findMascota(idOriginal);
        
        //modificando el registro de forma logica
        masco.setId_mascota(id_mascotaNueva);
        masco.setNombre(nuevoNombre);
        masco.setEspecie(nuevaEspecie);
        masco.setRaza(nuevaRaza);
        masco.setColor(nuevoColor);
        
        //sobreescribiendo el registro 
        this.saveMascota(masco);
    }
    
}
