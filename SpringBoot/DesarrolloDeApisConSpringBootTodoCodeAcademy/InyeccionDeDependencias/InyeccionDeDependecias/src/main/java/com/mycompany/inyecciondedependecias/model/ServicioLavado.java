package com.mycompany.inyecciondedependecias.model;

public class ServicioLavado {
    private ServicioNormal serviNorm;
    private ServicioPremium serviPrem;

    //la inyeccion de dependencias se basa en no hacer nuevois objetos, 
    //si no que solo crearlos una ves y reusarlos
    
    //inyeccion de dependencias por constructores
    public ServicioLavado(ServicioNormal serviNorm, ServicioPremium serviPrem) {
        this.serviNorm = serviNorm;
        this.serviPrem = serviPrem;
    }
    
    //inyeccion de dependencias por set
    public void setServiNorm(ServicioNormal serviNorm) {
        this.serviNorm = serviNorm;
    }

    public void setServiPrem(ServicioPremium serviPrem) {
        this.serviPrem = serviPrem;
    }
    
}
