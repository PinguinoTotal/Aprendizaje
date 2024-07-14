package com.TodoCode.PruebaJPA.service;

import com.TodoCode.PruebaJPA.model.Mascota;
import java.util.List;

public interface IMascotaService {
    //metodo para traer a todas las mascotas
    public List<Mascota> getMascotas();
    
    //alta mascota
    public void saveMascota(Mascota masc);
    
    //Baja Mascota
    public void deleteMascota(Long id_mascota);
    
    //lectura de un solo objeto
    public Mascota findMascota(Long id_mascota);
    
    //editarMascota
    public void editMascota(Long idOriginal,
                            Long id_mascotaNueva,
                            String nuevoNombre,
                            String nuevaEspecie,
                            String nuevaRaza,
                            String nuevoColor);
}
